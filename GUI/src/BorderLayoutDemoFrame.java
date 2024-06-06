import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutDemoFrame extends JFrame {
    public BorderLayoutDemoFrame() {
        this.getContentPane().add(BorderLayout.NORTH, new JButton("NORTH"));
        this.getContentPane().add(BorderLayout.SOUTH, new JButton("SOUTH"));
        this.getContentPane().add(BorderLayout.CENTER, new JButton("CENTER"));
        this.getContentPane().add(BorderLayout.WEST, new JButton("WEST"));
        this.getContentPane().add(BorderLayout.EAST, new JButton("EAST"));
    }

    public static void main(String[] args) {
        BorderLayoutDemoFrame frame = new BorderLayoutDemoFrame();
        frame.setSize(400, 300);
        frame.setTitle("Border layout demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocation(null);
    }
}
