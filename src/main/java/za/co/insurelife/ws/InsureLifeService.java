package za.co.insurelife.ws;

import za.co.insurelife.ws.messages.GetAllClientsDetailsResponse;

import javax.jws.WebResult;
import javax.jws.WebService;

/*
 *
 * Marks Java class as an implementation of Webservice or Java interface as a webservice interface
 */
@WebService(name="InsureLifeService")
public interface InsureLifeService {

    @WebResult(name = "GetAllClientsDetailsResponse")
    GetAllClientsDetailsResponse retrieveAllClientsDetails();
}
