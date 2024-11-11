package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassingTest {
    Passing employee;

    @BeforeEach
    public void setUp(){
        employee = new Passing(0);
    }

    @Test
    public void testSaldo(){
        assertEquals(employee.getSalary(), 17400);
        employee.passExam();
        assertEquals(employee.getSalary(), 19300);
        employee.passExam();
        assertEquals(employee.getSalary(), 21200);
    }
}
