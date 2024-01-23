public class IFCorrecaminos extends IFAve implements IIFCorreAve{
    /**
     * constructor
     * @param esqueleto
     * @param pluma
     */
    public IFCorrecaminos(boolean esqueleto) {
        super(esqueleto);
    }

    void nacer() {
        System.out.println("Soy un correcaminos");

        getPico().setColor("negro");
        getPico().setTamanio(5);
        System.out.println("El color de mi pico es "+getPico().getColor());
        System.out.println("El tamanio de mi pico es "+getPico().getTamanio()+" cm");

        getPluma().setColor("amarillo palido");
        getPluma().setForma("comun");
        getPluma().setTamanio(3);

        System.out.println("El color de mis plumas es "+getPluma().getColor());
        System.out.println("su forma es "+getPluma().getForma());
        System.out.println("y su tamanio es "+getPluma().getTamanio()+" cm");

        System.out.print("Ahora ");
        correr();
        getPico().comer();
        getPico().tomarAgua();
    }

    @Override
    public void correr() {
        System.out.println("estoy corriendo");
    }

}
