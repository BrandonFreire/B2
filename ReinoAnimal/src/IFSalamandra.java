public class IFSalamandra extends IFAnfibio implements IIFNada, IIFCorre{
    public IFPielPermeable pielPermeable;
    public IFPatas patas;   
    /**
     * Constructor
     * @param esqueleto
     * @param patas
     */
    public IFSalamandra(boolean esqueleto, IFPatas patas) {
        super(esqueleto, patas);
    }
    /**
     * Metodo 
     */
    void nacer(){
        pielPermeable = new IFPielPermeable();
        patas = new IFPatas();

        System.out.println("Soy una salamandra");
        pielPermeable.setStructura("respiración cutánea y la regulación del equilibrio hídrico");
        pielPermeable.setColor("cambiante por mi habilidad para camuflarme");
        System.out.println("Mi piel es de una estructura que permite la "+pielPermeable.getStructura());
        System.out.println("y de un color "+pielPermeable.getColor());

        patas.setForma("presentan almohadillas en cada dedo");
        patas.setTextura("suave y humeda");
        patas.setColor("color variado con patrones");
        System.out.println("Mis patas: "+patas.getForma());
        System.out.println("de una textura "+patas.getTextura());
        System.out.println("y de un "+patas.getColor());

        System.out.print("Ahora ");
        nadar();
        correr();
        pielPermeable.respirar();

        IFRana ambiente = new IFRana(true, patas);
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
