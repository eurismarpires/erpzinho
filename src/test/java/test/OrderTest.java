package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import model.Address;
import model.Client;
import model.Order;
import model.Product;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class OrderTest extends TestCase {

	public OrderTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(OrderTest.class);
	}

	public void testApp() {
		Address address = new Address("RUA Java", 2, "SJC");

		Client client = new Client("Andre Lemos", "XXX.XXX.XXX-XX", address);

		ArrayList<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setName("Feijão");
		product.setMark("Camil");
		product.setModel("Carioca");
		productList.add(product);

		Order pedido1 = new Order();
		pedido1.setDocumentno("PEDIDO/ 1");
		pedido1.setDateOrdered(new GregorianCalendar(1984, 10, 28).getTime());
		pedido1.setClient(client);
		pedido1.setProduto(productList);

		assertNotNull(pedido1);
	}

}
