package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
    private Biblioteca bib = new Biblioteca();

    @BeforeEach
    public void setUp(){
        bib.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        bib.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));

    }


    @Test
    public void testExportar(){
        String sep = System.lineSeparator();
        assertEquals(bib.exportarSocios(),"[" + sep + "\t" + "{" + sep + "\t\t\"nombre\": \"Arya Stark\"," + sep + "\t\t\"email\": \"needle@stark.com\"," + sep + "\t\t\"legajo\": \"5234-5\"" + sep + "\t}," + sep + "\t{" + sep + "\t\t\"nombre\": \"Tyron Lannister\"," + sep + "\t\t\"email\": \"tyron@thelannisters.com\"," + sep + "\t\t\"legajo\": \"2345-2\"" + sep + "\t}" + sep + "]");
    }

}
