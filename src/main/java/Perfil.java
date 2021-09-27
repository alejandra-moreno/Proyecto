//package Proyecto;
public class Perfil {

    //Inicio de sesión
    private String clave = null;
    private String usuario = null;
    //Caracteristicas usuario
    private String nombreCompleto;
    private int edad;
    private String nacionlidad;
    private String descripcion;
    //Opcional
    private int telefono = 0;
    private String correo = null;


    public Perfil(String nombreCompleto, int edad, String nacionlidad, String descripcion, int telefono, String correo,String usuario, String clave) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.nacionlidad = nacionlidad;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
    }



    public String getUsuario() {
        return usuario;
    }
    public String getClave() {
        return clave;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public int getEdad() {
        return edad;
    }
    public String getNacionalidad() {
        return nacionlidad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionlidad = nacionalidad;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString()
    {
        return nombreCompleto + edad + nacionlidad;
    }

}
