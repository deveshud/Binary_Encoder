import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.*;

public class Front implements ActionListener,WindowListener{
JFrame f;
JPanel jp;
JTextField tf;
JButton b1;
String s="",str;
Front()
{ // Now this code runs Perfectly
	f=new JFrame("Binary Encoder");
	f.addWindowListener(this);
	jp=new JPanel();
	tf=new JTextField();
	tf.setText("Enter the code");
	b1=new JButton("ENCODE");
	b1.addActionListener(this);
URL url;
url=Front.class.getResource("/frontpage.png");
	JLabel label=new JLabel();
	ImageIcon icon=new ImageIcon(url);
    Image img = icon.getImage() ;  
	    Image newimg = img.getScaledInstance( 300,300,  java.awt.Image.SCALE_SMOOTH ) ;  
    icon = new ImageIcon( newimg );
    label.setIcon(icon);

	label.setBounds(0,0,300,300);
	jp.setLayout(null);
	tf.setBounds(50,70,200,40);
	b1.setBounds(100,200,65,50);
	label.add(tf);
	label.add(b1);
	jp.add(label);
	
	

	f.add(jp);
	f.setVisible(true);
	f.setSize(300,300);
	
	
}
	
	public static void main(String[] args) {
		
		Front ft=new Front();// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		
		str=tf.getText().toString();
		
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)=='A')
			{
				s=s+"-01000001";
			}
			else if(str.charAt(i)=='B')
			{
				s=s+"-01000010";
			}
			else if(str.charAt(i)=='C')
			{
				s=s+"-01000011";
			}
			else if(str.charAt(i)=='D')
			{
				s=s+"-01000100";
			}
			else if(str.charAt(i)=='E')
			{
				s=s+"-01000101";
			}
			else if(str.charAt(i)=='F')
			{
				s=s+"-01000110";
			}
			else if(str.charAt(i)=='G')
			{
				s=s+"-01000111";
			}
			else if(str.charAt(i)=='H')
			{
				s=s+"-01001000";
			}
			else if(str.charAt(i)=='I')
			{
				s=s+"-01001001";
			}
			else if(str.charAt(i)=='J')
			{
				s=s+"-01001010";
			}
			else if(str.charAt(i)=='K')
			{
				s=s+"-01001011";
			}
			else if(str.charAt(i)=='L')
			{
				s=s+"-01001100";
			}
			else if(str.charAt(i)=='M')
			{
				s=s+"-01001101";
			}	
			else if(str.charAt(i)=='N')
			{
				s=s+"-01001110";
			}
			else if(str.charAt(i)=='O')
			{
				s=s+"-01001111";
			}
			else if(str.charAt(i)=='P')
			{
				s=s+"-01010000";
			}	
			else if(str.charAt(i)=='Q')
			{
				s=s+"-01010001";
			}
			else if(str.charAt(i)=='R')
			{
				s=s+"-01010010";
			}
			else if(str.charAt(i)=='S')
			{
				s=s+"-01010011";
			}	
			else if(str.charAt(i)=='T')
			{
				s=s+"-01010100";
			}
			else if(str.charAt(i)=='U')
			{
				s=s+"-01010101";
			}
			else if(str.charAt(i)=='V')
			{
				s=s+"-010100110";
			}
			else if(str.charAt(i)=='W')
			{
				s=s+"-01010111";
			}
			else if(str.charAt(i)=='X')
			{
				s=s+"-01011000";
			}	
			else if(str.charAt(i)=='Y')
			{
				s=s+"-01011001";
			}
			else if(str.charAt(i)=='Z')
			{
				s=s+"-01011010";
			}
			else if(str.charAt(i)=='a')
			{
				s=s+"-01100001";
			}
			else if(str.charAt(i)=='b')
			{
				s=s+"-01100010";
			}
			else if(str.charAt(i)=='c')
			{
				s=s+"-01100011";
			}
			else if(str.charAt(i)=='d')
			{
				s=s+"-01100100";
			}
			else if(str.charAt(i)=='e')
			{
				s=s+"-01100101";
			}
			else if(str.charAt(i)=='f')
			{
				s=s+"-01100110";
			}
			else if(str.charAt(i)=='g')
			{
				s=s+"-01100111";
			}
			else if(str.charAt(i)=='h')
			{
				s=s+"-01101000";
			}
			else if(str.charAt(i)=='i')
			{
				s=s+"-01101001";
			}
			else if(str.charAt(i)=='j')
			{
				s=s+"-01101010";
			}
			else if(str.charAt(i)=='k')
			{
				s=s+"-01101011";
			}
			else if(str.charAt(i)=='l')
			{
				s=s+"-01101100";
			}
			else if(str.charAt(i)=='m')
			{
				s=s+"-01101101";
			}	
			else if(str.charAt(i)=='n')
			{
				s=s+"-01101110";
			}
			else if(str.charAt(i)=='o')
			{
				s=s+"-01101111";
			}
			else if(str.charAt(i)=='p')
			{
				s=s+"-0111000";
			}	
			else if(str.charAt(i)=='q')
			{
				s=s+"-01110001";
			}
			else if(str.charAt(i)=='r')
			{
				s=s+"-01110010";
			}
			else if(str.charAt(i)=='s')
			{
				s=s+"-01110011";
			}	
			else if(str.charAt(i)=='t')
			{
				s=s+"-01110100";
			}
			else if(str.charAt(i)=='u')
			{
				s=s+"-01110101";
			}
			else if(str.charAt(i)=='v')
			{
				s=s+"-011100110";
			}
			else if(str.charAt(i)=='w')
			{
				s=s+"-01110111";
			}
			else if(str.charAt(i)=='x')
			{
				s=s+"-01111000";
			}	
			else if(str.charAt(i)=='y')
			{
				s=s+"-01111001";
			}
			else 
			{
				s=s+"-01111010";
			}
		}
		
		JOptionPane.showMessageDialog(f,"Encoded data=	"+s);
	}
	}

