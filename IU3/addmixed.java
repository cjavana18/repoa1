package iu3;

import javax.swing.JButton;

public class addmixed {
	
	static JButton[] merge(JButton[] buttonlist,JButton[] mixed) {
		for(int i=0;i<mixed.length;i++) {
			buttonlist[i+4]=mixed[i];
		}
		return buttonlist;
	}

}
