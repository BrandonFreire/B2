public abstract class IFMamifero extends IFVertebrado{
    public IFGlandulaMamaria glandulaMamaria;
    public IFPelaje pelaje;
    /**
     * Consctrutor con parametros
     * @param esqueleto
     * @param pelaje
     */
    public IFMamifero(boolean esqueleto, IFPelaje pelaje) {
        super(esqueleto);
        this.glandulaMamaria = new IFGlandulaMamaria();
        this.pelaje = pelaje;
    }

}
