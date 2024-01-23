public abstract class IFMamifero extends IFVertebrado{
    public IFGlandulaMamaria glandulaMamaria;
    public IFPelaje pelaje;
        /**
     * Consctrutor con parametros
     * @param esqueleto
     * @param pelaje
     */
    public IFMamifero(boolean esqueleto) {
        super(esqueleto);
        this.glandulaMamaria = new IFGlandulaMamaria();
        this.pelaje = new IFPelaje();
    }
    /**
     * getter/setter
     * @return
     */
    public IFGlandulaMamaria getGlandulaMamaria() {
        return glandulaMamaria;
    }
    public void setGlandulaMamaria(IFGlandulaMamaria glandulaMamaria) {
        this.glandulaMamaria = glandulaMamaria;
    }
    public IFPelaje getPelaje() {
        return pelaje;
    }
    public void setPelaje(IFPelaje pelaje) {
        this.pelaje = pelaje;
    }
}
