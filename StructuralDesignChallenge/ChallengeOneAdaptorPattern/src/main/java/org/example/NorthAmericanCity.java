package org.example;

public class NorthAmericanCity implements City{

    String name;
    double temperature;
    boolean hasWeatherWarning;

    public NorthAmericanCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
        this.hasWeatherWarning = false;
    }
    @Override
    public String getName() { return this.name; }

    @Override
    public double getTemperature() { return this.temperature; }

    @Override
    public String getTemperatureScale() { return "Fahrenheit"; }

    @Override
    public boolean getHasWeatherWarning() { return this.hasWeatherWarning; }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) { this.hasWeatherWarning = hasWeatherWarning; }
}
