package iu3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;

public class femtonspelmain extends JFrame implements ActionListener{
	int test=0;
	
	JPanel p=new JPanel();
	
	JPanel p2=new JPanel();
	
	static JButton startnew=new JButton("starta nytt spel");
	static JButton win=new JButton("");
	static JButton movecount=new JButton("Antal drag: 0");
	
	static int moves=0;
	
	
	
	static JButton b1=new JButton("1");
	static JButton b2=new JButton("2");
	static JButton b3=new JButton("3");
	static JButton b4=new JButton("4");
	static JButton b5=new JButton("5");
	static JButton b6=new JButton("6");
	static JButton b7=new JButton("7");
	static JButton b8=new JButton("8");
	static JButton b9=new JButton("9");
	static JButton b10=new JButton("10");
	static JButton b11=new JButton("11");
	static JButton b12=new JButton("12");
	static JButton b13=new JButton("13");
	static JButton b14=new JButton("14");
	static JButton b15=new JButton("15");
	static JButton b16=new JButton("empty");
	
	static JButton helpbutton1=new JButton("help");
	static JButton helpbutton2=new JButton("help");
	static JButton helpbutton3=new JButton("help");
	static JButton helpbutton4=new JButton("help");
	static JButton helpbutton5=new JButton("help");
	static JButton helpbutton6=new JButton("help");
	static JButton helpbutton7=new JButton("help");
	static JButton helpbutton8=new JButton("help");
	
	static JButton[] tobemixed= {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16};
	
	static JButton[] mixed=shuffled.shuffled(tobemixed);
	
	static JButton[] buttonlist={helpbutton1,helpbutton2,helpbutton3,helpbutton4,b1,b2,b3,
			b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,helpbutton5,helpbutton6,helpbutton7,helpbutton8};
			
	static JButton[] validchoices=new JButton[4];
	
	static JButton[] setready=addmixed.merge(buttonlist,mixed);
	
	
	public femtonspelmain() {
		setLayout(new GridLayout(3,1));
		
		p2.setLayout(new GridLayout(1,3));
		p2.add(movecount);p2.add(win);p2.add(startnew);
		
		validchoices=findvalids.findvalids(setready);
		p.setLayout(new GridLayout(4,4));
		
		for(int i=0;i<mixed.length;i++) {
			p.add(mixed[i]);
		}
		
		
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
		b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
		b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
		b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
		b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);
		b16.addActionListener(this); 
		
		startnew.addActionListener(this);
		
		
		
		movecount.setVerticalAlignment(SwingConstants.CENTER);
		movecount.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 30));
		movecount.setForeground(Color.RED);
		
		win.setVisible(true);
		
		JLabel name=new JLabel("15-SPEL");
		name.setOpaque(true);
		name.setVerticalAlignment(SwingConstants.CENTER);
		name.setVerticalAlignment(JLabel.CENTER);
        name.setHorizontalAlignment(JLabel.CENTER);
		name.setFont(new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 170));
		name.setForeground(Color.RED);
		name.setBackground(Color.LIGHT_GRAY);
		name.setVerticalAlignment(SwingConstants.CENTER);
		
		add(name);
		add(p2);
		add(p);
		pack(); 
	    setVisible(true);
	    b16.setVisible(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton called=(JButton) e.getSource();
	
		if(called==startnew) {
			int test=100;
			System.out.println(test);
			moves=0;
			JButton[] tobemixed= {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16};
			
			mixed=shuffled.shuffled(tobemixed);
			
			setready=addmixed.merge(buttonlist,mixed);
			
			for(int i=0;i<mixed.length;i++) {
				p.add(mixed[i]);
			}
			win.setText("");
			Arrays.fill(validchoices, null);
			validchoices=findvalids.findvalids(setready);
			
			
			add(p2);
			add(p);
			pack(); 
		    setVisible(true);
		  
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		   
			
		}else {
			Arrays.fill(validchoices, null);
			validchoices=findvalids.findvalids(setready);  
			for(int i=0;i<4;i++) {
				if(validchoices[i]==called) {
					moves+=1;
					switchtext.switchtext(called,setready);
					won.won(setready);
				}
			}
			
		}
		
		String smove=Integer.toString(moves);
		String smovestring="Antal drag: "+smove;
		movecount.setText(smovestring);

		
		
	}

	public static void main(String[] args) {
		femtonspelmain gr=new femtonspelmain();
         
	}
	
	
	

}