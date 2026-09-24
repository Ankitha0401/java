import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DivisionGUI extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton divideBtn;

    DivisionGUI() {
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Num1:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Num2:"));
        num2 = new JTextField();
        add(num2);

        divideBtn = new JButton("Divide");
        add(divideBtn);
        divideBtn.addActionListener(this);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        setTitle("Integer Division");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());

            int res = a / b;

            result.setText(String.valueOf(res));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter valid integers!"
            );

        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Cannot divide by zero!"
            );
        }
    }

    public static void main(String[] args) {
        new DivisionGUI();
    }
}