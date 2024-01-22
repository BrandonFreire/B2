public class IFLeon extends IFMamifero implements IIFCorre{
    public IFGlandulaMamaria glandulaMamaria;
    public IFPelaje pelaje;

    /**
     * @param glandulaMamaria
     * @param pelaje
     */
    public IFLeon(boolean esqueleto, IFPelaje pelaje) {
        super(esqueleto, pelaje);

    }
    
    void nacer(){
        glandulaMamaria = new IFGlandulaMamaria();
        pelaje = new IFPelaje();

        System.out.println("Soy un leon");
        glandulaMamaria.desarrolloGlandulaMamaria(false);
        glandulaMamaria.setForma("conica");
        glandulaMamaria.setTamanio(3);
        glandulaMamaria.setColor("");  
        System.out.println("Tengo una glandula mamaria menos desarrollada de forma "+glandulaMamaria.getForma());
        System.out.println("y de un tamanio "+glandulaMamaria.getTamanio()+" cm");
        
        pelaje.setColor("amarillo");
        pelaje.setTextura("corta y suave");
        System.out.println("Mi pelaje es "+pelaje.getColor());
        System.out.println("y su textura es "+pelaje.getTextura());

        System.out.print("Ahora ");
        correr();
        //System.out.println("");
        IFCebra comida = new IFCebra(true, pelaje);
        comida.devorado();


    }

    @Override
    public void correr() {
        System.out.println("estoy corriendo");
    }
    /**
     * falta arraysslist
     */

}
