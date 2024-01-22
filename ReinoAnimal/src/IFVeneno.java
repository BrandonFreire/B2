public class IFVeneno {
    private String actividad;
    private String color;
    /**
     * constructor sin parametros
     */
    public IFVeneno() {
    }
    /**
     * constructor con parameteros
     * @param actividad
     * @param color
     */
    public IFVeneno(String actividad, String color) {
        this.actividad = actividad;
        this.color = color;
    }
    /**
     * getter/setter
     */
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * metodo
     */
    public void liberarVeneno(){
        System.out.println("*veneno liberado*");
    }
}
