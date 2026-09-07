public class Main {
    public static void main(String[] args) {
        TermometroIoT termometro = new TermometroIoT(26.0);
        System.out.println("Temperatura en Celsius: " + termometro.getTemperaturaCelsius());
        System.out.println("Temperatura en Fahrenheit: " + termometro.obtenerFahrenheit());
    }
}
