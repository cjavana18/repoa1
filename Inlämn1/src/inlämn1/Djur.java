/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämn1;

public class Djur implements multdiv{
    
    String namn;
    double vikt;
    String mat;
    Djur(String namn, double vikt,String mat){
        this.namn=namn;
        this.vikt=vikt;
        this.mat=mat;
    
    }

   
    
    
    public double div(){                     // varför föreslås override???? 
        double standard=50;
        return 50;
    }
}

class Katt extends Djur{          //arv
     public Katt(String a,double b, String c){
     super(a,b,c);
    }
    
    private final double a= 150;        //inkapsling
     @Override                  //dynamisk bindning - den lokala metoden overridar den superlativa
    public double div(){          
        return a;
    }
}

class Hund extends Djur{
    public Hund(String a,double b, String c){
    super(a,b,c);
    }
    
    private final double a= 100;                 //inkapsling
    @Override               //dynamisk bindning - den lokala metoden overridar den superlativa
    public double div(){
        return a;
    }
}

class Orm extends Djur{
    public Orm(String a,double b, String c){
    super(a,b,c);
    }
    
    private final double p= (1000*0.05);             //inkapsling
    @Override            //dynamisk bindning - den lokala metoden overridar den superlativa
    public double div(){
        return p;
    }
}

