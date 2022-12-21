package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PopulationSimulator {
    static ArrayList<Animal> animals = new ArrayList<>();
    private static AnimalFactory animalFactory = new AnimalFactory();
    public static void main(String[] args) {

        Runnable createAnimals = new Runnable() {
            @Override
            public void run() {
                createRandomAnimal();
            }
        };

        Runnable removerAnimals = new Runnable() {
            @Override
            public void run() {
                removeAnimal();
            }
        };

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(createAnimals,0,3, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(removerAnimals,5,5,TimeUnit.SECONDS);
    }

    private static void removeAnimal() {
        System.out.println("Removing "+animals.get(0));
        animals.remove(0);
    }

    private static void createRandomAnimal() {
        Random random = new Random();
        int randint = random.nextInt(2);
        Animal animal = animalFactory.getAnimal(randint);
//        Animal animal = null;
//        if(randint==0){
//            animal=new Lion();
//        } else if(randint==1){
//            animal=new Tiger();
//        }
        animal.setLocation(random.nextInt(1000),random.nextInt(1000));
        System.out.println("Creating "+animal+" ,type: "+animal.getAnimalType()+
                ", location: "+animal.getLocation()[0]+" "+animal.getLocation()[1]);
        animals.add(animal);
    }
}
