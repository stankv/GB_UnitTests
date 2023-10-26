package Task3.Weather;

public class WeatherReporter {
    private WeatherService weatherService;

    // Внедрение зависимости через конструктор
    public WeatherReporter(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String generateReport() {
        int temperature = weatherService.getCurrentTemperature();
        return "Текущая температура: " + temperature + " градусов.";
    }
}
