public class Main {
    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
     * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
     * atributos: nombre, apellido, edad, documento y Perro.
     * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
     * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
     * la clase Persona, la información del Perro y de la Persona.
     * @param args
     */
    public static void main(String[] args) {

        Dog d1 = new Dog("lili","pull",3,"grande");
        Dog d2 = new Dog("lila","poll",5,"chico");;
       // Person p1 = new Person("pepe","Lopez",22,"Adoc234",d1);
       // Person p2 = new Person("pepa","Pig",22,"Ad345234",d2);

        Person p1 = new Person();
        Person p2 = new Person();

        p1.setDog(d1);
        p2.setDog(d2);
        System.out.println(p1);
        System.out.println(p2);


    }
}