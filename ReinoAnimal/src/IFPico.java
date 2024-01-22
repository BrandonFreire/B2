public class IFPico {
    private double tamanio;
    private String color;

    /**
     * Constructor sin parametros
     */
    public IFPico(){}

    /**
     * Constructor
     * @param tamanio
     * @param color
     */
    public IFPico(double tamanio, String color) {
        this.tamanio = tamanio;
        this.color = color;
    }

    /**getter/setter
     * 
     * @return
     */
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
    /**
     * Metodos
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void tomarAgua(){
        System.out.println("Estoy tomando agua");
    }
}
