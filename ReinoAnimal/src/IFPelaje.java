public class IFPelaje {
    private String color;
    private String textura;
    /**
     * Constructor sin parametros 
     */
    public IFPelaje(){}
    /** 
     * Constructor con parametros
     * @param color
     * @param textura
     */
    public IFPelaje(String color, String textura) {
        this.color = color;
        this.textura = textura;
    }
    /** getter/setter
     * 
     * @return
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
}
