
import javax.swing.*;
import java.awt.*;
public class server extends JFrame {
	server()
	{
		setLayout(null);
		JPanel p1=new JPanel();
		p1.setBackground(new Color(7,94,84));
		p1.setBounds(0,0,450,60);
		p1.setLayout(null);
		add(p1);
		ImageIcon i1=new ImageIcon(server.class.getResource("resources\\3.png"));
		Image i2=i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel back=new JLabel(i3);
		back.setBounds(5,20,25,25);
		p1.add(back);
		
		setSize(450,700);
		setLocation(200,50);
		getContentPane().setBackground(Color.white);
		setVisible(true);
	}
	
  public static void main(String[] args)
  {
	  new server();
  }
}
