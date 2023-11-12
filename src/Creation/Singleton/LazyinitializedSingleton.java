package Creation.Singleton;

// 3. Lazy Initialization
public class LazyinitializedSingleton {
    /*******************************************************************
     * cette méthode fonctionne bien dans le cas d'un environnement monothread, mais lorsqu'il s'agit de systèmes multithread,
     * elle peut provoquer des problèmes si plusieurs threads se trouvent simultanément dans la condition if.
     * Cela détruira le modèle singleton et les deux threads obtiendront des instances différentes de la classe singleton.
     **********************************************************************/

    private static LazyinitializedSingleton instance;

    private LazyinitializedSingleton(){}

    public static LazyinitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyinitializedSingleton();
        }
        return instance;
    }

}
