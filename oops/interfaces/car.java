package oops.interfaces;

public class car implements engine, brake, media{

    int a = 30;
    
    @Override
    public void start(){
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void rukna(){
        System.out.println("I brake engine like a normal car");
    }

    @Override
    public void play(){
        System.out.println("I play song like a normal car");
    }
}
