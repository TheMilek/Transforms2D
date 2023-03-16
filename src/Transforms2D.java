import java.awt.*;
import javax.swing.*;

public class Transforms2D extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        var g2d = (Graphics2D) g;
        var x = getWidth() / 2;
        var y = getHeight() / 2;
        int[] xPoints = new int[8];
        int[] yPoints = new int[8];
        var angle = 2 * Math.PI / 8;
        for (int i = 0; i < 8; i++) {
            var theta = i * angle + Math.PI / 8;
            xPoints[i] = x + (int) (150 * Math.cos(theta));
            yPoints[i] = y - (int) (150 * Math.sin(theta));
        }
        g2d.setColor(Color.GREEN);
        g2d.fillPolygon(xPoints, yPoints, 8);
    }

    public static void main(String[] args) {
        var frame = new JFrame("My Octagon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Transforms2D());
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}