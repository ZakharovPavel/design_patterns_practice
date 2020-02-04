package local.study.singleton;

public class Singleton {

    private static volatile Singleton instance;
    private static int VERSION = 0;

    private Singleton() {
        System.out.println("Singleton created");
    }

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                    ++VERSION;
                }
            }
        }
        return localInstance;
    }

    public int getVERSION() {
        return VERSION;
    }

}
