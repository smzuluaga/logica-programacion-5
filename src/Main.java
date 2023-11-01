import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        /*Bienvenidos a la prueba de Inglés de Duolingo
            Para la correcta ejecición del código, debe seguir las siguientes instrucciones:
                1. Elegir un tipo de diccionario: 0 -> español ó 1 -> inglés.
                2. Si se inicializa un diccionario en español, las palabras evaluadas saldrán en español y deberás
                    responder su significado en ingles.
                2. Si se inicializa un diccionario en inglés, las palabras evaluadas saldrán en inglés y deberás
                    responder su significado en español.
                3. Cuando su respuesta sea en español, ¡LA ORTOGRAFÍA CUENTA! las tíldes hacen la diferencia entre un acierto
                    y un error.
        */

        //Solicitud de tipo de diccionario para inicializar el mismo
        System.out.println("Elija un tipo de diccionario para realizar la prueba");
        System.out.println("Digite < 0 > para realizar la prueba en español e inicializar un diccionario español-inglés");
        System.out.println("Digite < 1 > para realizar la prueba en inglés e inicializar un diccionario inglés-español");

        Scanner input = new Scanner(System.in);
        int tipoDiccionario = input.nextInt();

        // Hacemos la validacion del tipo dediccionario para que en caso de que se ingrese un valor errado, el sistema se corte.
        if (tipoDiccionario == 0 || tipoDiccionario == 1) {

            Diccionario diccionario = new Diccionario(tipoDiccionario);

            System.out.println("Inicializando Diccionario ...");
            System.out.println(" ... ");

            // Dependiendo el tipo de diccionario se incializa las palabras en ingles o español
            if (tipoDiccionario == 0){
                diccionario.agregarPalabra("tigre", "tiger");
                diccionario.agregarPalabra("manzana", "apple");
                diccionario.agregarPalabra("coche", "car");
                diccionario.agregarPalabra("casa", "house");
                diccionario.agregarPalabra("ordenador", "computer");
                diccionario.agregarPalabra("libro", "book");
                diccionario.agregarPalabra("perro", "dog");
                diccionario.agregarPalabra("gato", "cat");
                diccionario.agregarPalabra("plátano", "banana");
                diccionario.agregarPalabra("sol", "sun");
                diccionario.agregarPalabra("luna", "moon");
                diccionario.agregarPalabra("árbol", "tree");
                diccionario.agregarPalabra("agua", "water");
                diccionario.agregarPalabra("fuego", "fire");
                diccionario.agregarPalabra("tierra", "earth");
                diccionario.agregarPalabra("pájaro", "bird");
                diccionario.agregarPalabra("pez", "fish");
                diccionario.agregarPalabra("flor", "flower");
                diccionario.agregarPalabra("amigo", "friend");
                diccionario.agregarPalabra("amor", "love");
                diccionario.agregarPalabra("feliz", "happy");
                diccionario.agregarPalabra("triste", "sad");
                diccionario.agregarPalabra("playa", "beach");
                diccionario.agregarPalabra("montaña", "mountain");
                diccionario.agregarPalabra("música", "music");
                diccionario.agregarPalabra("tiempo", "time");
                diccionario.agregarPalabra("reloj", "watch");
                diccionario.agregarPalabra("teléfono", "phone");
                diccionario.agregarPalabra("familia", "family");
                diccionario.agregarPalabra("trabajo", "job");
                diccionario.agregarPalabra("dinero", "money");
                diccionario.agregarPalabra("comida", "food");
                diccionario.agregarPalabra("bebida", "drink");
                diccionario.agregarPalabra("amistad", "friendship");
                diccionario.agregarPalabra("árbol", "tree");
                diccionario.agregarPalabra("cielo", "sky");
                diccionario.agregarPalabra("carretera", "road");
                diccionario.agregarPalabra("zapatos", "shoes");
                diccionario.agregarPalabra("color", "color");
                diccionario.agregarPalabra("imagen", "picture");
                diccionario.agregarPalabra("sonrisa", "smile");
                diccionario.agregarPalabra("sueño", "dream");
                diccionario.agregarPalabra("estrella", "star");
                diccionario.agregarPalabra("televisión", "television");
                diccionario.agregarPalabra("casa", "house");
                diccionario.agregarPalabra("bicicleta", "bicycle");
                diccionario.agregarPalabra("montaña", "mountain");
                diccionario.agregarPalabra("río", "river");
                diccionario.agregarPalabra("escuela", "school");
                diccionario.agregarPalabra("océano", "ocean");
            } else {
                diccionario.agregarPalabra("tiger", "tigre");
                diccionario.agregarPalabra("apple", "manzana");
                diccionario.agregarPalabra("car", "coche");
                diccionario.agregarPalabra("house", "casa");
                diccionario.agregarPalabra("computer", "ordenador");
                diccionario.agregarPalabra("book", "libro");
                diccionario.agregarPalabra("dog", "perro");
                diccionario.agregarPalabra("cat", "gato");
                diccionario.agregarPalabra("banana", "plátano");
                diccionario.agregarPalabra("sun", "sol");
                diccionario.agregarPalabra("moon", "luna");
                diccionario.agregarPalabra("tree", "árbol");
                diccionario.agregarPalabra("water", "agua");
                diccionario.agregarPalabra("fire", "fuego");
                diccionario.agregarPalabra("earth", "tierra");
                diccionario.agregarPalabra("bird", "pájaro");
                diccionario.agregarPalabra("fish", "pez");
                diccionario.agregarPalabra("flower", "flor");
                diccionario.agregarPalabra("friend", "amigo");
                diccionario.agregarPalabra("love", "amor");
                diccionario.agregarPalabra("happy", "feliz");
                diccionario.agregarPalabra("sad", "triste");
                diccionario.agregarPalabra("beach", "playa");
                diccionario.agregarPalabra("mountain", "montaña");
                diccionario.agregarPalabra("music", "música");
                diccionario.agregarPalabra("time", "tiempo");
                diccionario.agregarPalabra("watch", "reloj");
                diccionario.agregarPalabra("phone", "teléfono");
                diccionario.agregarPalabra("family", "familia");
                diccionario.agregarPalabra("job", "trabajo");
                diccionario.agregarPalabra("money", "dinero");
                diccionario.agregarPalabra("food", "comida");
                diccionario.agregarPalabra("drink", "bebida");
                diccionario.agregarPalabra("friendship", "amistad");
                diccionario.agregarPalabra("tree", "árbol");
                diccionario.agregarPalabra("sky", "cielo");
                diccionario.agregarPalabra("road", "carretera");
                diccionario.agregarPalabra("shoes", "zapatos");
                diccionario.agregarPalabra("color", "color");
                diccionario.agregarPalabra("picture", "imagen");
                diccionario.agregarPalabra("smile", "sonrisa");
                diccionario.agregarPalabra("dream", "sueño");
                diccionario.agregarPalabra("star", "estrella");
                diccionario.agregarPalabra("television", "televisión");
                diccionario.agregarPalabra("house", "casa");
                diccionario.agregarPalabra("bicycle", "bicicleta");
                diccionario.agregarPalabra("mountain", "montaña");
                diccionario.agregarPalabra("river", "río");
                diccionario.agregarPalabra("school", "escuela");
                diccionario.agregarPalabra("ocean", "océano");
            }

            System.out.println("Diccionario Inicializado con éxito.");
            System.out.println(" ... ");


//            System.out.println("PRUEBAS CRUD");
//            diccionario.agregarPalabra("ocean", "mar");
//            diccionario.buscarPalabra("ocean");
//            diccionario.agregarPalabra("female", "mujer");
//            diccionario.buscarPalabra("female");
//            diccionario.buscarPalabra("mujer");
//            diccionario.eliminarPalabra("mujer");
//            diccionario.buscarPalabra("female");
//            diccionario.agregarPalabra("female", "mujer");
//            diccionario.buscarPalabra("mujer");



//            System.out.println(diccionario.getDiccionario());

            // Luego de conocer en qué idioma se desea hacer la prueba, se debe elegir el nivel de exigencia,
            // indicando en que cantidad de palabras deseas ser evaluado.
            System.out.println("Digite la cantidad de palabras que desea probar entre 5 y 50");
            int cantidadPalabras = input.nextInt();

            // Se inicializan los arrays que contendrám las respuestas del usuario y la lista de palabras random
            // generadas por el sistema
            String [] respuestasUsuario = new String[cantidadPalabras];
            String [] palabrasRandomPrueba = new String[cantidadPalabras];

            // Se trae la lista de palabras del idioma seleccionado para hacer la seleccion random del numero de palabbras
            // que el usuasio pisió ser evaluado.
            ArrayList<String> listaPalabras = (ArrayList<String>) diccionario.getDiccionario();

            for (int i = 0; i < palabrasRandomPrueba.length; i++){
                Random random = new Random();
                int indiceAleatorio = random.nextInt(listaPalabras.size());
                palabrasRandomPrueba[i] = listaPalabras.get(indiceAleatorio);
                System.out.println(palabrasRandomPrueba[i]);
            }


            // se inicializan las variables que van a contar y almacenar los aciertos y errores del usuario.
            int contadorAsiertos = 0;
            ArrayList <String> asiertos = new ArrayList<>();
            ArrayList <String> errores = new ArrayList<>();

            // Recibe las palabras y las evalia para determinar si es acierto o error y hacer su respectiva acción.
            for (int i = 0; i < palabrasRandomPrueba.length; i++) {
                System.out.println("Respuesta " + i + " a palabra -> " + palabrasRandomPrueba[i]);
                respuestasUsuario[i] = input.next();

                if (diccionario.getPalabra(palabrasRandomPrueba[i]).equals(respuestasUsuario[i].toLowerCase())) {
                    contadorAsiertos += 1;
                    asiertos.add("Palabra Random: " + palabrasRandomPrueba[i] + " || Respuesta Usuario: " + respuestasUsuario[i]);
                }else {
                    errores.add("Palabra Random: " + palabrasRandomPrueba[i] +  " || Respuesta Usuario: " + respuestasUsuario[i] + " || Respuesta Correcta: " + diccionario.getPalabra(palabrasRandomPrueba[i]));
                }
            }

            // Respuestas de asiertos y errores

            System.out.println("Usted Tuvo <" + contadorAsiertos + "/" + cantidadPalabras +"> asiertos. Conozca sus aciertos a continuación.");

            for (String asierto : asiertos){
                System.out.println(asierto);
            }

            System.out.println("Usted Tuvo <" + (cantidadPalabras-contadorAsiertos) + "/" + cantidadPalabras +"> errores. Conozca sus errores a continuación.");

            for (String error : errores){
                System.out.println(error);
            }

            System.out.println("\n***************************************************< FIN DE LA PRUEBA >********************************************************************");
            System.out.println("*******************************************************************************************************************************************");
        } else {
            System.out.println("Digite una opción válida:");
            System.out.println("Digite < 0 > para realizar la prueba en español e inicializar un diccionario español-inglés");
            System.out.println("Digite < 1 > para realizar la prueba en inglés e inicializar un diccionario inglés-español");
            return;
        }
    }
}


