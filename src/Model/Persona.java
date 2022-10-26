package Model;

public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correoElectronico;

    public Persona(String nombre,String cedula,String telefono,String correoElectronico) {
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.correoElectronico=correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
