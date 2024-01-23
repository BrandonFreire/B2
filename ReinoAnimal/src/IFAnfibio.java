public abstract class IFAnfibio extends IFVertebrado{
    public IFPielPermeable pielPermeable;
    public IFPatas patas;
    /**
     * Constructor
     * @param esqueleto
     * @param patas
     */
    public IFAnfibio(boolean esqueleto) {
        super(esqueleto);
        pielPermeable = new IFPielPermeable();
        this.patas = new IFPatas();
    }
    /**
     * getter/setter
     * @return
     */
    public IFPielPermeable getPielPermeable() {
        return pielPermeable;
    }
    public void setPielPermeable(IFPielPermeable pielPermeable) {
        this.pielPermeable = pielPermeable;
    }
    public IFPatas getPatas() {
        return patas;
    }
    public void setPatas(IFPatas patas) {
        this.patas = patas;
    }
}
