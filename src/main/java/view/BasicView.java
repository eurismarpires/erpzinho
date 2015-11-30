package view;
 
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import model.ClientService;
import model.Client;

 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Client client;
     
    @ManagedProperty("#{clientService}")
    private ClientService service;
 
    @PostConstruct
    public void init() {
    	client = service.createClient();
    }
     
    public Client getClient() {
        return client;
    }
 
    public void setService(ClientService service) {
        this.service = service;
    }
}