public class Main {

    public static void main(String[] args) {
        int diasEnUnAno = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        int segundosEnUnAno = calcularSegundosEnAnio(diasEnUnAno, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);

        System.out.println("El número de segundos en un año es: " + segundosEnUnAno);
    }

    public static int calcularSegundosEnAnio(int dias, int horas, int minutos, int segundos) {
        return dias * horas * minutos * segundos;
    }
}
