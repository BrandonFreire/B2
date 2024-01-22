public class IFPluma {
    private double tamanio;
    private String color;
    private String forma;

    public IFPluma(){}

    public IFPluma(double tamanio, String color, String forma) {
        this.tamanio = tamanio;
        this.color = color;
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
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }


}
