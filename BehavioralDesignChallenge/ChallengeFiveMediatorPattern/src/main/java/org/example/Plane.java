package org.example;

public class Plane {
    private int id;
    private boolean isInTheAir;
//    private Runway runway;
//    private PlanesInFlight planesInFlight;
//    private PlanesOnGround planesOnGround;
    public Plane(int id) {
        this.id = id;
        isInTheAir = false;
//        runway = new Runway();
//        planesInFlight = new PlanesInFlight();
//        planesOnGround = new PlanesOnGround();
//        planesOnGround.addPlane(this);
    }

//    public void takeOff() {
//        if (!isInTheAir && runway.getIsAvailable()){
//            System.out.println("Plane "+id+" is taking off...");
//            planesOnGround.removePlane(this);
//            planesInFlight.addPlane(this);
//            isInTheAir=true;
//            runway.setIsAvailable(false);
//        }
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInTheAir() {
        return isInTheAir;
    }

    public void setInTheAir(boolean inTheAir) {
        isInTheAir = inTheAir;
    }
}
