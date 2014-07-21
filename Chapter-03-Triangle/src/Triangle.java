/**
 * Created by adminlocal on 24.04.2014.
 */
public class Triangle {

    int height;
    int length;
    double area;

    public static void main (String [] args) {

        int x = 0;                                                      //1
        Triangle [] ta = new Triangle[4];                               //2

        while (x < 4) {                                                 //3

            ta[x] = new Triangle();                                     //4
            ta[x].height = (x + 1) * 2;                                 //5
            ta[x].length = x + 4;                                       //6
            ta[x].setArea();                                            //7

            System.out.print("Треугольник " + x + ", зона");            //8
            System.out.println(" = " + ta[x].area);

            x = x + 1;                                                  //9

        }

        int y = x;                                                      //10
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;

        System.out.print("y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }

    void setArea() {

        area = (height * length ) / 2;                                   //11
    }

}
