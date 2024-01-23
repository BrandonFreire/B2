public abstract class IFAve extends IFVertebrado{
    public IFPico pico;
    public IFPluma pluma;
    /**
     * 
     * @param esqueleto
     */
    public IFAve(boolean esqueleto) {
        super(esqueleto);
        this.pico = new IFPico();
        this.pluma = new IFPluma();
    }
    /**
     * 
     * @return
     */
    public IFPico getPico() {
        return pico;
    }

    public void setPico(IFPico pico) {
        this.pico = pico;
    }

    public IFPluma getPluma() {
        return pluma;
    }

    public void setPluma(IFPluma pluma) {
        this.pluma = pluma;
    }
}
