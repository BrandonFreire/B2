public class IFNaturaleza {
    /**
     * Aves
     */
    public static IFCorrecaminos correcaminos;
    public static IFPato pato;
    public static IFHalcon halcon;
    /**
     * Mamiferos
     */
    public static IFLeon leon;
    public static IFCebra cebra;
    /**
     * Anfibios
     */
    public static IFRana rana;
    public static IFSalamandra salamandra;
    /**
     * Peces
     */
    public static IFTiburonBlanco tiburonBlanco;
    public static IFAtunRojo atunRojo;
    /**
     * Reptiles
     */
    public static IFSerpienteDeCascabel serpienteDeCascabel;
    public static IFLargartoDeColaLarga largartoDeColaLarga;
    
    public void genesis(){
        /**
         * Aves
         */
        IFPluma pluma = new IFPluma();
        correcaminos = new IFCorrecaminos(true, pluma);
        System.out.println("* Nacimiento de un correcaminos");
        correcaminos.nacer();
        System.out.println("\n* Nacimiento de un pato");
        pato = new IFPato(true, pluma);
        pato.nacer();
        System.out.println("\n* Nacimiento de un halcon");
        halcon = new IFHalcon(true, pluma);
        halcon.nacer();
        /**
         * Mamiferos
         */
        IFPelaje pelaje = new IFPelaje();
        System.out.println("\n* Nacimiento de un leon");
        leon = new IFLeon(true, pelaje);
        leon.nacer(); 
        System.out.println("\n* Nacimiento de una cebra");
        cebra = new IFCebra(true, pelaje);
        cebra.nacer();
        /**
         * Anfibios
         */
        IFPatas patas = new IFPatas();
        rana = new IFRana(true, patas);
        System.out.println("\n* Nacimiento de una rana");
        rana.nacer();
        System.out.println("\n* Nacimiento de una salamandra");
        salamandra = new IFSalamandra(true, patas);
        salamandra.nacer();
        /**
         * Peces
         */
        IFCamuflaje camuflaje = new IFCamuflaje();
        tiburonBlanco = new IFTiburonBlanco(true, camuflaje);
        System.out.println("\n* Nacimiento de un tiburon blanco");
        tiburonBlanco.nacer();
        atunRojo = new IFAtunRojo(true, camuflaje);
        System.out.println("\n* Nacimiento de un atun rojo");
        atunRojo.nacer();
        /**
         * Reptil
         */
        IFCamuflajeReptil camuflajeReptil = new IFCamuflajeReptil();
        serpienteDeCascabel = new IFSerpienteDeCascabel(true, camuflajeReptil);
        System.out.println("\n* Nacimiento de una serpiente de cascabel");
        serpienteDeCascabel.nacer();
        largartoDeColaLarga = new IFLargartoDeColaLarga(true, camuflajeReptil);
        System.out.println("\n* Nacimiento de un lagarto de cola larga");
        largartoDeColaLarga.nacer();

    }
}
