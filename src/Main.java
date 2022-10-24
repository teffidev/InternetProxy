import service.IConexionInterntet;
import service.impl.InternetService;
import service.impl.ProxyInternet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> sitiosBloqueados = new ArrayList<>();
        sitiosBloqueados.add("www.youtube.com");
        sitiosBloqueados.add("www.facebook.com");

        IConexionInterntet proxy;

        proxy = new ProxyInternet((InternetService) sitiosBloqueados, (List<String>) new InternetService());

        proxy.conectarCon("www.google.com");
        proxy.conectarCon("www.youtube.com");

    }
}