import jakarta.xml.ws.Endpoint;
import ws.CompteService;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8056/", new CompteService());
        System.out.println("The Service is deployed Successfully !");
    }
}
