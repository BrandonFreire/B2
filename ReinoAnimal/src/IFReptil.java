public abstract class IFReptil extends IFVertebrado{
    public IFVeneno veneno;
    public IFCamuflajeReptil camuflajeReptil;
    public IFReptil(boolean esqueleto, IFCamuflajeReptil camuflajeReptil) {
        super(esqueleto);
        veneno = new IFVeneno();
        this.camuflajeReptil = camuflajeReptil;
    }

}
