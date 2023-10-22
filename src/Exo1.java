import java.util.Scanner;

public class Exo1 {
    public int SaisieChoix() {
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        return choix;
    }

    public Double SaisieTemperature() {
        Scanner sc = new Scanner(System.in);
        Double temp = sc.nextDouble();
        return temp;
    }

    public Double CelsiusVersFahrenheit(Double temp) {
        return (temp * 9 / 5) + 32;
    }

    public Double FahrenheitVersCelsius(Double temp) {
        return (temp - 32) * 5 / 9;
    }
}
