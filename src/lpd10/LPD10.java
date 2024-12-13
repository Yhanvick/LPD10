package lpd10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LPD10 {

	public static void main(String[] args) {
		// Creo mi diccionario utilizando mi clase HashMap<indico mis dos palabras ingresadas por el usuario que se van a leer como un string o cadena de texto> 
	    // Mi Map almacena elementos como pares de clave y valor, aquí es un diccionario en español (clave) a inglés (valor)
	    // He denominado mi variable llamada diccionario que es un objeto de la clase HashMap, variable donde voy a almacenar los pares de palabras
	    // Utilizo mi método put() para ir agregando los elementos a mi HashMap
		HashMap<String, String> diccionario = new HashMap<>();
	    diccionario.put("gato", "cat");
	    diccionario.put("perro", "dog");
	    diccionario.put("casa", "house");
	    diccionario.put("mesa", "table");
	    diccionario.put("pato", "duck");
	    diccionario.put("manzana", "apple");
	    diccionario.put("libro", "book");
	    diccionario.put("nube", "cloud");
	    diccionario.put("sol", "sun");
	    diccionario.put("piano", "piano");
	    diccionario.put("agua", "water");
	    diccionario.put("fuego", "fire");
	    diccionario.put("tierra", "earth");
	    diccionario.put("viento", "wind");
	    diccionario.put("sonido", "sound");
	    diccionario.put("niña", "girl");
	    diccionario.put("escuela", "school");
	    diccionario.put("profesor", "teacher");
	    diccionario.put("estudiante", "student");
	    diccionario.put("platano", "banana");

	    // esta es mi lista con todas las palabras del diccionario, declaro mi ArrayList donde voy a guardar mis strings que serán las palabras en español
	    //con mi keySet() que contiene todas las claves de mi diccionario, ya que mi diccionario contiene todo el HashMap<Satring,String>(clave-valor)
	    //new ArrayList<> crea una nueva lista a partir de los todas las claves del diccionario que se obtienen de keySet()
	    ArrayList<String> palabrasEspañol = new ArrayList<>(diccionario.keySet());

	    // creo un objeto Random para seleccionar palabras al azar, similar a cuando creo mi scanner y lo importo, entonces creo un objeto de la Clase Random para poder generar valores aleatorios, dichos numeros me servirán para poder obtener palabras de mi lista Map de forma aleatoria
	    Random random = new Random();

	    // ahora estoy creando dos contadores de tipo int (que almacena un número entero sin decimales) para poder llevar el registro de las respuestas del usuario, me aseguro de inicializar los contadores en 0 para tener un valor limpio antes de comenzar a sumar las respuestas
	    int correctas = 0;
	    int incorrectas = 0;

	    // System.in es mi argumento para que el scanner pueda leer la entrada del usario desde el teclado 
	    Scanner scanner = new Scanner(System.in);

	    // inicio mi ciclo for declarando que mi contador iniciará en 0; mientras i sea menor 5 seguirá ejecutandose, cuando llegué a 5 entonces se detrendrá; en cada iteración me aseguro de avanzar 1 
	    for (int i = 0; i < 5; i++) {
	    	
	        // con random.nextInt()me aseguro de generar un número aleatorio que corresponderá índice de mis palarbas entre 0 y el tamaño de mi lista, por lo que lo aplico a la longitud size() de las claves guardadas en mi ArrayList palabarasEspañol
	    	//con mi método remove()me aseguro de ir eliminando el índice seleccionado en cada iteración para evitar las repeticiones de la palabra. Las palabras eliminadas se almacenarán entonces en mi variable tipo string palabraEsp
	        String palabraEsp = palabrasEspañol.remove(random.nextInt(palabrasEspañol.size()));

	        // solicito al usuario la traducción de la palabra concatenaando mi variable palaraEsp
	        // transformo la entrada del usuario a minúsculas con mi método toLowerCase() y leo la entrada del usuario gracias a mi método nextLine() de mi scanner  para leer strings, guardo su respuesta en mi variable respuestUsuario
	        System.out.print("¿Cuál es la traducción de '" + palabraEsp + "' en inglés? ");
	        String respuestaUsuario = scanner.nextLine().toLowerCase();

	        // ahora puedo comprobar si la respuesta es correcta usando un bloque if
	        // verifico si la respuesta de mi usuario es igual con mi método equals() a la traduccion almacenada en el diccionario 
	        //y aplico mi método get() de Map para poder obtener la clave palabraEsp y que devolverá su valor (la traduccion al ingles
	        if (respuestaUsuario.equals(diccionario.get(palabraEsp))) {
	            System.out.println("¡Correcto!");
	            correctas++; //me aseguro de incrementar el contador
	        } else {
	            System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabraEsp));
	            incorrectas++; //me aseguro de incrementar el contador
	        }
	    }

	    //utilizo mi salto de linea \n para dejar un mensae antes de mostrar el mensaje de los resultados finales 
	    System.out.println("\nResultados finales:");
	    System.out.println("Respuestas correctas: " + correctas);
	    System.out.println("Respuestas incorrectas: " + incorrectas);

	    // cierro el scanner
	    scanner.close();
	}
	}
/*
 * Clase HashMap
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html

Método put()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html#put(K,V)

Método get()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html#get(java.lang.Object)

método keySet()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html#keySet()

Clase ArrayList
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

Método remove()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html#remove(int)

Método size
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html#size()

Método Get()
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html#get(int)

Clase Random
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html

nextInt(int bound)
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html#nextInt(int)

<>
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/reflect/ParameterizedType.html
*/

/*Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.
Colócalo en un repositorio llamado “logica-programacion-10”*/
