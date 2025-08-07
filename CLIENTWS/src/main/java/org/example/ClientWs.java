package org.example;

import pproxy.BanqueService;
import pproxy.BanqueWS;
import pproxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService pproxy = new BanqueWS().getBanqueServicePort();
        System.out.println(pproxy.conversionED(11));
        Compte cp=pproxy.getCompte(5);
        System.out.println("code="+cp.getCode());
        System.out.println("solde="+cp.getSolde());
        System.out.println("date creation="+cp.getDateCreation());
        List<Compte> compteList=pproxy.listCompte();
        for (Compte c:compteList){
            System.out.println("------------");
            System.out.println("code="+c.getCode());
            System.out.println("solde="+c.getSolde());
            System.out.println("date creation="+c.getDateCreation());
        }
    }
}
