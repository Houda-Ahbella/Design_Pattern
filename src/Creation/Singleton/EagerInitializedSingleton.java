package Creation.Singleton;

// 1. Eager initialization
public class EagerInitializedSingleton {

    /******************************************************************************************************************************
     Si votre classe singleton n’utilise pas beaucoup de ressources, c’est l’approche à utiliser.
     Mais dans la plupart des scénarios, des classes singleton sont créées pour des ressources telles que le système de fichiers,
     les connexions à la base de données, etc.
     Nous devons éviter l'instanciation à moins que le client n'appelle la méthode getInstance.
     De plus, cette méthode ne fournit aucune option de gestion des exceptions.
     ******************************************************************************************************************************/
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
