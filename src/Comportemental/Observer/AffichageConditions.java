package Comportemental.Observer;

public class AffichageConditions implements Observateur{
    private float temperature;
    private float humidite;

    @Override
    public void mettreAJour(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        afficher();
    }

    public void afficher() {
        System.out.println("Conditions actuelles : " + temperature + "°C et " + humidite + "% d'humidité");
    }
}
