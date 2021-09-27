//package Proyecto;
public class Museo extends Localidad{
    private String tipoMuseo;
    public Museo(String nombre, String direccion, String horario, String contacto, String precio, String tipoMuseo) {
        super(nombre, direccion, horario, contacto, precio);
        this.tipoMuseo = tipoMuseo;
    }

    public String getTipoMuseo() {
        return tipoMuseo;
    }
    public void setTipoMuseo(String tipoMuseo) {
        this.tipoMuseo = tipoMuseo;
    }

}