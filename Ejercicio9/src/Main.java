import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer de la entrada estándar.

        int N; // Tamaño de los vectores.
        // Se pide al usuario que ingrese el tamaño de los vectores.
        do {
            System.out.print("Ingrese el tamaño de los vectores: ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Por favor, ingrese un tamaño válido mayor que 0.");
            }
        } while (N <= 0);

        // Se obtienen los vectores del usuario.
        int[] vector1 = vect(scanner, N);
        int[] vector2 = vect(scanner, N);

        int productoEscalar = prodEscal(vector1, vector2); // Se calcula el producto escalar de los dos vectores.

        // Se imprime el producto escalar.
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    public static int[] vect(Scanner scanner, int N) {
        int[] vector = new int[N]; // Se crea un vector de tamaño N.

        // Se pide al usuario que ingrese los elementos del vector.
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    public static int prodEscal(int[] vector1, int[] vector2) {
        int prodEscal = 0; // Se inicializa el producto escalar en 0.

        // Se calcula el producto escalar de los dos vectores.
        for (int i = 0; i < vector1.length; i++) {
            prodEscal += vector1[i] * vector2[i];
        }

        return prodEscal;
    }
}
