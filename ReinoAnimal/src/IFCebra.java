public class IFCebra extends IFMamifero implements IIFCorre {
    /**
     * 
     * @param esqueleto
     * @param pelaje
     */
    public IFCebra(boolean esqueleto) {
        super(esqueleto);
        
    }

    public void nacer(){
        System.out.println("Soy una cebra");
        getGlandulaMamaria().desarrolloGlandulaMamaria(true); //es hembra
        getGlandulaMamaria().setColor("blanco");
        getGlandulaMamaria().setForma("redondeada");
        getGlandulaMamaria().setTamanio(10);
        System.out.println("Tengo glandulas mamarias desarrolladas de forma "+getGlandulaMamaria().getForma());
        System.out.println("y de un tamanio "+getGlandulaMamaria().getTamanio()+" cm");

        getPelaje().setColor("blanco con lineas negras");
        getPelaje().setTextura("suave y corta");
        System.out.println("El color de mi pelaje es "+getPelaje().getColor());
        System.out.println("y su textura es "+getPelaje().getTextura());

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
