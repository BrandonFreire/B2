public class IFAgalla {
    private double tamanio;
    /**
     * Constructor sin parametros
     */
    public IFAgalla() {
    }

    /**
     * Constructor con parametros 
     * @param tamanio
     */
    public IFAgalla(double tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * getter/setter
     * @return
     */
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void respirar(){
        System.out.println("Estoy respirando");   
    }
}
