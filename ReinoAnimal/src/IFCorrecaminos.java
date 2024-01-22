public class IFCorrecaminos extends IFAve implements IIFCorreAve{
    public IFPico pico;
    public IFPluma pluma;
    /**
     * constructor
     * @param esqueleto
     * @param pluma
     */
    public IFCorrecaminos(boolean esqueleto, IFPluma pluma) {
        super(esqueleto, pluma);
    }

    void nacer() {
        System.out.println("Soy un correcaminos");
        pico = new IFPico();
        pluma = new IFPluma();

        pico.setColor("negro");
        pico.setTamanio(5);
        System.out.println("El color de mi pico es "+pico.getColor());
        System.out.println("El tamanio de mi pico es "+pico.getTamanio()+" cm");

        pluma.setColor("amarillo palido");
        pluma.setForma("comun");
        pluma.setTamanio(3);

        System.out.println("El color de mis plumas es "+pluma.getColor());
        System.out.println("su forma es "+pluma.getForma());
        System.out.println("y su tamanio es "+pluma.getTamanio()+" cm");

        System.out.print("Ahora");
        correr();
    }

    @Override
    public void correr() {
        System.out.println("estoy corriendo");
        pico.comer();
        pico.tomarAgua();
    }

}
