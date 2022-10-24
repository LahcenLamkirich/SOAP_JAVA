import proxy.CompteService;
import proxy.WsCompte;

public class ClientWs {
    public static void main(String[] args) {
        CompteService stub = new WsCompte().getCompteServicePort();
        stub.compteList().forEach(c -> {
            System.out.println(c.getCode() + " " + c.getMontant());
        });
        System.out.println(stub.convert(15.4));
    }
}
