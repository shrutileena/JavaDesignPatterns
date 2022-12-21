package org.example;

public class AirTrafficController {
    Plane plane = new Plane(123);
    PlanesInFlight planesInFlight;
    PlanesOnGround planesOnGround;
    Runway runway;

    public AirTrafficController() {
        this.planesInFlight = new PlanesInFlight();
        this.planesOnGround = new PlanesOnGround();
        planesOnGround.addPlane(plane);
        this.runway = new Runway();
    }

    public void takeOff(){
        if(!plane.isInTheAir() && runway.isAvailable){
            System.out.println("Plane "+plane.getId()+" is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setInTheAir(true);
            runway.setIsAvailable(false);
        }
    }
}
