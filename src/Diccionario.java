import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Diccionario {

    private int tipo;
    private String idiomaFrom;
    private String idiomaTo;
    private Map<String, String> palabras = new HashMap<String, String>();
    private ArrayList<String> palabrasEnglish = new ArrayList<String>();
    private ArrayList<String> palabrasSpanish = new ArrayList<String>();

//    public Diccionario () {
//    }

    public Diccionario (int tipo){
        if (tipo == 0) {
            this.idiomaFrom = "spanish";
            this.idiomaTo = "english";
        } else if (tipo == 1) {
            this.idiomaFrom = "english";
            this.idiomaTo = "spanish";
        } else {
            System.out.println("Elija una opción valida");
        }
    }

    public void verIdiomas(){
        System.out.println( "El diccionario está traduciendo de: " + idiomaFrom + " a " + idiomaTo);
    }

    public ArrayList<String> getDiccionario() {
        if (tipo == 0) {
            System.out.println(palabrasSpanish);
            return palabrasSpanish;
        } else if (tipo == 1) {
            System.out.println(palabrasEnglish);
            return palabrasEnglish;
        } else{
            return null;
        }
    }
    public void verDiccionario() {
        for(Map.Entry<String,String> palabra: palabras.entrySet()) {
            String clave = palabra.getKey();
            String valor = palabra.getValue();
            System.out.println(clave + " = " + valor);
        }
    }

    public void buscarPalabra(String palabraBuscada){
        if (palabras.containsKey(palabraBuscada)) {
            System.out.println("<" + idiomaFrom + "> " + palabraBuscada + " = " + palabras.get(palabraBuscada.toLowerCase()) + " <" + idiomaTo + ">");
        } else {
            System.out.println(" Palabra <" + palabraBuscada + "> no encontrada");
        }
    }

    public String getPalabra (String palabraBuscada){
        return palabras.get(palabraBuscada);
    }

    public void agregarPalabra(String nuevaPalabra, String nuevaPalabraSignificado){
        if(palabras.containsKey(nuevaPalabra.toLowerCase())){
            if(palabras.get(nuevaPalabra.toLowerCase()).equals(nuevaPalabraSignificado.toLowerCase())){
                System.out.println("La palabra <" + nuevaPalabra + "> ya existe con el mismo significado: " + palabras.get(nuevaPalabra.toLowerCase()));
            } else {
                System.out.println("La palabra <"  + nuevaPalabra + "> ya existe con otro significado: <" + palabras.get(nuevaPalabra.toLowerCase()) + ">");
            }
        } else {
            if (tipo == 0) {
                palabrasSpanish.add(nuevaPalabra);
                palabrasEnglish.add(nuevaPalabraSignificado);
            } else if(tipo == 1) {
                palabrasSpanish.add(nuevaPalabraSignificado);
                palabrasEnglish.add(nuevaPalabra);
            } else {
                System.out.println("La opción elegida no es válida");
                System.out.println("Elija < 0 > para inicializar un diccionario español-ingles");
                System.out.println("Elija < 1 > para inicializar un diccionario inglés-español");
            }

            palabras.put(nuevaPalabra.toLowerCase(),nuevaPalabraSignificado.toLowerCase());
            palabras.put(nuevaPalabraSignificado.toLowerCase(), nuevaPalabra.toLowerCase());
            System.out.println("Palabra: <" + nuevaPalabra + "> fue agregada con éxito a los siguientes diccionarios:  [" + idiomaFrom + "]" + "  " + "[" + idiomaTo + "]" );

        }
    }


    // método para eliminar palabras
    public void eliminarPalabra(String palabraEliminada){
        if (palabras.containsKey(palabraEliminada)){
            palabras.remove(palabraEliminada);
            System.out.println("Palabra: <" + palabraEliminada + "> fue eliminada con éxito.");
        } else {
            System.out.println("La palabra: <" + palabraEliminada + "> no fue encontrada para ser eliminada.");
        }
    }
}
