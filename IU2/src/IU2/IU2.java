
package IU2;
import java.util.Date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
public class IU2 {
    public static String s=null;
    //TimeZone.getDefault();

    //TimeZone.setDefault(TimeZone.getTimeZone("Europe/Stockholm"));
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    //String formattedTime = formatter.format(LocalTime.now());

    IU2() throws IOException{
        //String s=null;
      
        File file = new File("src\\IU2\\customers2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            line = br.readLine();
            sb.append("\n");
        }
        String everything = sb.toString();
       //System.out.println(everything);
        s=everything;
        }/*catch (Exception ex){
            System.out.println("Fel vid inläsning eller något likande");
        }*/
        
    
    }
    public static void main(String[] args)  throws IOException{
        //System.out.println(TimeZone.getDefault());
        retdate ret= new retdate();
        int [] arr2=ret.retdate();
        IU2 IU2=new IU2();
        
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        String namn = JOptionPane.showInputDialog(frame, "Ange kundens namn eller personnummer");
       
        String[] sa;
        sa=s.split("\\n");
        //System.out.println(Arrays.toString(sa));
        String daTum=null;
        namn=namn.trim().toLowerCase();
        String info1 = null;
        String info2 = null;
        for (int k=0;k<sa.length;k++){
            if(sa[k].toLowerCase().contains(namn)){
               daTum=sa[k+1].trim();
               info1=sa[k];
               info2=sa[k+1];
            }
        }
        if(daTum==null){
            System.out.println("Finns ej i systemet");
        }else{
            undersökbehörig ub=null;
            boolean stat=ub.typ(daTum,arr2);
            if(stat==true){
                System.out.println("betalande kund");
                antecknabesök ab=null;
                ab.skrivin(info1,info2);
            }else{
                System.out.println("icke betalande kund");
            }
                    
        }
      System.exit(0);
       
    }
    

}