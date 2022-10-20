import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class CJFrame extends JFrame implements ActionListener {
    private JPanel contentPane;
    CJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator!!!");
        setBounds(100,100,450,300);
        setVisible(true);

        contentPane =new JPanel();
        contentPane.setLayout(new GridLayout(4,4,5,5));
        setContentPane(contentPane);

        JButton btn1 = new JButton("7");
        btn1.addActionListener(this);
        contentPane.add(btn1);

        JButton btn2 = new JButton("8");
        btn2.addActionListener(this);
        contentPane.add(btn2);

        JButton btn3 = new JButton("9");
        btn3.addActionListener(this);
        contentPane.add(btn3);

        JButton btn4 = new JButton("÷");
        btn4.addActionListener(this);
        contentPane.add(btn4);

        JButton btn5 = new JButton("4");
        btn5.addActionListener(this);
        contentPane.add(btn5);

        JButton btn6 = new JButton("5");
        btn6.addActionListener(this);
        contentPane.add(btn6);

        JButton btn7 = new JButton("6");
        btn7.addActionListener(this);
        contentPane.add(btn7);

        JButton btn8 = new JButton("x");
        btn8.addActionListener(this);
        contentPane.add(btn8);

        JButton btn9 = new JButton("1");
        btn9.addActionListener(this);
        contentPane.add(btn9);

        JButton btn10 = new JButton("2");
        btn10.addActionListener(this);
        contentPane.add(btn10);

        JButton btn11 = new JButton("3");
        btn11.addActionListener(this);
        contentPane.add(btn11);

        JButton btn12 = new JButton("-");
        btn12.addActionListener(this);
        contentPane.add(btn12);

        JButton btn13 = new JButton(".");
        btn13.addActionListener(this);
        contentPane.add(btn13);

        JButton btn14 = new JButton("0");
        btn14.addActionListener(this);
        contentPane.add(btn14);

        JButton btn15 = new JButton("=");
        btn15.addActionListener(this);
        contentPane.add(btn15);

        JButton btn16 = new JButton("+");
        btn16.addActionListener(this);
        contentPane.add(btn16);
    }


    public void actionPerformed(ActionEvent e){
        JButton nameBtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null,nameBtn.getText());
    }


}
public class calculator{
    public static void main(String[] args){
        CJFrame f1 = new CJFrame();
    }
}
