public class IFHalcon extends IFAve implements IIFVuela{
    public IFPico pico;
    public IFPluma pluma;
    
    /**
     * Constructor
     * @param esqueleto
     * @param pluma
     */
    public IFHalcon(boolean esqueleto, IFPluma pluma) {
        super(esqueleto, pluma);
    }

    void nacer() {
        System.out.println("Soy un halcon");
        pico = new IFPico();
        pluma = new IFPluma();

        pico.comer();
        pico.tomarAgua();
        pico.setColor("amarillo con la punta negra");
        pico.setTamanio(8);
        System.out.println("El color de mi pico es "+pico.getColor());
        System.out.println("El tamanio de mi pico es "+pico.getTamanio()+" cm");

        pluma.setColor("gris");
        pluma.setForma("comun");
        pluma.setTamanio(4);

        System.out.println("El color de mis plumas es "+pluma.getColor());
        System.out.println("El tamanio de mis plumas es "+pluma.getTamanio()+" cm");

        System.out.print("Ahora ");
        volar();
    }

    @Override
    public void volar() {
        System.out.println("estoy volando");
    }


}
