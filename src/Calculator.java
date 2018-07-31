import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField t2;
	private JTextField t1;
	double x;
	double y;
	double z;
	String sign;
	double rslt;
	double l;
	double i;
	String w;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.getContentPane().setForeground(new Color(192, 192, 192));
		frame.setForeground(SystemColor.activeCaptionBorder);
		frame.setBackground(UIManager.getColor("Button.shadow"));
		frame.setBounds(100, 100, 342, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.RIGHT);
		t2.setBackground(SystemColor.inactiveCaption);
		t2.setBounds(10, 11, 306, 28);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setBackground(SystemColor.inactiveCaption);
		t1.setBounds(10, 38, 306, 28);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("sin");
		b1.setBounds(10, 77, 52, 28);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x = Double.parseDouble(t1.getText());
				String a;
				
				
				 l=Math.sin((x/180)*3.141592654);
				 i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("sin("+x+")");
				 sign = "SIN";
			}
		});
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("cos");
		b2.setBounds(64, 77, 64, 28);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				if(x==90){
					z=0;
					a=String.valueOf(z);
					t1.setText(a);
				}else
				
				 l=Math.cos((x/180)*3.141592654);
				 //i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("cos("+x+")");
				 sign = "COS";
			}
		});
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("tan");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				if(x==90){
					//z=0;
					//a=String.valueOf(z);
					a="Math Error";
					t1.setText("a");
				}else
				
				 l=Math.tan((x/180)*3.141592654);
				 i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("ten("+x+")");
				 sign = "TEN";
			}
		});
		b3.setBounds(129, 77, 52, 28);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("log");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				
				
				 l=Math.log10(x);
				// i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("log("+x+")");
				 sign = "LOG";
			}
		});
		b4.setBounds(10, 107, 52, 28);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("sin^-1");
		b5.setBackground(new Color(30, 144, 255));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				
				
				 l=1/(Math.sin((x/180)*3.141592654));
				// i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("sin^-1("+x+")");
				 sign = "SIN";
			}
		});
		b5.setHorizontalAlignment(SwingConstants.LEADING);
		b5.setBounds(249, 77, 77, 28);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("cos^-1");
		b6.setBackground(new Color(30, 144, 255));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				
				
				 l=1/(Math.cos((x/180)*3.141592654));
				// i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("cos^-1("+x+")");
				 sign = "COS";
			}
		});
		b6.setBounds(249, 109, 77, 25);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("tan^-1");
		b7.setBackground(new Color(30, 144, 255));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				
				
				 l=1/(Math.tanh(x));
				// i=Math.toDegrees(l);
				 a = String.valueOf(l);
				 t1.setText(a);
				 t2.setText("ten^-1("+x+")");
				 sign = "TEN";
			}
		});
		b7.setBounds(249, 139, 77, 25);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("x^2");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a;
				  String p = t1.getText();
					l = x*x;
					a = String.valueOf(l);
					// t1.setText(q);
					 t1.setText(a);
					 t2.setText(p+"^2");
				 sign  = "√";
				
			}
		});
		b8.setBounds(64, 107, 64, 28);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("\u221A");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String a ;
				  String p = t1.getText();
				  l = Math.sqrt(x);
				  a=String.valueOf(l);
					
					 t1.setText(a);
					 //t1.setText(q);
					 t2.setText("√"+p);
				 sign  = "√";
			}
		});
		b9.setBounds(129, 107, 52, 28);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton("M+");
		b10.setBackground(new Color(222, 184, 135));
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				    w = t2.getText();
				   t2.setText(null);
				   
				   
			}
		});
		b10.setBounds(182, 77, 64, 28);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton("M-");
		b11.setBackground(new Color(222, 184, 135));
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = w;
				t1.setText(a);
				
			}
		});
		b11.setBounds(182, 110, 64, 25);
		frame.getContentPane().add(b11);
		
		JButton b12 = new JButton("MC");
		b12.setBackground(new Color(222, 184, 135));
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w=null;
			}
		});
		b12.setBounds(182, 139, 64, 25);
		frame.getContentPane().add(b12);
		
		JButton b13 = new JButton("7");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"7";
				t1.setText(q);
			}
		});
		b13.setBounds(10, 177, 58, 35);
		frame.getContentPane().add(b13);
		
		JButton b14 = new JButton("8");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"8";
				t1.setText(q);
			}
		});
		b14.setBounds(78, 177, 58, 35);
		frame.getContentPane().add(b14);
		
		JButton b15 = new JButton("9");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"9";
				t1.setText(q);
			}
		});
		b15.setBounds(144, 177, 58, 35);
		frame.getContentPane().add(b15);
		
		JButton b16 = new JButton("4");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"4";
				t1.setText(q);
			}
		});
		b16.setBounds(10, 217, 58, 35);
		frame.getContentPane().add(b16);
		
		JButton b17 = new JButton("5");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				
				String q = p+"5";
				t1.setText(q);
			}
		});
		b17.setBounds(78, 217, 58, 35);
		frame.getContentPane().add(b17);
		
		JButton b18 = new JButton("6");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"6";
				t1.setText(q);
			}
		});
		b18.setBounds(144, 217, 58, 35);
		frame.getContentPane().add(b18);
		
		JButton b19 = new JButton("1");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"1";
				t1.setText(q);
			}
		});
		b19.setBounds(10, 256, 58, 35);
		frame.getContentPane().add(b19);
		
		JButton b20 = new JButton("2");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"2";
				t1.setText(q);
			}
		});
		b20.setBounds(78, 256, 58, 35);
		frame.getContentPane().add(b20);
		
		JButton b21 = new JButton("3");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"3";
				t1.setText(q);
			}
		});
		b21.setBounds(144, 256, 58, 35);
		frame.getContentPane().add(b21);
		
		JButton b22 = new JButton("AC");
		b22.setBackground(new Color(178, 34, 34));
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
			}
		});
		b22.setBounds(10, 295, 58, 47);
		frame.getContentPane().add(b22);
		
		JButton b23 = new JButton("0");
		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+"0";
				t1.setText(q);
			}
		});
		b23.setBounds(78, 295, 58, 47);
		frame.getContentPane().add(b23);
		
		JButton b24 = new JButton(".");
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				String q = p+".";
				t1.setText(q);
			}
		});
		b24.setBounds(144, 295, 58, 47);
		frame.getContentPane().add(b24);
		
		JButton b25 = new JButton("\u00F7");
		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				  String p = t1.getText();
					String q = " ";
					 t1.setText(q);
					 t1.setText(q);
					 t2.setText(p+"÷");
				 sign = "/";
			}
		});
		b25.setBounds(265, 175, 51, 37);
		frame.getContentPane().add(b25);
		
		JButton b26 = new JButton("X");
		b26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  x = Double.parseDouble(t1.getText());
				  String p = t1.getText();
					String q = " ";
					 t1.setText(q);
					 t1.setText(q);
					 t2.setText(p+"×");
					 sign = "*";
			}
		});
		b26.setBounds(209, 175, 46, 37);
		frame.getContentPane().add(b26);
		
		JButton b27 = new JButton("-");
		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(t1.getText());
				String p = t1.getText();
				String q = " ";
				 t1.setText(q);
				 t1.setText(q);
				 t2.setText(p+"-");
				 
				 sign = "-";
			}
		});
		b27.setBounds(264, 217, 52, 37);
		frame.getContentPane().add(b27);
		
		JButton b28 = new JButton("+");
		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  x = Double.parseDouble(t1.getText());
				   String p = t1.getText();
				   String q = " ";
				 t1.setText(q);
				 t2.setText(p+"+");
				 
				 sign = "+";
			}
		});
		b28.setBounds(209, 217, 46, 74);
		frame.getContentPane().add(b28);
		
		JButton b29 = new JButton("DEL");
		b29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = t1.getText();
				int o = p.length();
				String q =p.substring(0,o-1);
				t1.setText(q);
			}
		});
		b29.setBounds(258, 256, 58, 86);
		frame.getContentPane().add(b29);
		
		JButton b30 = new JButton("=");
		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a;
				double y = Double.parseDouble(t1.getText());
				if(sign== "+"){
					rslt =x+y;
					 a =String.valueOf(rslt);
					t1.setText(a);
					t2.setText(x+"+"+y);
					
				}else if(sign== "-"){
					rslt = x-y;
					 a =String.valueOf(rslt);
					t1.setText(a);
					t2.setText(x+"-"+y);
				}else if(sign== "*"){
					rslt = x*y;
					 a =String.valueOf(rslt);
					t1.setText(a);
					t2.setText(x+"×"+y);
				}else if(sign== "/"){
					rslt = x/y;
					 a =String.valueOf(rslt);
					t1.setText(a);
					t2.setText(x+"÷"+y);
				}else if(sign== "%"){
					rslt = x*(y/100);
					 a =String.valueOf(rslt);
					t1.setText(a);
					t2.setText(x+"("+y+"%)");
			}
			}
		});
		b30.setBounds(209, 295, 46, 47);
		frame.getContentPane().add(b30);
		
		JButton b31 = new JButton("%");
		b31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x= Double.parseDouble(t1.getText());
				
				String p = t1.getText();
				   String q = " ";
					 t1.setText(q);
					 t2.setText(p+"("+y+"%)");
				sign = "%";
				
			}
		});
		b31.setBounds(10, 140, 52, 24);
		frame.getContentPane().add(b31);
		
		JButton b32 = new JButton("π");
		b32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a;
				double p = 3.141592654;
				a = String.valueOf(p);
				t1.setText(a);
			}
		});
		b32.setBounds(64, 139, 64, 25);
		frame.getContentPane().add(b32);
		
		JButton b33 = new JButton("1/x");
		b33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=Double.parseDouble(t1.getText());
				String a;
				String p = t1.getText();
				double q = 1/x;
				a = String.valueOf(q);
				t1.setText(a);
				t2.setText("1/"+p);
			}
		});
		b33.setBounds(129, 140, 52, 24);
		frame.getContentPane().add(b33);
	}
}
