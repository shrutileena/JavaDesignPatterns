package org.example;

public class Fan {
    private State state = new LowState();
//    public void Fan(State state){
//        this.state = state;
//    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnUp(){
//        switch (state){
//            case "low":
//                setState("medium");
//                System.out.println("Fan is on medium");
//                break;
//            case "medium":
//                setState("high");
//                System.out.println("Fan is on high");
//                break;
//            case "high":
//                break;
//        }
        state.turnUp(this);
    }
    public void turnDown(){
//        switch (state){
//            case "high":
//                setState("medium");
//                System.out.println("Fan is on medium");
//                break;
//            case "medium":
//                setState("low");
//                System.out.println("Fan is on high");
//                break;
//            case "low":
//                break;
//        }
        state.turnDown(this);
    }
}
