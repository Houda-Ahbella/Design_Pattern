package Structurel.Proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;
    private boolean isAdmin;

    public Proxy(boolean isadm)
    {
        realSubject = new RealSubject();
        this.isAdmin = isadm;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public void request() {
        if(this.isAdmin)
        realSubject.request();
        else System.out.println("Opération n'est pas autorisée");
    }
}
