import java.util.Date;

public class Cliente extends Persona{


    private int idCliente;
    private Date fechaRegistro;

    public Cliente( int idCliente, String nombre, String apellido, int edadPersona, int idPersona){
        super(idPersona, nombre, apellido, edadPersona);
        this.idCliente = idCliente;
        fechaRegistro = new Date();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
