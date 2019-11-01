
package testpackage;
//hur undviker man paketen nör man skapar flera mappar????
import junit.framework.TestCase;
import IU2.retdate;
import org.junit.Test;

public class retdateTest {
    retdate rt=new retdate();
    
    @Test
    public void testdate(){
        int[] ar=rt.retdate();
        for(int i=0;i<ar.length;i++){
            TestCase.assertTrue(ar[i]!=0);
        }
    }
    
    @Test
    public void testyear(){
        int[] ar=rt.retdate();
        int a=ar[0];
        TestCase.assertFalse(a<2018);
    }
}
