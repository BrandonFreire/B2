public class IFLargartoDeColaLarga extends IFReptil implements IIFCorre{
    public IFVeneno veneno;
    public IFCamuflajeReptil camuflajeReptil;
    /**
     * Constructor
     * @param esqueleto
     * @param camuflajeReptil
     */
    public IFLargartoDeColaLarga(boolean esqueleto, IFCamuflajeReptil camuflajeReptil) {
        super(esqueleto, camuflajeReptil);
    }
    /**
     * Metodo
     */
    void nacer(){
        veneno = new IFVeneno();
        camuflajeReptil = new IFCamuflajeReptil();

        System.out.println("Soy un largato de cola larga");
        System.out.println("No produzco veneno");

        camuflajeReptil.setColor("marrón a grisáceo");
        System.out.println("El color de mi camuflaje es "+camuflajeReptil.getColor());
    
        System.out.print("Ahora ");
        correr();
    }
    @Override
    public void correr() {
        System.out.println(" estoy corriendo");
    }


}
