package Service;

/**
* File: HyperbolicTangentFunction.java <br>
* Purpose: This class implements the hyperbolic tangent activation function, and it's derivative. <br>
* @author Hialo
* @version 1.0
*/

public class HyperbolicTangentFunction implements ActivationFunction {

    @Override
    public double function(double x) {
        return (Math.exp(x) - Math.exp(-x))/(Math.exp(x)+Math.exp(-x));
    }

    @Override
    public double derivative(double x) {
        return (4*Math.exp(2*x))/(Math.pow((Math.exp(2*x)+1),2));
    }
    
}
