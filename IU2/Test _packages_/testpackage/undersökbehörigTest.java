
package testpackage;
import junit.framework.TestCase;
import org.junit.Test;
import IU2.undersökbehörig;
import IU2.*;
public class undersökbehörigTest {
    undersökbehörig ub=new undersökbehörig();
    retdate rt=new retdate();
    int[] ar=rt.retdate();
    
    @Test
    public void t1(){
        String str="2016-07-01";
        String s=str.trim();
        
        TestCase.assertFalse(undersökbehörig.typ(s,ar));
        
    }
    
    @Test
    public void t2(){
        String str2="2017-01-01";
        String s2=str2.trim();
       
        TestCase.assertFalse(undersökbehörig.typ(s2,ar));
        
    }
    
    @Test
    public void t3(){
       
        
        String str3="2018-02-01";
        String s3=str3.trim();
    
        TestCase.assertTrue(undersökbehörig.typ(s3,ar));
    }
            
    
}
