import java.awt.*;

/**
 * Created by adminlocal on 29.09.2014.
 */
public class Colors {

    public Color get1RandomColor() {

        int random = (int)(Math.random() * 255);
        Color randomColor = new Color(random);
        return randomColor;
    }

    public Color get3RandomColor() {
        int random1 = (int)(Math.random() * 255);
        int random2 = (int)(Math.random() * 255);
        int random3 = (int)(Math.random() * 255);

        Color randomColor = new Color(random1,random2,random3);
        return randomColor;
    }

    public GradientPaint getGradient() {

        int x1 = 300;
        int y1 = 100;
        int x2 = 250;
        int y2 = 200;

        Colors colors = new Colors();

        GradientPaint gradient = new GradientPaint(x1,y1,colors.get3RandomColor(),x2,y2,colors.get3RandomColor());
        return gradient;
    }
}