public class Empleado extends Persona{


    private int idEmpleado, sueldo;

    public Empleado(int idEmpleado,  String nombre, String apellido, int edadPersona, int idPersona, int sueldo) {
        super(idPersona, nombre, apellido, edadPersona);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
