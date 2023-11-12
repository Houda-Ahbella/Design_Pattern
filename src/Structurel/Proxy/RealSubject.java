package Structurel.Proxy;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("Opération du sujet réel");
    }
}
