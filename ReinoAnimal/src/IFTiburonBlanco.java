import java.util.ArrayList;

public class IFTiburonBlanco extends IFPez implements IIFNada {
    public IFAgalla agalla;
    public IFCamuflaje camuflaje;
    /**
     * Constructor
     * @param esqueleto
     * @param camuflaje
     */
    public IFTiburonBlanco(boolean esqueleto, IFCamuflaje camuflaje) {
        super(esqueleto, camuflaje);
    }
    /**
     * Metodo
     */
    void nacer(){
        agalla = new IFAgalla();
        camuflaje = new IFCamuflaje();

        System.out.println("Soy un tiburon blanco");
        agalla.setTamanio(30);
        System.out.println("Mis agallas son de tamaño "+agalla.getTamanio()+" cm");

        camuflaje.setColor("gris azulado");
        System.out.println("El color de mi camuflaje es "+camuflaje.getColor());

        System.out.print("Ahora ");
        nadar();

        IFAtunRojo atunRojo = new IFAtunRojo(true, camuflaje);
        atunRojo.comida();

        ArrayList<IFAtunRojo> atunRojoList = new ArrayList<IFAtunRojo>();
        
    } 

    @Override
    public void nadar() {
        System.out.println("el tiburón blanco está nadando");
    }


}
