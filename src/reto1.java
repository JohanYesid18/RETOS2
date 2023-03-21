import java.util.Scanner;

//creamos la clase publica
public class reto1 {
    //creos el metodo main
    public static void main(String[] args) {

        //instanciamos con el objeto lectura de la clase scanner
        Scanner lectura = new Scanner(System.in);
        // se crea un arreglo palabras para digitar las palabras que nesecitemos
        String[] palabras = {"programacion", "computadora", "algoritmo", "java", "programa", "estructuras"};
        // Selecciona una palabra al azar
        String palabra = palabras[(int)(Math.random() * palabras.length)]; 
        // este arreglo es para almacenar las letras adivinadas
        char[] letras = new char[palabra.length()]; 
        

        //se crea un ciclo for creando la variable i
        for (int i = 0; i < letras.length; i++) {
        // Inicializa el arreglo para que no salgan las letras sino guion al piso
            letras[i] = '_'; 
        }
        // Número de intentos permitidos
        int intentos = 6;

        //se crea la condicion de los intentos si la variable intentos es menor a 0
        while (intentos >= 0) {
            //se le imprime un mensaje al usuario donde podra ver con guiones bajos
            //cuantas letras tiene la palabra
            System.out.print("Palabra: ");
            //se crea un ciclo mas
            for (int i = 0; i < letras.length; i++) {
                //se crea para darle espacios a los guiones para que no queden pegados
                System.out.print(letras[i] + " ");
            }

            //se imprime un mensaje al usuario donde podra ver cuantos intentos tendra
            System.out.println("\nIntentos restantes: " + intentos);
            //se le solicta al usuario que ingrese una letra
            System.out.print("Ingrese una letra: ");
            // se crea el metodo para guardar el caracter que digita el usuario y lo guarda en la
            //variable letra
            char letra = lectura.next().charAt(0);
            //se crea la variable acierto tipo boolean por si no se adivina la letra 
            boolean acierto = false;

            //se crea un ciclo for para la variable palabras
            for (int i = 0; i < palabra.length(); i++) {
                //se crea un if con la condicion de si la letra que se digito es igual
                //a la letra que hay en la palabra 
                if (palabra.charAt(i) == letra) {

                // Actualiza el arreglo de letras adivinadas
                    letras[i] = letra;

                    acierto = true;
                }
            }
            //se crea un if por si se llego a no acertar la letra se le muestra al usuario
            //los intentos que le quedan
            if (!acierto) {
                intentos--;
            }

            //creamos una variable tipo boolean por si el usuario adivino la palabra
            boolean palabraCompleta = true;

            //creamos un for por si la palabra o las letras no son adivinadas
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == '_') {
                    // Si hay alguna letra no adivinada o la palabra no está completa
                    palabraCompleta = false; 
                }
            }
            //creamos una condicion donde llamamos la variable palabra completa
            if (palabraCompleta) {
            //imprimimos un mensaje al usuario donde se le mostrara que adivino la palabra
                System.out.println("¡Felicidades, adivinaste la palabra!");
            //imprimimos un mensaje al usuario donde se le mostrara la palabra elegida al azar
                System.out.println("La palabra era: " + palabra);

            //se sale del método main y termina el juego
                return;
            }
           
        }
        //si el usuario no cumplio las condiciones se le mostrara un mensaje donde perdio
        //y la palabra que tenia que adivinar
        System.out.println("¡Oh no, perdiste! La palabra era: " + palabra);

    //por ultimo limpiamos el bufer llamando al objeto para volver a jugar
    lectura.close();
    }
    
}
