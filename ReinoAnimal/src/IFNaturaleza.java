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
        
        guardarEnArchivoAve(correcaminos, "Correcaminos");
        guardarEnArchivoAve(pato, "Pato");
        guardarEnArchivoAve(halcon, "Halcon");

        /**
         * Mamiferos
         */
        System.out.println("\n* Nacimiento de un leon");
        leon = new IFLeon(true);
        leon.nacer();
        System.out.println("\n* Nacimiento de una cebra");
        cebra = new IFCebra(true);
        cebra.nacer();

        guardarMamifero(leon, "Leon");
        guardarMamifero(cebra, "Cebra");

        /**
         * Anfibios
         */
        rana = new IFRana(true);
        System.out.println("\n* Nacimiento de una rana");
        rana.nacer();
        System.out.println("\n* Nacimiento de una salamandra");
        salamandra = new IFSalamandra(true);
        salamandra.nacer();

        guardarAnfibio(rana, "Rana");
        guardarAnfibio(salamandra, "Salamandra");

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
     * Para guardar archivos de ave
     * @param ave
     * @param tipo
     */
    public void guardarEnArchivoAve(IFAve ave, String tipo) {
        String carpetaArchivos = "dataFile";
        String nombreArchivo = Paths.get(carpetaArchivos, "ave.csv").toString();

        try (FileWriter writer = new FileWriter(nombreArchivo,true)) {

            if (Files.size(Paths.get(nombreArchivo)) == 0) {
                writer.append("Tipo,PicoColor,PicoTamanio,PlumaColor,PlumaTamanio,PlumaForma\n");
            }

            escribirDatosEnArchivoAve(writer, tipo, ave);

            System.out.println("Datos guardados de: "+ tipo + " guardados en el archivo" + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Para escribir en el archivo de ave
     * @param writer
     * @param tipo
     * @param ave
     * @throws IOException
     */
    private void escribirDatosEnArchivoAve(FileWriter writer, String tipo, IFAve ave) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s, ", tipo));
        
        IFPico pico = ave.getPico();
        stringBuilder.append(pico != null ? pico.getColor() : "N/A").append(",");
        stringBuilder.append(pico != null ? pico.getTamanio() : "N/A").append(",");

        IFPluma pluma = ave.getPluma();
        stringBuilder.append(pluma != null ? pluma.getColor() : "N/A").append(",");
        stringBuilder.append(pluma != null ? pluma.getTamanio() : "N/A").append(",");
        stringBuilder.append(pluma != null ? pluma.getForma() : "N/A");

        writer.append(stringBuilder.toString()).append("\n");
    }
    
    /**
     * para guardar datos mamifero
     * @param mamifero
     * @param tipo
     */
    public void guardarMamifero(IFMamifero mamifero, String tipo) {
        String carpetaArchivos = "dataFile";
        String nombreArchivo = Paths.get(carpetaArchivos, "mamifero.csv").toString();

        try (FileWriter writer = new FileWriter(nombreArchivo,true)) {

            if (Files.size(Paths.get(nombreArchivo)) == 0) {
                writer.append("Tipo,GlandulaTamaño,GlandulaColor,GlandulaForma,PelajeColor,PelajeTextura\n");
            }

            escribirDatosMamifero(writer, tipo, mamifero);

            System.out.println("Datos guardados de: "+ tipo + " guardados en el archivo" + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * para escribir datos del mamifero
     * @param writer
     * @param tipo
     * @param mamifero
     * @throws IOException
     */
    private void escribirDatosMamifero(FileWriter writer, String tipo, IFMamifero mamifero) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s, ", tipo));
        
        IFGlandulaMamaria glandulaMamaria = mamifero.getGlandulaMamaria();
        stringBuilder.append(glandulaMamaria != null ? glandulaMamaria.getTamanio() : "N/A").append(",");
        stringBuilder.append(glandulaMamaria != null ? glandulaMamaria.getColor() : "N/A").append(",");
        stringBuilder.append(glandulaMamaria != null ? glandulaMamaria.getForma() : "N/A").append(",");

        IFPelaje pelaje = mamifero.getPelaje();
        stringBuilder.append(pelaje != null ? pelaje.getColor() : "N/A").append(",");
        stringBuilder.append(pelaje != null ? pelaje.getTextura() : "N/A");

        writer.append(stringBuilder.toString()).append("\n");
    }

    /**
     * para anfibio
     * @param anfibio
     * @param tipo
     */
    public void guardarAnfibio(IFAnfibio anfibio, String tipo) {
        String carpetaArchivos = "dataFile";
        String nombreArchivo = Paths.get(carpetaArchivos, "anfibio.csv").toString();

        try (FileWriter writer = new FileWriter(nombreArchivo,true)) {

            if (Files.size(Paths.get(nombreArchivo)) == 0) {
                writer.append("Tipo,PielEstructura,PielColor,PatasForma,PatasTextura,PatasColor\n");
            }

            escribirDatosAnfibio(writer, tipo, anfibio);

            System.out.println("Datos guardados de: "+ tipo + " guardados en el archivo" + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param writer
     * @param tipo
     * @param anfibio
     * @throws IOException
     */
    private void escribirDatosAnfibio(FileWriter writer, String tipo, IFAnfibio anfibio) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s, ", tipo));
        
        IFPielPermeable pielPermeable = anfibio.getPielPermeable();
        stringBuilder.append(pielPermeable != null ? pielPermeable.getStructura() : "N/A").append(",");
        stringBuilder.append(pielPermeable != null ? pielPermeable.getColor() : "N/A").append(",");

        IFPatas patas = anfibio.getPatas();
        stringBuilder.append(patas != null ? patas.getForma() : "N/A").append(",");
        stringBuilder.append(patas != null ? patas.getTextura() : "N/A").append(",");
        stringBuilder.append(patas != null ? patas.getColor() : "N/A");

        writer.append(stringBuilder.toString()).append("\n");
    }





    /**
     * 
     * @return
     */
    	/*public static ArrayList<IFAve> getPesonaFile() {
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
	}*/
}

