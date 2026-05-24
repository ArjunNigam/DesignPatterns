package DesignPatterns.Singleton;

public class Singleton {

    private static volatile Singleton instance;

    // private constructor prevents inititalization
    private Singleton() {}

    public static Singleton getInstance()
    {
        if(instance == null)                    // first check
        {
            synchronized (Singleton.class){
                if(instance == null)        // second check
                {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
