public class IFPatas {
    private String forma;
    private String textura;
    private String color;
    /**
     * Constructor sin parametros
     */
    public IFPatas() {
    }
    /**
     * Constructor con parametros 
     * @param forma
     * @param textura
     * @param color
     */
    public IFPatas(String forma, String textura, String color) {
        this.forma = forma;
        this.textura = textura;
        this.color = color;
    }
    /** getter/setter
     * 
     * @return
     */
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public String getTextura() {
        return textura;
    }
    public void setTextura(String textura) {
        this.textura = textura;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
