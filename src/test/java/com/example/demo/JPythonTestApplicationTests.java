package com.example.demo;

import java.math.BigDecimal;

import com.jpython.FirstTest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPythonTestApplicationTests {
	@Autowired
    FirstTest firstTest;

	@Test
    public void calculation() {
        try {
            String code = "calculation";
            String calFormula = "1024/100+11";

            BigDecimal pyobj = firstTest.getPyObject(code,calFormula);
            System.out.println("计算结果为:"+pyobj);
            System.out.println("111");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
