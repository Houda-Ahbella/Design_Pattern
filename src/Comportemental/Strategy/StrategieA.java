package Comportemental.Strategy;

class StrategieA implements Strategie {
    @Override
    public void appliquer() {
        System.out.println("Application de la Stratégie A");
    }
}
