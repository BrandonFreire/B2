public class IFCebra extends IFMamifero implements IIFCorre {
    public IFGlandulaMamaria glandulaMamaria;
    public IFPelaje pelaje;

    public IFCebra(boolean esqueleto, IFPelaje pelaje) {
        super(esqueleto, pelaje);
        
    }

    public void nacer(){
        glandulaMamaria = new IFGlandulaMamaria();
        pelaje = new IFPelaje();

        System.out.println("Soy una cebra");
        glandulaMamaria.desarrolloGlandulaMamaria(true); //es hembra
        glandulaMamaria.setColor("blanco");
        glandulaMamaria.setForma("redondeada");
        glandulaMamaria.setTamanio(10);
        System.out.println("Tengo glandulas mamarias desarrolladas de forma "+glandulaMamaria.getForma());
        System.out.println("y de un tamanio "+glandulaMamaria.getTamanio()+" cm");

        System.out.print("Ahora ");
        correr();        
    }

    public void devorado(){
        System.out.println("La cebra ha sido devorada por el leon");
    }

    @Override
    public void correr() {
        System.out.println("estoy corriendo");
    }

}
