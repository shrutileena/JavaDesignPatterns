package org.example;

public class Adaptor implements City{

    City city;
    public Adaptor(City city) { this.city = city; }

    @Override
    public String getName() { return city.getName(); }

    @Override
    public double getTemperature() {
        double temperature = city.getTemperature();
        temperature = (temperature * (9/5)) + 32;
        return temperature;
    }
    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }
    @Override
    public boolean getHasWeatherWarning() { return city.getHasWeatherWarning(); }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) { city.setHasWeatherWarning(hasWeatherWarning); }
}