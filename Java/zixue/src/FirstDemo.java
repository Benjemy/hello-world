import java.awt.Color;
import javax.swing.*;
class FirstFrame extends JFrame {
	FirstFrame(){
		setTitle("我的第一个GUI");
		setBounds(300,200,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label=new JLabel("Hello Java!");
		btn=new JButton("按钮");
		btn=new JButton("Change");
		JPanel p=new JPanel();
		p.add(label);
		p.add(btn);
		p.add(btn1);
		setContentPane(p);
	}
	private JButton btn;
	private JButton btn1;
}
public class FirstDemo{
	public static void main(String[] args){
		FirstFrame frm=new FirstFrame();
		frm.setVisible(true);
	}
}
