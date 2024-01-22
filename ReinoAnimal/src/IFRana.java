public class IFRana extends IFAnfibio implements IIFNada, IIFSalta{
    public IFPielPermeable pielPermeable;
    public IFPatas patas;
    /**
     * Constructor 
     * @param esqueleto
     * @param patas
     */
    public IFRana(boolean esqueleto, IFPatas patas) {
        super(esqueleto, patas);
    }
    /**
     * Metodo
     */
    void nacer(){
        pielPermeable = new IFPielPermeable();
        patas = new IFPatas();

        System.out.println("Soy una rana");
        pielPermeable.setStructura("permeable al agua y al aire");
        pielPermeable.setColor("cambiante por mi habilidad para camuflarme");
        System.out.println("Mi piel es de una estructura "+pielPermeable.getStructura());
        System.out.println("y de un color "+pielPermeable.getColor());

        patas.setForma("posteriores largas y delanteras cortas");
        patas.setTextura("humeda");
        patas.setColor("color brillante");
        System.out.println("Mis patas: "+patas.getForma());
        System.out.println("de una textura "+patas.getTextura());
        System.out.println("y de un "+patas.getColor());

        System.out.print("Ahora ");
        nadar();
        saltar();
        pielPermeable.respirar();

        IFSalamandra salamandra = new IFSalamandra(true, patas);
        salamandra.ambiente();

    }

    public void ambiente(){
        System.out.println("Me adapto perfectamente al entorno con una rana");
    }

    @Override
    public void nadar() {
        System.out.println("estoy nadando");
    }
    @Override
    public void saltar() {
        System.out.println("estoy saltando");
    }

}
