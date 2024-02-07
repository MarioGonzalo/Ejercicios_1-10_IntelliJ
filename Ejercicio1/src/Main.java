public class Main {

    public static void main(String[] args) {
        int dias = 365;
        int horas = 24;
        int mins = 60;
        int segs = 60;

        int segsAno = calcularSegundosEnAnio(dias, horas, mins, segs);

        System.out.println("El número de segundos en un año es: " + segsAno);
    }

    public static int calcularSegundosEnAnio(int dias, int horas, int mins, int segs) {
        return dias * horas * mins * segs;
    }
}
