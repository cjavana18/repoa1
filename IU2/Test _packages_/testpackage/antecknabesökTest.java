
package testpackage;
import java.io.*;
import IU2.*;
import IU2.antecknabesök;
import java.io.File;
import java.nio.file.Files;
import junit.framework.TestCase;
import org.junit.Test;


public class antecknabesökTest {
    antecknabesök ab=new antecknabesök();
    String a ="test";
    String b="test2";
    
    
    
    
    @Test
    public void skrivtest()throws IOException{
        ab.skrivin(a,b);
        File f = new File("C:\\Users\\chris\\Documents\\NetBeansProjects\\IU2");
        boolean bool=f.exists();
        TestCase.assertTrue(bool);
        
    }
    //#############################################
    /*
    @Test
    public void skrivtest(){
      File f = null;
      boolean bool = false;
      
      try {
         // create new files
         f = new File("närvaro.txt");
         
         // create new file in the system
        // f.createNewFile();
         
         // tests if file exists
         bool = f.exists();
         
         // prints
         System.out.println("File exists: "+bool);
         
         if(bool == true) {
            // delete() invoked
            f.delete();
            System.out.println("delete() invoked");
         }
         
         // tests if file exists
         bool = f.exists();
         
         // prints
         System.out.print("File exists: "+bool);
         TestCase.assertTrue(f.exists());
         
      } catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
    //#######################################
    /*
        
   
    
    
    
    
    
    
    /*
    @Test
    public void doesfileexist()throws IOException{
        ab.skrivin(a,b);
        TestCase.assertTrue(Files.exists("src\\IU2\\närvaro.txt"));
    }
    */
    
    
    
    /*@Test
    public void createfile() throws IOException{
        antecknabesök.skrivin(a,b);
    }
    /*
    /*
    public boolean cheackcreated(){
        boolean check = new File(directory, temp).exists();
        return check;
    }
    
    @Test
    public void maintest() throws IOException{
        createfile();
        TestCase.assertTrue(cheackcreated());
        
    }*/
    
}
