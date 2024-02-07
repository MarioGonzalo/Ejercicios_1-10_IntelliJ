public class Main {

    public static void main(String[] args) {
        // Se declaran las variables para los días, horas, minutos y segundos
        int dias = 365;
        int horas = 24;
        int mins = 60;
        int segs = 60;

        // Se calculan los segundos en un año y se almacenan en la variable segsAno
        int segsAno = calcularSegundosEnAnio(dias, horas, mins, segs);

        // Se imprimen los segundos en un año
        System.out.println("El número de segundos en un año es: " + segsAno);
    }

    public static int calcularSegundosEnAnio(int dias, int horas, int mins, int segs) {
        // Se calculan los segundos en un año y se retornan
        return dias * horas * mins * segs;
    }
}
