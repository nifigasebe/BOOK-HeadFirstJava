import java.io.Serializable;

/**
 * Created by alexeychizhov on 04.11.2014.
 */
public class DungeonGame implements Serializable {

    public int x = 3;
    transient long y = 4;
    private short z = 5;

    int getX(){
        return x;
    }

    long getY() {
        return y;
    }

    short getZ() {
        return z;
    }

}