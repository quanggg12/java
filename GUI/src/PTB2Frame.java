import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public final class PTB2Frame extends JFrame implements ActionListener {
    JPanel formPanel = new JPanel();
    JLabel aLabel = new JLabel("He so a: ");
    JTextField txta = new JTextField();

    JLabel bLabel = new JLabel("He so b: ");
    JTextField txtb = new JTextField();

    JLabel cLabel = new JLabel("He so c: ");
    JTextField txtc = new JTextField();

    JLabel kqLabel = new JLabel("Nghiem: ");
    JTextField txtkq = new JTextField();

    JPanel controlButtonsPanel = new JPanel();
    JButton btnGiai = new JButton("Giai pt");
    JButton btnClear = new JButton("Lam lai");
    JButton btnExit = new JButton("Thoat");

    public PTB2Frame() {
        buildFormPanel();
        buildControlButtonsPanel();
        setFont();
        setSize(450, 400);
        setTitle("Giai pt bac 2");
        setLocationRelativeTo(null);
        setDefaulCLoseOperation(EXIT_ON_CLOSE);
    }


    private void buildFormPanel() {
        add(BorderLayout.CENTER, formPanel);
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(8, 8,8, 8); // padding tren duoi phai trai
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        formPanel.add(txta, c);
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        formPanel.add(bLabel, c);
    }

    private void buildControlButtonsPanel() {
        add(BorderLayout.SOUTH, controlButtonsPanel);
        controlButtonsPanel.add(btnGiai);
        controlButtonsPanel.add(btnClear);
        controlButtonsPanel.add(btnExit);
        // dang ki trinh listener
        btnGiai.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);
        // set mau nen
        btnGiai.setBackground(Color.LIGHT_GRAY);
        btnClear.setBackground(Color.LIGHT_GRAY);
        btnExit.setBackground(Color.LIGHT_GRAY);
    }

    public void setFont() {
        Font font = new Font("Arial", 1, 10);
        aLabel.setFont(font);
        bLabel.setFont(font);
        cLabel.setFont(font);
        kqLabel.setFont(font);

        txta.setFont(font); txta.setForeground(Color.BLUE);
        txtb.setFont(font); txtb.setForeground(Color.BLUE);
        txtc.setFont(font); txtc.setForeground(Color.BLUE);
        txtkq.setFont(font); txtkq.setForeground(Color.BLUE);

        btnGiai.setFont(font);
        btnClear.setFont(font);
        btnExit.setFont(font);
    }

    public void actionPerformed(ActionEvent e) {
        PTB2Frame f = new PTB2Frame();
        if (e.getSource().equals(btnGiai)) {
            double a = Double.parseDouble(txta.getText());
            double b = Double.parseDouble(txtb.getText());
            double c = Double.parseDouble(txtc.getText());
            PTB2 pt1 = new PTB2(a, b, c);
            txtkq.setText(pt1.giaiPT());
        }
        if (e.getSource().equals(btnClear)) {
            txta.setText("");
            txtb.setText("");
            txtc.setText("");
            txta.requestFocus();
            JOptionPane.showMessageDialog(f, "Clear Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource().equals(btnExit)) {
            int ret = JOptionPane.showConfirmDialog(f, "Do you want to exit", "Exit", JOptionPane.YES_NO_OPTION);
            if (ret == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        PTB2Frame frame1 = new PTB2Frame();
        frame1.setVisible(true);
    }

}
