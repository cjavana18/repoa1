package iu3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;

public class shuffled {
	static JButton[] shuffled(JButton[] list) {
		//List<int> nums= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		List<JButton> mixi=new ArrayList<>();
		
		for(int i=0;i<list.length;i++) {
			mixi.add(list[i]);
		}
		Collections.shuffle(mixi);
		
		for(int i=0;i<mixi.size();i++) {
			list[i]=mixi.get(i);
		}
		
		return list;
	}

}
