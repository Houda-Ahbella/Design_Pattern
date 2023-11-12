package Comportemental.Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        // Créer des instances de stratégies
        Strategie strategieA = new StrategieA();
        Strategie strategieB = new StrategieB();

        // Créer une instance de contexte avec une stratégie par défaut
        Contexte contexte = new Contexte(strategieA);

        // Exécuter la stratégie par défaut
        contexte.executerStrategie();

        // Changer la stratégie à la volée
        contexte.setStrategie(strategieB);

        // Exécuter la nouvelle stratégie
        contexte.executerStrategie();
    }

}
