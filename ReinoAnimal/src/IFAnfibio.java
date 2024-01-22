public abstract class IFAnfibio extends IFVertebrado{
    public IFPielPermeable pielPermeable;
    public IFPatas patas;
    /**
     * Constructor
     * @param esqueleto
     * @param patas
     */
    public IFAnfibio(boolean esqueleto, IFPatas patas) {
        super(esqueleto);
        pielPermeable = new IFPielPermeable();
        this.patas = patas;
    }
}
