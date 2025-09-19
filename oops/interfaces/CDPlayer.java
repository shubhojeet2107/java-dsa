package oops.interfaces;

public class CDPlayer implements media{
    @Override
    public void play() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
