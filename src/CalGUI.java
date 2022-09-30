import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalGUI 
{
    JFrame fr;
    JPanel panBtn,panTf;
    JButton [] btnArr;
    JTextField tfMain, tfSub;
    BtnHandler hnd;
    
    public CalGUI() 
    {
        initGUI();
    }
    public void initGUI()
    {
        fr = new JFrame("CALCULATOR");
        fr.setLayout(new BorderLayout());
        
        panTf = new JPanel();
        panTf.setLayout(new GridLayout(2, 1));
        
        panBtn = new JPanel();
        panBtn.setLayout(new GridLayout(5, 4));
        
        hnd = new BtnHandler(this);
        Font fmaj = new Font("San-Serif", Font.BOLD, 40), fmin = new Font("San-Serif", Font.BOLD, 20),  fbtn = new Font("San-Serif", Font.BOLD, 20);
        
        tfMain = new JTextField(30);
        tfMain.setBorder(null);
        tfMain.setHorizontalAlignment(JTextField.RIGHT);    //to write on right side.
        tfMain.setEditable(false);
        tfMain.setFont(fmaj);
        
        tfSub = new JTextField(30);
        tfSub.setBorder(null);
        tfSub.setHorizontalAlignment(JTextField.RIGHT);
        tfSub.setEditable(false);
        tfSub.setFont(fmin);
        
        panTf.add(tfSub);
        panTf.add(tfMain);
        
        btnArr = new JButton[20];
        
        btnArr[0] = new JButton();
        btnArr[0].setText("CE");
        btnArr[0].setActionCommand("CE");
        btnArr[0].addActionListener(hnd);
        btnArr[0].setBackground(java.awt.Color.gray);
        btnArr[0].setForeground(java.awt.Color.WHITE);
        btnArr[0].setFont(fbtn);
        panBtn.add(btnArr[0]);
        
        
                
        btnArr[1] = new JButton();
        btnArr[1].setText("C");
        btnArr[1].setActionCommand("C");
        btnArr[1].addActionListener(hnd);
        btnArr[1].setBackground(java.awt.Color.BLUE);
        btnArr[1].setForeground(java.awt.Color.WHITE);
        btnArr[1].setFont(fbtn);
        panBtn.add(btnArr[1]);
        
        btnArr[2] = new JButton();
        btnArr[2].setText("+/-");
        btnArr[2].setActionCommand("+/-");
        btnArr[2].addActionListener(hnd);
        btnArr[2].setBackground(java.awt.Color.gray);
        btnArr[2].setForeground(java.awt.Color.WHITE);
        btnArr[2].setFont(fbtn);
        panBtn.add(btnArr[2]);
        
        btnArr[3] = new JButton();
        btnArr[3].setText("⇦");
        btnArr[3].setActionCommand("<-");
        btnArr[3].addActionListener(hnd);
        btnArr[3].setBackground(java.awt.Color.gray);
        btnArr[3].setForeground(java.awt.Color.WHITE);
        btnArr[3].setFont(fbtn);
        panBtn.add(btnArr[3]);
        
        btnArr[4] = new JButton();
        btnArr[4].setText("1");
        btnArr[4].setActionCommand("1");
        btnArr[4].addActionListener(hnd);
        btnArr[4].setBackground(java.awt.Color.black);
        btnArr[4].setForeground(java.awt.Color.WHITE);
        btnArr[4].setFont(fbtn);
        panBtn.add(btnArr[4]);
        
        btnArr[5] = new JButton();
        btnArr[5].setText("2");
        btnArr[5].setActionCommand("2");
        btnArr[5].addActionListener(hnd);
        btnArr[5].setBackground(java.awt.Color.black);
        btnArr[5].setForeground(java.awt.Color.WHITE);
        btnArr[5].setFont(fbtn);
        panBtn.add(btnArr[5]);
        
        btnArr[6] = new JButton();
        btnArr[6].setText("3");
        btnArr[6].setActionCommand("3");
        btnArr[6].addActionListener(hnd);
        btnArr[6].setBackground(java.awt.Color.black);
        btnArr[6].setForeground(java.awt.Color.WHITE);
        btnArr[6].setFont(fbtn);
        panBtn.add(btnArr[6]);
        
        btnArr[7] = new JButton();
        btnArr[7].setText("+");
        btnArr[7].setActionCommand("+");
        btnArr[7].addActionListener(hnd);
        btnArr[7].setBackground(java.awt.Color.gray);
        btnArr[7].setForeground(java.awt.Color.WHITE);
        btnArr[7].setFont(fbtn);
        panBtn.add(btnArr[7]);
        
        btnArr[8] = new JButton();
        btnArr[8].setText("4");
        btnArr[8].setActionCommand("4");
        btnArr[8].addActionListener(hnd);
        btnArr[8].setBackground(java.awt.Color.black);
        btnArr[8].setForeground(java.awt.Color.WHITE);
        btnArr[8].setFont(fbtn);
        panBtn.add(btnArr[8]);
        
        btnArr[9] = new JButton();
        btnArr[9].setText("5");
        btnArr[9].setActionCommand("5");
        btnArr[9].addActionListener(hnd);
        btnArr[9].setBackground(java.awt.Color.black);
        btnArr[9].setForeground(java.awt.Color.WHITE);
        btnArr[9].setFont(fbtn);
        panBtn.add(btnArr[9]);
        
        btnArr[10] = new JButton();
        btnArr[10].setText("6");
        btnArr[10].setActionCommand("6");
        btnArr[10].addActionListener(hnd);
        btnArr[10].setBackground(java.awt.Color.black);
        btnArr[10].setForeground(java.awt.Color.WHITE);
        btnArr[10].setFont(fbtn);
        panBtn.add(btnArr[10]);
        
        btnArr[11] = new JButton();
        btnArr[11].setText("-");
        btnArr[11].setActionCommand("-");
        btnArr[11].addActionListener(hnd);
        btnArr[11].setBackground(java.awt.Color.gray);
        btnArr[11].setForeground(java.awt.Color.WHITE);
        btnArr[11].setFont(fbtn);
        panBtn.add(btnArr[11]);
        
        btnArr[12] = new JButton();
        btnArr[12].setText("7");
        btnArr[12].setActionCommand("7");
        btnArr[12].addActionListener(hnd);
        btnArr[12].setBackground(java.awt.Color.black);
        btnArr[12].setForeground(java.awt.Color.WHITE);
        btnArr[12].setFont(fbtn);
        panBtn.add(btnArr[12]);
        
        btnArr[13] = new JButton();
        btnArr[13].setText("8");
        btnArr[13].setActionCommand("8");
        btnArr[13].addActionListener(hnd);
        btnArr[13].setBackground(java.awt.Color.black);
        btnArr[13].setForeground(java.awt.Color.WHITE);
        btnArr[13].setFont(fbtn);
        panBtn.add(btnArr[13]);
        
        btnArr[14] = new JButton();
        btnArr[14].setText("9");
        btnArr[14].setActionCommand("9");
        btnArr[14].addActionListener(hnd);
        btnArr[14].setBackground(java.awt.Color.black);
        btnArr[14].setForeground(java.awt.Color.WHITE);
        btnArr[14].setFont(fbtn);
        panBtn.add(btnArr[14]);
        
        btnArr[15] = new JButton();
        btnArr[15].setText("×");
        btnArr[15].setActionCommand("*");
        btnArr[15].addActionListener(hnd);
        btnArr[15].setBackground(java.awt.Color.gray);
        btnArr[15].setForeground(java.awt.Color.WHITE);
        btnArr[15].setFont(fbtn);
        panBtn.add(btnArr[15]);
        
        btnArr[16] = new JButton();
        btnArr[16].setText(".");
        btnArr[16].setActionCommand(".");
        btnArr[16].addActionListener(hnd);
        btnArr[16].setBackground(java.awt.Color.gray);
        btnArr[16].setForeground(java.awt.Color.WHITE);
        btnArr[16].setFont(fbtn);
        panBtn.add(btnArr[16]);
        
        btnArr[17] = new JButton();
        btnArr[17].setText("0");
        btnArr[17].setActionCommand("0");
        btnArr[17].addActionListener(hnd);
        btnArr[17].setBackground(java.awt.Color.black);
        btnArr[17].setForeground(java.awt.Color.WHITE);
        btnArr[17].setFont(fbtn);        
        panBtn.add(btnArr[17]);
        
        btnArr[18] = new JButton();
        btnArr[18].setText("=");
        btnArr[18].setActionCommand("=");
        btnArr[18].addActionListener(hnd);
        btnArr[18].setBackground(java.awt.Color.red);
        btnArr[18].setForeground(java.awt.Color.WHITE);
        btnArr[18].setFont(fbtn);
        panBtn.add(btnArr[18]);
        
        btnArr[19] = new JButton();
        btnArr[19].setText("÷");
        btnArr[19].setActionCommand("/");
        btnArr[19].addActionListener(hnd);
        btnArr[19].setBackground(java.awt.Color.gray);
        btnArr[19].setForeground(java.awt.Color.WHITE);
        btnArr[19].setFont(fbtn);
        panBtn.add(btnArr[19]);
        
        
        fr.add(panTf,BorderLayout.NORTH);
        fr.add(panBtn,BorderLayout.CENTER);
        
        fr.setSize(400,400);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fr.pack();
        fr.setVisible(true);
    }
}
