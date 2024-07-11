package org.nestor.app.jardin;

// import org.nestor.app.hogar.Gato;
// import org.nestor.app.hogar.Perro;
// import org.nestor.app.hogar.Persona;
import org.nestor.app.hogar.*;
import static org.nestor.app.hogar.Persona.*;
import static org.nestor.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

       Persona p = new Persona();
        p.setNombre("Andrés");
        p.setApellido("Guzmán");
        p.setColorPelo(ColorPelo.CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = Persona.GENERO_FEMENINO;
        String generoHombre = Persona.GENERO_MASCULINO;
    }
}
