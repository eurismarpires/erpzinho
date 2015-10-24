package br.com.devplan.erp.test;

import java.util.GregorianCalendar;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.devplan.erp.model.Cliente;
import br.com.devplan.erp.model.Endereco;
import br.com.devplan.erp.model.Pedido;
import br.com.devplan.erp.model.Produto;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PedidoTeste extends TestCase {

	public PedidoTeste(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(PedidoTeste.class);
	}

	public void testApp() {
		Endereco endereco = new Endereco("RUA Java", 2, "SJC");
		assertTrue("Incluindo endereço cliente: ", true);
		
		Cliente cliente = new Cliente("Andre Lemos", "XXX.XXX.XXX-XX", endereco);
		assertTrue("Incluindo cliente: ", true);
		
		Produto produto = new Produto();
		produto.setNome("Feijão");
		produto.setMarca("Camil");
		produto.setModelo("Carioca");
		assertTrue("Incluindo produto: ", true);

		Pedido pedido1 = new Pedido();
		pedido1.setDocumentno("PEDIDO/ 1");
		pedido1.setDateOrdered(new GregorianCalendar(1984, 10, 28).getTime());
		pedido1.setCliente(cliente);
		pedido1.setProduto(produto);
		assertTrue("Incluindo pedido: ", true);

		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session sessao = sessionFactory.openSession();
			sessao.beginTransaction();
			sessao.save(pedido1);
			sessao.getTransaction().commit();
			sessao.close();
		} catch (HibernateException hibernateException) {
			assertTrue(hibernateException.getMessage(), false);
		}
	}

	
}
