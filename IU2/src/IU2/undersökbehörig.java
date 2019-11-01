
package IU2;
//fixa problemet med nollan som kommer först i datum dag och månad!!!!!!!!!

public class undersökbehörig {                  //FInns inbyggd java modul för detta?????
    public static boolean typ(String kundDatum,int[] DagensDatum){
        int år=Integer.parseInt(kundDatum.substring(0,4));
        int mån=Integer.parseInt(kundDatum.substring(5,7));
        int dag=Integer.parseInt(kundDatum.substring(8,10));    //out of range???????????
        
        
        
        if (år==2018){   
            return true;
        }
        
        if(år==2017&&mån>DagensDatum[1]){   //tagit bort "="
            return true;
        }
        
        if(år==2017&&mån==DagensDatum[1]&&dag>=DagensDatum[2]){  
            return true;
        }
           
        return false;
    }
}
