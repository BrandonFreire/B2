public abstract class IFPez extends IFVertebrado{
    public IFAgalla agallas;
    public IFCamuflaje camuflaje;
    /**
     * Constructor
     * @param esqueleto
     * @param camuflaje
     */
    public IFPez(boolean esqueleto, IFCamuflaje camuflaje) {
        super(esqueleto);
        agallas = new IFAgalla();
        this.camuflaje = camuflaje;
    }

}
