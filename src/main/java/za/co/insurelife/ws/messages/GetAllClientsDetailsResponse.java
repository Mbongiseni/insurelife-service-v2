package za.co.insurelife.ws.messages;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"clientDetails"})
@XmlRootElement(name = "GetAllClientsDetailsResponse")
public class GetAllClientsDetailsResponse {

    @XmlElement(name = "ClientDetails", required = true)
    protected List<ClientDetails> clientDetails;

    public List<ClientDetails> getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(List<ClientDetails> clientDetails) {
        this.clientDetails = clientDetails;
    }
}
