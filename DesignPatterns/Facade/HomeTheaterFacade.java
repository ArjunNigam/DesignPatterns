package DesignPatterns.Facade;

public class HomeTheaterFacade
{
    private Lights lights;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(Lights lights, Projector projector, SoundSystem soundSystem)
    {
        this.lights = lights;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie()
    {
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        projector.on();
        soundSystem.on();
    }
}
