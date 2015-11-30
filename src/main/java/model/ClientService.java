package model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "clientService")
@ApplicationScoped
public class ClientService {

	public Client createClient() {
		Address address = new Address("Rua Java", 12, "SP");
		Client client = new Client("Andre", "12345678", address);
		
		return client;
	}
		
}