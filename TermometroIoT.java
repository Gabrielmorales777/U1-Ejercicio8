public class TermometroIoT {

    private double temperaturaCelsius;

    public TermometroIoT(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double obtenerFahrenheit() {
        return (temperaturaCelsius * 9.0 / 5.0) + 32.0;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
}
