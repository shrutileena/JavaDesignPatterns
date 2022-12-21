package org.example;

public interface City {

    String getName();
    double getTemperature();
    String getTemperatureScale();
    boolean getHasWeatherWarning();
    public void setHasWeatherWarning(boolean hasWeatherWarning);
}
