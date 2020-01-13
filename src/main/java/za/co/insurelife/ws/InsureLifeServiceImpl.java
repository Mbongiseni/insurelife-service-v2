package za.co.insurelife.ws;

import za.co.insurelife.ws.messages.ClientDetails;
import za.co.insurelife.ws.messages.GetAllClientsDetailsResponse;

import javax.jws.WebMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsureLifeServiceImpl implements InsureLifeService {

    @Override
    @WebMethod(operationName = "GetAllClientsDetails")
    public GetAllClientsDetailsResponse retrieveAllClientsDetails() {
        GetAllClientsDetailsResponse response = new GetAllClientsDetailsResponse();
        response.setClientDetails(getAllClientDetails());
        return response;
    }

    private List<ClientDetails> getAllClientDetails(){
        List<ClientDetails> clientDetailsList = new ArrayList<>();

        ClientDetails clientDetails1 = new ClientDetails();
        clientDetails1.setClientId(1);
        clientDetails1.setFirstName("Thobile");
        clientDetails1.setMiddleName("");
        clientDetails1.setLastName("Ncube");
        clientDetails1.setGender("Female");
        clientDetails1.setIdNumber("123456789");
        clientDetails1.setDateOfBirth(new Date());
        clientDetails1.setRace("African");
        clientDetailsList.add(clientDetails1);

        ClientDetails clientDetails2 = new ClientDetails();
        clientDetails2.setClientId(2);
        clientDetails2.setFirstName("Mimi");
        clientDetails2.setMiddleName("Olwethu");
        clientDetails2.setLastName("Ngubane");
        clientDetails2.setGender("Female");
        clientDetails2.setIdNumber("987654321");
        clientDetails2.setDateOfBirth(new Date());
        clientDetails2.setRace("African");
        clientDetailsList.add(clientDetails2);

        ClientDetails clientDetails3 = new ClientDetails();
        clientDetails3.setClientId(3);
        clientDetails3.setFirstName("Samukelisiwe");
        clientDetails3.setMiddleName("Nkazimulo");
        clientDetails3.setLastName("Ncube");
        clientDetails3.setGender("Female");
        clientDetails3.setIdNumber("147258369");
        clientDetails3.setDateOfBirth(new Date());
        clientDetails3.setRace("African");
        clientDetailsList.add(clientDetails3);

        return clientDetailsList;
    }
}
