
package IU2;
import java.io.*;  
public class antecknabesök {
    public static void skrivin(String a,String b) throws IOException{
        File doku = new File("närvnaro.txt");
        FileWriter writer = new FileWriter(doku,true); 
        writer.write(a);
        writer.write(" - ");
        //System.getProperty("line.separator"); //hur används den????
        writer.write(b);
        writer.write(System.getProperty( "line.separator" ));
        writer.close();
    }
}
