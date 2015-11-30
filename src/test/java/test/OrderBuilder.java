package test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.Address;
import model.Client;
import model.Order;
import model.Product;

public class OrderBuilder {
	private Order instance;

	public OrderBuilder() {
		this.instance = new Order();
	}

	private Client withClient(String name, String cpfCnpj) {
		Address address = new Address("Rua Java", 12, "São Paulo");
		Client client = new Client(name, cpfCnpj, address);
		this.instance.setClient(client);
		return client;
	}

	private ArrayList<Product> withProduct(String name, String mark, String model) {
		ArrayList<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setName(name);
		product.setMark(mark);
		product.setModel(model);
		productList.add(product);

		this.instance.setProduto(productList);

		return productList;
	}

	public OrderBuilder withOrder(String documentNo, String clientName, String cpfCnpj, String productName,
			String productMark, String productModel) {
		Order pedido1 = new Order();
		pedido1.setDocumentno(documentNo);
		pedido1.setDateOrdered(new GregorianCalendar(1984, 10, 28).getTime());
		pedido1.setClient(withClient(clientName, cpfCnpj));
		pedido1.setProduto(withProduct(productName, productMark, productModel));

		return this;
	}

	public Order building() {
		return this.instance;
	}

}
