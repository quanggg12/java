import javax.swing.*;

public class ContainerDemo extends JFrame {
    public ContainerDemo() {
        JButton btt = new JButton("Submit");
        btt.setBounds(130, 50, 100, 40); // truc x, y, width, height
        add(btt); // them button vao JFrame
        setSize(400, 200);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ContainerDemo();
    }
}
