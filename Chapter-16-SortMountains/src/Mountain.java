/**
 * Created by Chizhov-as on 19.01.2015.
 */
public class Mountain {

    public String name;
    public int height;

    Mountain(String n,int h){
        name = n;
        height = h;
    }

    public String toString(){
        return name + " " + height;
    }
}

//Переопределение метода toString
