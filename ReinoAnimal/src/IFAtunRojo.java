public class IFAtunRojo extends IFPez implements IIFNada {
    public IFAgalla agalla;
    public IFCamuflaje camuflaje;
    /**
     * Constructor
     * @param esqueleto
     * @param camuflaje
     */
    public IFAtunRojo(boolean esqueleto, IFCamuflaje camuflaje) {
        super(esqueleto, camuflaje);
    }
    /**
     * Metodo
     */
    void nacer(){
        agalla = new IFAgalla();
        camuflaje = new IFCamuflaje();

        System.out.println("Soy un atun rojo");
        agalla.setTamanio(15);
        System.out.println("Mis agallas son de tamaño "+agalla.getTamanio()+" cm");

        camuflaje.setColor("dorso azul oscuro a negro y, los lados y el vientre plateados o blancos");
        System.out.println("El color de mi camuflaje es "+camuflaje.getColor());

        System.out.print("Ahora ");
        nadar();

        
    } 
    public void comida(){
        System.out.println("El atun rojo ha sido devorado");
    }
    @Override
    public void nadar() {
        System.out.println("el atun rojo está nadando");
    }


}