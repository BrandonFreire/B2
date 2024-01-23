public class IFHalcon extends IFAve implements IIFVuela{
    /**
     * Constructor
     * @param esqueleto
     * @param pluma
     */
    public IFHalcon(boolean esqueleto) {
        super(esqueleto);
    }

    void nacer() {
        System.out.println("Soy un halcon");

        getPico().setColor("amarillo con la punta negra");
        getPico().setTamanio(8);
        System.out.println("El color de mi pico es "+getPico().getColor());
        System.out.println("El tamanio de mi pico es "+getPico().getTamanio()+" cm");

        getPluma().setColor("gris");
        getPluma().setForma("comun");
        getPluma().setTamanio(4);

        System.out.println("El color de mis plumas es "+getPluma().getColor());
        System.out.println("El tamanio de mis plumas es "+getPluma().getTamanio()+" cm");

        System.out.print("Ahora ");
        volar();
        getPico().comer();
        getPico().tomarAgua();
    }

    @Override
    public void volar() {
        System.out.println("estoy volando");
    }


}
