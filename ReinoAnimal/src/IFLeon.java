public class IFLeon extends IFMamifero implements IIFCorre{
    /**
     * @param glandulaMamaria
     * @param pelaje
     */
    public IFLeon(boolean esqueleto) {
        super(esqueleto);
    }
    
    void nacer(){
        System.out.println("Soy un leon");
        getGlandulaMamaria().desarrolloGlandulaMamaria(false);
        getGlandulaMamaria().setForma("conica");
        getGlandulaMamaria().setTamanio(3);
        getGlandulaMamaria().setColor(null);  
        System.out.println("Tengo una glandula mamaria menos desarrollada de forma "+getGlandulaMamaria().getForma());
        System.out.println("y de un tamanio "+getGlandulaMamaria().getTamanio()+" cm");
        
        getPelaje().setColor("amarillo");
        getPelaje().setTextura("corta y suave");
        System.out.println("Mi pelaje es "+getPelaje().getColor());
        System.out.println("y su textura es "+getPelaje().getTextura());

        System.out.print("Ahora ");
        correr();
        //System.out.println("");
        IFCebra comida = new IFCebra(true);
        comida.devorado();


    }

    @Override
    public void correr() {
        System.out.println("estoy corriendo");
    }
}
