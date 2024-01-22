public class IFGlandulaMamaria {
    private double tamanio;
    private String color;
    private String forma;

    public IFGlandulaMamaria(){}

    /**
     * Constructor
     * @param tamanio
     * @param color
     */
    public IFGlandulaMamaria(double tamanio, String color) {
        this.tamanio = tamanio;
        this.color = color;
    }


    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean desarrolloGlandulaMamaria(boolean bandera){
        return bandera;
    }
}
