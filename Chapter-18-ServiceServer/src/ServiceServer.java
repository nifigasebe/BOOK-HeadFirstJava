/**
 * Created by Chizhov-AS on 10.02.2015.
 */

import java.rmi.*;
public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviceKey) throws RemoteException;
}