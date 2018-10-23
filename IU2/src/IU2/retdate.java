
package IU2;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class retdate {
      
      public int[] retdate(){
      int day;
      int month;
      int year;
      GregorianCalendar date = new GregorianCalendar();
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      
      month=month+1;  //problem åtgärd
 
   
 
      System.out.println("Current date is  "+year+"-"+month+"-"+day);
      
      
      int[] ar = {year,month,day};
      return ar;
      }
    
}
