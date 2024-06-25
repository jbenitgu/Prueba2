public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona jose;

        System.out.println("#######################");
        jose = new Persona("PEpito PErez");
        System.out.println("#######################");


        jose.caminar();
        jose.comer();
        //jose.nombre = "Jose Martinez";
        //jose.nombre = "jose";
        //jose.set("Pedro Ruiz Galo");
        //System.out.println(jose.nombre);
        System.out.println("Nombre: : " + jose.getNombre());

        String nnombre = "JEan KArlo";
        String nombre2 = new String("nombre2");

    }
}