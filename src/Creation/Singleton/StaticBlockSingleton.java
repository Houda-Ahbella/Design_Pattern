package Creation.Singleton;

// 2. Static block initialization
public class StaticBlockSingleton {
    /***************************************************************
     1 et 2 créent l'instance avant même qu'elle ne soit utilisée et ce n'est pas la meilleure pratique à utiliser.
     is similar to eager initialization, sauf que l'instance de la classe est créée dans le bloc statique qui fournit l'option de gestion des exceptions.
     **************************************************************/
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
