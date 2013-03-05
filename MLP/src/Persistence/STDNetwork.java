package Persistence;

import Model.MLP;

    /**
    * File: STDNetwork.java <br>
    * Purpose: Create the MLP used by the application. <br>
    * @author Hialo <br>
    * @version 1.0 <br>
    */

public class STDNetwork {
    
    /* dst - A static MLP object who implemets the neural network. */
    
    public static MLP dst;
    
    /** Constructor of the network used on this application.
     * 
     * @param function The function used for the backpropagation algorithm (sigmoid or hyperbolic tangent).
     */

    public STDNetwork(int function) {
        dst = new MLP(2);
        dst.addFirstLayer(5, 15, function);
        dst.addLayer(6, function);
    }
}
