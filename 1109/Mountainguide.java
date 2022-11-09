import javax.annotation.processing.SupportedOptions;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
class MyJFrame extends JFrame implements ListSelectionListener{

    private String st = "可選取地名...";
    private JList lst;
    private JTextArea jta;
    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("找各地名山");
        setBounds(50,50,200,250);
        setVisible(true);
        setLayout(null);



        JLabel jl1 = new JLabel("找各地名山：");
        add(jl1);
        jl1.setBounds(30,50,80,20);
        jl1.setLayout(new FlowLayout(FlowLayout.LEFT));
       
        String[] city={"台北","宜蘭","桃園","台中","彰化","南投"};
        lst=new JList<>(city);
        add(lst);
        lst.addListSelectionListener(this);
        lst.setBounds(120,10,60,100);
        lst.setLayout(new FlowLayout(FlowLayout.LEFT));
        lst.setVisibleRowCount(4);

        JScrollPane jsp = new JScrollPane(lst,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(120,10,50,100);
        add(jsp);

        jta = new JTextArea(st);
        add(jta);
        jta.setBounds(20, 130, 150, 60);
        jta.setLineWrap(true);

        JScrollPane jsp2 = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp2.setBounds(20,130,150,60);
        add(jsp2);

    }
    @Override    
    public void valueChanged(ListSelectionEvent e){
        String str = "";
        List selected = lst.getSelectedValuesList();

        if(selected!=null){
            
                if(selected.contains("台北")){
                    str += "台北 名山：　陽明山\n";
                }
                if(selected.contains("宜蘭")){
                    str += "宜蘭 名山：　鶯子嶺山\n";
                }
                if(selected.contains("桃園")){
                    str += "桃園 名山：　觀音山\n";
                }
                if(selected.contains("台中")){
                    str += "台中 名山：　梨山\n";
                }
                if(selected.contains("彰化")){
                    str += "彰化 名山：　八卦山\n";
                }
                if(selected.contains("南投")){
                    str += "南投 名山：　守城大山\n";
                }
            }
        jta.setText(str);
    }

    
}


public class Mountainguide {
    public static void main(String[] args) throws Exception{
    MyJFrame f1 = new MyJFrame();
    }
}
