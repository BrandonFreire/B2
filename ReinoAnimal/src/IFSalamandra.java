public class IFSalamandra extends IFAnfibio implements IIFNada, IIFCorre{
    public IFPielPermeable pielPermeable;
    public IFPatas patas;   
    /**
     * Constructor
     * @param esqueleto
     * @param patas
     */
    public IFSalamandra(boolean esqueleto) {
        super(esqueleto);
    }
    /**
     * Metodo 
     */
    void nacer(){
        pielPermeable = new IFPielPermeable();
        patas = new IFPatas();

        System.out.println("Soy una salamandra");
        getPielPermeable().setStructura("respiración cutánea y la regulación del equilibrio hídrico");
        getPielPermeable().setColor("cambiante por mi habilidad para camuflarme");
        System.out.println("Mi piel es de una estructura que permite la "+getPielPermeable().getStructura());
        System.out.println("y de un color "+getPielPermeable().getColor());

        getPatas().setForma("presentan almohadillas en cada dedo");
        getPatas().setTextura("suave y humeda");
        getPatas().setColor("color variado con patrones");
        System.out.println("Mis patas: "+getPatas().getForma());
        System.out.println("de una textura "+getPatas().getTextura());
        System.out.println("y de un "+getPatas().getColor());

        System.out.print("Ahora ");
        nadar();
        correr();
        pielPermeable.respirar();

        IFRana ambiente = new IFRana(true);
        ambiente.ambiente();

    }
    public void ambiente(){
        System.out.println("Me adapto perfectamente al entorno con una salamandra");
    }

    @Override
    public void nadar() {
        System.out.println("estoy nadando ");
    }
    @Override
    public void correr() {
        System.out.println("estoy corriendo");
    }

}
