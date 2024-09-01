package Clases;

public class Principal {
    public static void main(String[] args) {

        // Instancia de una clase, crear un objeto de la clase persona
        Persona persona1 = new Persona();

        persona1.setPrimerNombre("Sandro");
        persona1.setSegundoNombre("Williams");
        persona1.setApellidoPaterno("Ponte");
        persona1.setApellidoMaterno("Ramirez");
        persona1.setGenero("M");
        persona1.setEdad(20);
        persona1.setTalla(1.76);
        persona1.setEstadoCivil(false);

        Persona persona2 = new Persona();
        persona2.setPrimerNombre("Juan");
        persona2.setSegundoNombre("José");
        persona2.setApellidoPaterno("Ponte");
        persona2.setApellidoMaterno("Ramirez");
        persona2.setGenero("M");
        persona2.setEdad(28);
        persona2.setTalla(1.86);
        persona2.setEstadoCivil(true);

        /*Persona persona3 = new Persona("Julio","César", "Rodriguez", "López","M", 30, 1.67,true);
        Persona persona4 = new Persona("Julio","Mariano", "Rodriguez", "López","M", 30, 1.67,true);*/

        //System.out.println("Imprimiendo persona 3: " + persona3.primerNombre);

        /*System.out.println("Imprimiendo persona 1: " + persona1.getPrimerNombre());
        System.out.println("Imprimiendo persona 2: " + persona2.getPrimerNombre());
        System.out.println("Imprimiendo persona 3: " + persona3.getPrimerNombre());
        System.out.println("Imprimiendo persona 3: " + persona4.getPrimerNombre() + " - " + persona4.getSegundoNombre());*/
    }
}
