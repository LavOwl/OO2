package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporaryTest {
    Temporary tem;

    @BeforeEach
    public void setUp(){
        tem = new Temporary(false, 0, 0);
    }

    @Test
    public void testSaldo(){
        assertEquals(tem.getSalary(), 17400);
        tem.setMarried(true);
        assertEquals(tem.getSalary(), 22150);
        tem.setChildren(1);
        assertEquals(tem.getSalary(), 24050);
        tem.setChildren(2);
        assertEquals(tem.getSalary(), 25950);
        tem.setHoursWorked(1);
        assertEquals(tem.getSalary(), 26211);
        tem.setHoursWorked(2);
        assertEquals(tem.getSalary(), 26472);
        tem.setMarried(false);
        assertEquals(tem.getSalary(), 21722);
        tem.setChildren(0);
        assertEquals(tem.getSalary(), 17922);
        tem.setMarried(true);
        assertEquals(tem.getSalary(), 22672);
    }
}
