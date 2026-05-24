package DesignPatterns.Facade;

public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Lights(), new Projector(), new SoundSystem());
        homeTheater.watchMovie();

        /*
        Without the Facade, the client would have to do the following -->
        Lights lights = new Lights();
        lights.dim();
        Projector projector = new Projector();
        projector.on();
        SoundSystem soundSystem = new SoundSystem();
        soundSystem.on();
         */
    }
}
