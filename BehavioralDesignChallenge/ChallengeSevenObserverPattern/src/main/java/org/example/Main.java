package org.example;

public class Main {
    public static void main(String[] args) {
        City sunnyville = new City();
        City springfield = new City();
        TrafficUpdates trafficUpdates = new TrafficUpdates();

        sunnyville.addPropertyChangeListener(trafficUpdates);
        springfield.addPropertyChangeListener(trafficUpdates);

        sunnyville.updateTraffic("Congestion in town centre");
        springfield.updateTraffic("Accident on the highway");

        trafficUpdates.getUpdates();
    }
}