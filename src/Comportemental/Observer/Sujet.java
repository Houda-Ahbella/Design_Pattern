package Comportemental.Observer;

public interface Sujet {
    void enregistrerObservateur(Observateur observateur);
    void supprimerObservateur(Observateur observateur);
    void notifierObservateurs();
}
