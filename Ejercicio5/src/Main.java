public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[][] tabs = tabsGen(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + j + " = " + tabs[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] tabsGen(int n) {
        int[][] tabs = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tabs[i][j] = (i + 1) * j;
            }
        }

        return tabs;
    }
}
