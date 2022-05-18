public class Persona {
    private String nombre, apellido;
    private int idPersona, edadPersona;
    private static int contadorPersona = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public Persona(int idPersona, String nombre, String apellido, int edadPersona){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edadPersona = edadPersona;
        contadorPersona++;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + idPersona + ", nombre=" + nombre +  ", edad=" + edadPersona + "}";
    }
}
