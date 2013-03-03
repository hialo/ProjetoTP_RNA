package Service;

/**
* File: SigmoidFunction.java
* Purpose: This class implements the sigmoid activation function, and it's derivative.
* @author Hialo
* @version 1.0
* x - The parameter of the sigmoid function. 
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
