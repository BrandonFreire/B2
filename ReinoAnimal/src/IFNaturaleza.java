import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

    public void genesis() {
        /**
         * Aves
         */
        correcaminos = new IFCorrecaminos(true);
        System.out.println("* Nacimiento de un correcaminos");
        correcaminos.nacer();

        System.out.println("\n* Nacimiento de un pato");
        pato = new IFPato(true);
        pato.nacer();

        System.out.println("\n* Nacimiento de un halcon");
        halcon = new IFHalcon(true);
        halcon.nacer();
        
        guardarEnArchivoCSV(correcaminos, "Correcaminos");
        guardarEnArchivoCSV(pato, "Pato");
        guardarEnArchivoCSV(halcon, "Halcon");

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

    /**
     * Para guardar archivos
     * @param ave
     * @param tipo
     */
    public void guardarEnArchivoCSV(IFAve ave, String tipo) {
        String carpetaArchivos = "dataFile";
        String nombreArchivo = Paths.get(carpetaArchivos, "ave.csv").toString();

        try (FileWriter writer = new FileWriter(nombreArchivo,true)) {

            if (Files.size(Paths.get(nombreArchivo)) == 0) {
                writer.append("Tipo,PicoColor,PicoTamanio,PlumaColor,PlumaTamanio,PlumaForma\n");
            }

            escribirDatosEnArchivo(writer, tipo, ave);

            System.out.println("Datos guardados de: "+ tipo + " guardados en el archivo" + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Para escribir en el archivo 
     * @param writer
     * @param tipo
     * @param ave
     * @throws IOException
     */
    private void escribirDatosEnArchivo(FileWriter writer, String tipo, IFAve ave) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        // Agregar información común para todas las aves
        stringBuilder.append(String.format("%s, ", tipo));
        
        // Agregar información específica de IFPico
        IFPico pico = ave.getPico();
        stringBuilder.append(pico != null ? pico.getColor() : "N/A").append(",");
        stringBuilder.append(pico != null ? pico.getTamanio() : "N/A").append(",");

        // Agregar información específica de IFPluma
        IFPluma pluma = ave.getPluma();
        stringBuilder.append(pluma != null ? pluma.getColor() : "N/A").append(",");
        stringBuilder.append(pluma != null ? pluma.getTamanio() : "N/A").append(",");
        stringBuilder.append(pluma != null ? pluma.getForma() : "N/A");

        // Agregar una nueva línea al archivo
        writer.append(stringBuilder.toString()).append("\n");
    }
    
    /**
     * 
     * @return
     */
    	public static ArrayList<IFAve> getPesonaFile() {
		ArrayList<IFAve> personas = new ArrayList<>();
		final String ARCHIVO	 = "dataFile\\personas.csv",
					 SEPARADOR	 = ";";
		try {
			List<String> allLines = Files.readAllLines(Paths.get(ARCHIVO));
			for (String line : allLines) {
				String[] personaFile = line.split(SEPARADOR);

				personas.add(new IFAve(   personaFile[0], 
                                            personaFile[1],
                                            Integer.valueOf(personaFile[2])));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
        return personas;
	}
}

