public class IFPato extends IFAve implements IIFVuela, IIFNada {
    public IFPico pico;
    public IFPluma pluma;

    public IFPato(boolean esqueleto, IFPluma pluma) {
        super(esqueleto, pluma);
        
    }

    void nacer() {
        pico = new IFPico();
        pluma = new IFPluma();

        System.out.println("Soy un pato");

        pico.setColor("amarillo");
        pico.setTamanio(10);
        System.out.println("El color de mi pico es "+pico.getColor());
        System.out.println("El tamanio de mi pico es "+pico.getTamanio()+" cm");

        pluma.setColor("verde");
        pluma.setForma("comun");
        pluma.setTamanio(3);

        System.out.println("El color de mis plumas es "+pluma.getColor());
        System.out.println("El tamanio de mis plumas es "+pluma.getTamanio()+" cm");

        System.out.println("Ahora ");
        volar();
        nadar();
        pico.comer();
        pico.tomarAgua();
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
