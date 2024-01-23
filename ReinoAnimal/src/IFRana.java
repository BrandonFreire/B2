public class IFRana extends IFAnfibio implements IIFNada, IIFSalta{
    /**
     * Constructor 
     * @param esqueleto
     * @param patas
     */
    public IFRana(boolean esqueleto) {
        super(esqueleto);
    }
    /**
     * Metodo
     */
    void nacer(){
        System.out.println("Soy una rana");

        getPielPermeable().setStructura("permeable al agua y al aire");
        getPielPermeable().setColor("cambiante por mi habilidad para camuflarme");
        System.out.println("Mi piel es de una estructura "+getPielPermeable().getStructura());
        System.out.println("y de un color "+getPielPermeable().getColor());

        getPatas().setForma("posteriores largas y delanteras cortas");
        getPatas().setTextura("humeda");
        getPatas().setColor("color brillante");
        System.out.println("Mis patas: "+getPatas().getForma());
        System.out.println("de una textura "+getPatas().getTextura());
        System.out.println("y de un "+getPatas().getColor());

        System.out.print("Ahora ");
        nadar();
        saltar();
        pielPermeable.respirar();

        IFSalamandra salamandra = new IFSalamandra(true);
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
