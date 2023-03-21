import java.util.Scanner;

public class reto3 {

    public static void main(String[] args) {

        String[][] productos = new String[4][4];

        Scanner lectura = new Scanner(System.in);

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (columna == 0) {
                    System.out.println("Ingrese el código del producto para la posición [" + fila + "][" + columna + "]");
                } else if (columna == 1) {
                    System.out.println("Ingrese el nombre del producto para la posición [" + fila + "][" + columna + "]");
                } else {
                    System.out.println("Ingrese el precio del producto para la posición [" + fila + "][" + columna + "]");
                }

                productos[fila][columna] = lectura.nextLine();

            }

        }

        System.out.println("CATÁLOGO");

        String codigo, nombre, precio;

        for (int fila = 0; fila < 4; fila++) {
            codigo = productos[fila][0];
            nombre = productos[fila][1];
            precio = productos[fila][2];

            System.out.println(codigo + " - " + nombre + " - $" + precio);
        }

        lectura.close();

    }
}
