public class IFPielPermeable {
    private String estructura;
    private String color;


    /**
     * Constructor sin parametros
     */
    public IFPielPermeable (){}
    /**
     * Constructor
     * @param structura
     * @param color
     */
    public IFPielPermeable(String structura, String color) {
        this.estructura = structura;
        this.color = color;
    }

    /** getter/setter
     * 
     */
    public String getStructura() {
        return estructura;
    }
    public void setStructura(String structura) {
        this.estructura = structura;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodos
     */
    public void respirar(){
        System.out.println("Estoy respirando");
    }


}
