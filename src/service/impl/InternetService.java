package service.impl;

import service.IConexionInterntet;

public class InternetService implements IConexionInterntet {
    @Override
    public void conectarCon(String url) {
        System.out.println("Conectado con " +url);
    }
}
