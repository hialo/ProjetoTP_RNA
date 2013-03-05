package Service;

/**
* File: SigmoidFunction.java <br>
* Purpose: This class implements the sigmoid activation function, and it's derivative. <br>
* @author Hialo
* @version 1.0
*/

public class SigmoidFunction implements ActivationFunction {
   
    @Override
    public double function(double x) {
        return (1 / (1 + Math.exp(-x)));
    }
    
    @Override
    public double derivative(double x) {
        return x * (1 - x);
    }
}
