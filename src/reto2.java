import java.util.Scanner;

//cresmos la clase publica
    public class reto2 {

        //creamos el metodo main
        public static void main(String[] args) {

            //instanciamos la clase Scanner
            Scanner lectura = new Scanner(System.in);

            //se declaran variables
            String palabra;
            String palabra1="";

            //se imprime un mensaje para solicitarle una palabra al usuario
            System.out.println("Ingrese una palabra:");
            //se llama la variable palabra y se almacena el el objeto de lectura como Line (String)
            palabra = lectura.nextLine();

            //se crea un ciclo donde se crea la variable i que es igual a la variable palabra
            for (int i = palabra.length() - 1; i >= 0; i--) {
                //lo que hace esta parte es que se empieze a leer la palabra desde su uktimo caracter y
                //lo guarde en la variable palabra1
                palabra1 += palabra.charAt(i);
            }

            //si la palabra es igual a palabra1 se imprime
            if (palabra.equals(palabra1)) {
                System.out.println("La palabra se lee igual al derecho y al reves es un palindromo.");

            //sino se imprime un mensaje donde se muestra que la palabra nos es palindromo
            } else {
                System.out.println("La palabra no es palindromo.");
            }
            //por ultimo limpiamos el buffer
            lectura.close();
        }
    }
