package iu3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class switchtext {
	
	static void switchtext(JButton bn,JButton[] buttonlist )  {
		String s1=bn.getText();
		System.out.println("switchtestcalled");
		//TimeUnit.SECONDS.sleep(3);
		bn.setVisible(false);
		System.out.println("swtichtext called, buttontext:  "+s1);
		//bn.setText(s2);
		for(int i=0;i<buttonlist.length;i++) {
			if(buttonlist[i].getText()=="empty") {
				buttonlist[i].setText(s1);
				String s2="empty";
				buttonlist[i].setVisible(true);
				//bn.setVisible(true);
				bn.setText(s2);
				break;
			}
		}
		
	}
}

class won{
	static void won(JButton[] buttonlist) {
		boolean stat=false;
		if(buttonlist[19].getText().equals("empty")) {
			stat=true;
			for(int i=4;i<18;i++) {
				 
				String s1=buttonlist[i].getText();
				String s2=buttonlist[i+1].getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				if(n1>=n2) {
					stat=false;
					break;
				}
			}
		}
		if(stat==true) {
			Arrays.fill(femtonspelmain.validchoices, null);
			femtonspelmain.win.setText("Grattis, du vann!");
		}
	}
	
	
	
	
}
