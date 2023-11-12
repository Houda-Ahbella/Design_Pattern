package Creation.Singleton;

// 4. Thread Safe Singleton
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /***********************************************************
     * l'implémentation précédente fonctionne correctement et assure la sécurité des threads,
     * mais elle réduit les performances en raison du coût associé à la méthode synchronisée,
     * même si nous n'en avons besoin que pour les premiers threads de créer des instances distinctes.
     * alors pour résoudre ce probléme nous synchronsizons juste la partie à l'interieur de if
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
