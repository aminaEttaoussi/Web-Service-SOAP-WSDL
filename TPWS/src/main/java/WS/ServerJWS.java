package WS;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://localhost:8085/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web Service deploye sur "+url);
    }
}
