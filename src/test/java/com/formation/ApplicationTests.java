package com.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.formation.service.Calculator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
         assertEquals(5, calculator.sum(2, 3));
    }

}
