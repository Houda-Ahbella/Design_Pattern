package Comportemental.Strategy;

// Classe Contexte
class Contexte {
    private Strategie strategie;

    public Contexte(Strategie strategie) {
        this.strategie = strategie;
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    public void executerStrategie() {
        strategie.appliquer();
    }
}
