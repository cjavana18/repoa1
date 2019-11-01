package iu3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class findvalids {
	static JButton[] valids=new JButton[4];
	
	static JButton[] findvalids(JButton[] allbuttons) {
		int ind=0;
		label2:
		for(int i=0;i<allbuttons.length;i++) {
			if(allbuttons[i].getText()=="empty") {
				ind=i-4+1; //för att motsvara platsen/talet på grid brickan
				break label2;
			}
		}
		
		if(ind==4 || ind==8 || ind==12) {
			for (int i=4;i<20;i++) {
				JButton temp=allbuttons[i];
				if(//allbuttons[i-1].getText()=="empty" || 
				   allbuttons[i+1].getText()=="empty" ||
				   allbuttons[i-4].getText()=="empty" ||
				   allbuttons[i+4].getText()=="empty") {
					System.out.println("validSPACE FOUND   aaaa111111    "+temp.getText());
					insert(temp);
				}
			}
		
		}	
		else if(ind==5 || ind==9 || ind==13) {
				for (int i=4;i<20;i++) {
					JButton temp=allbuttons[i];
					if(allbuttons[i-1].getText()=="empty" || 
					   //allbuttons[i+1].getText()=="empty" ||
					   allbuttons[i-4].getText()=="empty" ||
					   allbuttons[i+4].getText()=="empty") {
						System.out.println("validSPACE FOUND  aaa222222  "+temp.getText());
						insert(temp);
					}
				}  
		}
		else {	
			for (int i=4;i<20;i++) {
				JButton temp=allbuttons[i];
				if(allbuttons[i-1].getText()=="empty" || 
				   allbuttons[i+1].getText()=="empty" ||
				   allbuttons[i-4].getText()=="empty" ||
				   allbuttons[i+4].getText()=="empty") {
					System.out.println("validSPACE FOUND aaaa33333   "+temp.getText());
					insert(temp);
				}
			}
		}
	System.out.println("ind"+ind);
	return valids;	
	}
	
	static void insert(JButton temp) {
		label:
		for(int j=0;j<4;j++) {
			if(valids[j]==null) {
				valids[j]=temp;
				break label;
			}
		}
		
	}
	
  
}


