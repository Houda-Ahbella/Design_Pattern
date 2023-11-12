package Comportemental.Observer;

public class TestObserver {
    public static void main(String[] args) {
        // Créer une instance de StationMeteo (sujet observable)
        StationMeteo stationMeteo = new StationMeteo();

        // Créer des instances d'observateurs
        Observateur affichageConditions = new AffichageConditions();

        // Enregistrer les observateurs auprès de la station météo
        stationMeteo.enregistrerObservateur(affichageConditions);

        // Simuler la mise à jour des mesures météorologiques
        stationMeteo.setMesures(25, 65, 1013);
        // Les observateurs (affichageConditions) seront notifiés et mis à jour
    }
}
