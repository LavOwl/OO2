package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PermanentTest {
    Permanent per;

    @BeforeEach
    public void setUp(){
        per = new Permanent(false, 0, 0);
    }

    @Test
    public void testSaldo(){
        assertEquals(per.getSalary(), 43500);
        per.setMarried(true);
        assertEquals(per.getSalary(), 48250);
        per.setChildren(1);
        assertEquals(per.getSalary(), 50150);
        per.setChildren(2);
        assertEquals(per.getSalary(), 52050);
        per.addYear();
        assertEquals(per.getSalary(), 53950);
        per.addYear();
        assertEquals(per.getSalary(), 55850);
        per.setMarried(false);
        assertEquals(per.getSalary(), 51100);
        per.setChildren(0);
        assertEquals(per.getSalary(), 47300);
        per.setMarried(true);
        assertEquals(per.getSalary(), 52050);
    }
}
