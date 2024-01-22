public class IFSerpienteDeCascabel extends IFReptil implements IIFRepta{
    public IFVeneno veneno;
    public IFCamuflajeReptil camuflajeReptil;
    /**
     * Constructor
     * @param esqueleto
     * @param camuflajeReptil
     */
    public IFSerpienteDeCascabel(boolean esqueleto, IFCamuflajeReptil camuflajeReptil) {
        super(esqueleto, camuflajeReptil);
    }
    /**
     * Metodo
     */
    void nacer(){
        veneno = new IFVeneno();
        camuflajeReptil = new IFCamuflajeReptil();

        System.out.println("Soy una serpiente de cascabel");
        veneno.setActividad("hemotoxico"); //afecta principalmente al sistema circulatorio y a la sangre
        veneno.setColor("transparente");
        System.out.println("La actividad de mi veneno es "+veneno.getActividad());
        System.out.println("y su color es "+veneno.getColor());

        camuflajeReptil.setColor("apagado con patrones");
        System.out.println("El color de mi camuflaje es "+camuflajeReptil.getColor());
    
        System.out.print("Ahora ");
        reptar();
    }
    @Override
    public void reptar() {
        System.out.println("estoy reptando");
    }

}
