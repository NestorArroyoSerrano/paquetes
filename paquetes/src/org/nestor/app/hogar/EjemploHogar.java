package org.nestor.app.hogar;

import org.nestor.app.jardin.Perro;
import static org.nestor.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = Persona.saludar();
    }
}
