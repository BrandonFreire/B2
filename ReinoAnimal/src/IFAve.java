public abstract class IFAve extends IFVertebrado{
    public IFPico pico;
    public IFPluma pluma;

    public IFAve(boolean esqueleto, IFPluma pluma) {
        super(esqueleto);
        this.pico = new IFPico();
        this.pluma = pluma;
    }
}
