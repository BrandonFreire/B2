public class IFPato extends IFAve implements IIFVuela, IIFNada {
    /**
     * Constructor
     * @param esqueleto
     * @param pluma
     */
    public IFPato(boolean esqueleto) {
        super(esqueleto);
    }
    void nacer() {
        System.out.println("Soy un pato");

        getPico().setColor("amarillo");
        getPico().setTamanio(10);
        System.out.println("El color de mi pico es " + getPico().getColor());
        System.out.println("El tamanio de mi pico es " + getPico().getTamanio() + " cm");

        getPluma().setColor("verde");
        getPluma().setForma("comun");
        getPluma().setTamanio(5);

        System.out.println("El color de mis plumas es " + getPluma().getColor());
        System.out.println("El tamanio de mis plumas es " + getPluma().getTamanio() + " cm");

        System.out.print("Ahora ");
        volar();
        nadar();
        getPico().comer();
        getPico().tomarAgua();
    }

    @Override
    public void volar() {
        System.out.println("estoy volando");
    }

    @Override
    public void nadar() {
        System.out.println("estoy nadando");
    }

}
