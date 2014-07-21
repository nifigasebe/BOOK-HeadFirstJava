/**
 * Created by alexeychizhov on 13.07.2014.
 */
public class SimUnit {

    String botType;
    public static int v2 = 0;
    public static int v3 = 0;
    public static int rt = 0;

    SimUnit(){}

    SimUnit(String type) {

        botType = type;
        System.out.println("Создан объект SimUnit" + botType);

        if ("RetentionBot".equals(botType)) {
            rt++;
        }
        if ("V3Radiator".equals(botType)) {
            v2++;
        }
        if ("V3Radiator".equals(botType)) {
            v3++;
        }
    }

    int powerUse(){

        if ("RetentionBot".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}
