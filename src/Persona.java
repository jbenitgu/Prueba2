public class Persona {
    private String nombre;
    private int anioNacimiento;
    private String Pais;
    private String tipoDocumento;
    private  String numDocumento;
    private Corazon cor;

    public Persona(){
        System.out.println("ejecutado desde constructor");
    }


    public String getNombre() {
        return nombre;
    }

    /*
    public void modidicarNombre(String nombre) {
        this.nombre = nombre;
    }
    */

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Corazon getCor() {
        return cor;
    }

    public void setCor(Corazon cor) {
        this.cor = cor;
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }



    void caminar(){
        System.out.println("caminando ...");
    }

    void hablar(){
        System.out.println("hablando ...");
    }

    void saltar(){
        System.out.println("saltando ...");
    }
    void comer(){
        System.out.println("comiendo...");
    }

    void respirar(){
        System.out.println("respirando ...");
    }
}
