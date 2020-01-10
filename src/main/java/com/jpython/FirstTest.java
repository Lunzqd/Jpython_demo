package com.jpython;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Properties;

import com.entity.TestEntity;
import com.interfaces.IFirstTest;

import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FirstTest {

    @Autowired
    IFirstTest iFirstTest;

    public static void main(String [] args){

        // 1
        // PythonInterpreter interpreter = new PythonInterpreter();
        // interpreter.exec("a=[5,2,3,9,4,0]");
        // interpreter.exec("print(sorted(a,reverse=True))"); 

        // 2
        // PythonInterpreter interpreter =  new PythonInterpreter();
        // interpreter.execfile("D:\\add.py");

        // PyFunction pyFunction = interpreter.get("add",PyFunction.class);
        // int a = 5;
        // int b = 10;

        // PyObject pyobj = pyFunction.__call__(new PyInteger(a),new PyInteger(b));
        // System.out.println("the anwser is:" + pyobj);

        // 3
        //    String code = "calculator";
        //    String method = "add";
        //     name(code,method);
    }

    //调用python计算
    public BigDecimal getPyObject(String code, String calFormula) throws Exception {
        PyFunction func = null;
        Properties props = new Properties();
        BigDecimal result = BigDecimal.ZERO;
        try {
            // props.put("python.home", "./jython-2.7.1");
            // props.put("python.console.encoding", "UTF-8");
            // props.put("python.security.respectJavaAccessibility", "false");
            // props.put("python.import.site", "false");
            // Properties preprops = System.getProperties();
            // PythonInterpreter.initialize(preprops, props, new String[0]);

            TestEntity script = iFirstTest.selectByCode(code);
            PythonInterpreter interpreter = new PythonInterpreter();
            interpreter.exec(script.getText());
            func = interpreter.get("calc", PyFunction.class);
            PyObject pyobj = func.__call__(new PyString(calFormula));

            String pyobjStr = PyString.asName(pyobj);
            result = new BigDecimal(pyobjStr);
            DecimalFormat df = new DecimalFormat("#.00");
            result = new BigDecimal(df.format(result));
            interpreter.close();
        } catch (Exception e) {
            throw new Exception("计算逻辑错误！");
        }
        return result;
    }
}