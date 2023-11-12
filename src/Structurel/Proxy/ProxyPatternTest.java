package Structurel.Proxy;

public class ProxyPatternTest {

    public static void main(String[] args){
        Proxy proxy = new Proxy(true);
        proxy.request();
        proxy.setAdmin(false);
        proxy.request();
    }
}
