/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämn1;


import javax.swing.*;

interface multdiv{         //interface
    double mult=1000;  
    double div();
}

public class Inlämn1  implements multdiv{
    
    public double div(){         //  vrf måste denna metod vara public???
        return 0;
    }
   
    public static void main(String[] args) {
        Djur[] dj=new Djur[5];          // skapa array för de 5 objekten
        
        Djur Sixten=new Hund("Sixten",5,"hundfoder");   //skapa objekten
        dj[0] =Sixten;
       
        Djur Dogge=new Hund("Dogge",10,"hundfoder");  
        dj[1] =Dogge;
        
        Djur Venus=new Katt("Venus",5,"kattfoder");
        dj[2] =Venus;
        
        Djur Ove=new Katt("Ove",3,"kattfoder");
        dj[3] =Ove;
        
        Djur Hypno=new Orm("Hypno",1,"ormpellets");
        dj[4] =Hypno;
        
        //String djur_;
        
        String djur_ = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");
        Djur temp=null;
        double mängd=0;
        String mattyp=null;
        for(Djur d:dj){
            if(d.namn.equals(djur_)){
                mattyp=d.mat;
                mängd=d.vikt;
                temp=d;
            }
        }
        mängd= mängd*mult/(temp.div());  //   polymorfism - gränsnitts funktionen div kommer att returnera olika divisorer beroende på vilket objekt som anropar den
        if(mattyp==null){
            JOptionPane.showMessageDialog(null,"Du har inte angett namnet på ett djur som bor på detta hotell");
        }
        else{
        JOptionPane.showMessageDialog(null, "mat typ: "+mattyp+" \nmängd mat: "+mängd+"g");
        }
        //System.out.println(Ove.toString());
        //System.out.println(dj.toString());
        
        }
}