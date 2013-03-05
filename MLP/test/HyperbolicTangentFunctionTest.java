import Service.HyperbolicTangentFunction;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Luiza
 */
public class HyperbolicTangentFunctionTest {
    
        double x, x2, resultado, resultado2, delta, delta2;
        HyperbolicTangentFunction c;
        
     @Before
     public void inicializar() {
         c = new HyperbolicTangentFunction();
     }
        
     @Test
     public void functionTest() {
         assertNotNull(c);
         x = 2;
         resultado = (Math.exp(x) - Math.exp(-x))/(Math.exp(x)+Math.exp(-x));
         assertEquals(resultado, c.function(x), delta);
     }
     
     @Test
     public void derivateTest() {
         assertNotNull(c);
         x2 = 2;
         resultado2 = (4*Math.exp(2*x2))/(Math.pow((Math.exp(2*x2)+1),2));
         assertEquals(resultado2, c.derivative(x2), delta2);
     }
 
}
