package Comportemental.Observer;

import java.util.ArrayList;
import java.util.List;

public class StationMeteo implements Sujet {

    private List<Observateur> observateurs = new ArrayList<>();
    private float temperature;
    private float humidite;
    private float pression;

    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(temperature, humidite, pression);
        }
    }
    // Méthode pour simuler la mise à jour des mesures météorologiques
    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        notifierObservateurs();
    }

}
