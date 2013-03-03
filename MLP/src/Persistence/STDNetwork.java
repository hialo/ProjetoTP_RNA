package Persistence;

import Model.MLP;

public class STDNetwork {
    
    /**
    * File: STDNetwork.java
    * Purpose: Create the MLP used by the application.
    * @author Hialo
    * @version 1.0
    * dst - A static MLP object who implemets the neural network. 
    */
    
    public static MLP dst;

    public STDNetwork(int funcao) {
        dst = new MLP(2);
        dst.adicionarPrimeiraCamada(5, 15, funcao);
        dst.adicionarCamada(6, funcao);
    }
}
