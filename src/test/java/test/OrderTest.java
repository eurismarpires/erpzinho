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
		Order orderBuilder = new OrderBuilder()
				.withOrder("ORDER /1", "Andre", "123.456.789-01", "Feijao", "Camil", "Carioca").building();

		assertNotNull(orderBuilder);
	}

}
