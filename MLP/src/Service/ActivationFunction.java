package Service;

    /**
    * File: ActivationFunction.java <br>
    * Purpose: An interface who has the activation function of the network.<br>
    * @author Hialo
    * @version 1.0
    */

public interface ActivationFunction {

    public double function(double x);
    public double derivative(double x);
}
