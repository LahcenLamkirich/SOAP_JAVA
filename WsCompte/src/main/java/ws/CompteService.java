package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "WsCompte")
public class CompteService {
    @WebMethod
    public double Convert(@WebParam(name = "Euro_montant") double euros){
        return euros*10;
    }


    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*458545, new Date());
    }

    @WebMethod
    public List<Compte> compteList(){
        return List.of(
                new Compte(1, Math.random()*458545, new Date()),
                new Compte(2, Math.random()*652158, new Date()),
                new Compte(3, Math.random()*859654, new Date())
        );
    }


}
