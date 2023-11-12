package Structurel.Adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}

// on peut la faire avec composition ou la class va pa attendre de Socket mais il va contenir un attribut de type socket

/*************************************************
 *
 * public class SocketObjectAdapterImpl implements SocketAdapter{
 *
 * 	//Using Composition for adapter pattern
 * 	private Socket sock = new Socket();
 *
 *        @Override
 *    public Volt get120Volt() {
 * 		return sock.getVolt();
 *    }
 *
 *    @Override
 *    public Volt get12Volt() {
 * 		Volt v= sock.getVolt();
 * 		return convertVolt(v,10);
 *    }
 *
 *    @Override
 *    public Volt get3Volt() {
 * 		Volt v= sock.getVolt();
 * 		return convertVolt(v,40);
 *    }
 *
 * 	private Volt convertVolt(Volt v, int i) {
 * 		return new Volt(v.getVolts()/i);
 *    }
 * }
 *
 *
 */