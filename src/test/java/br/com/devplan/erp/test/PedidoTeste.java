package br.com.devplan.erp.test;

import br.com.devplan.erp.model.Cliente;
import br.com.devplan.erp.model.Endereco;
import br.com.devplan.erp.model.Pedido;
import br.com.devplan.erp.model.Produto;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class PedidoTeste extends TestCase {

  public PedidoTeste(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(PedidoTeste.class);
  }

  public void testApp() {
    Endereco endereco = new Endereco("RUA Java", 2, "SJC");

    Cliente cliente = new Cliente("Andre Lemos", "XXX.XXX.XXX-XX", endereco);

    ArrayList<Produto> produtoList = new ArrayList<Produto>();
    Produto produto = new Produto();
    produto.setNome("Feijão");
    produto.setMarca("Camil");
    produto.setModelo("Carioca");
    produtoList.add(produto);

    Pedido pedido1 = new Pedido();
    pedido1.setDocumentno("PEDIDO/ 1");
    pedido1.setDateOrdered(new GregorianCalendar(1984, 10, 28).getTime());
    pedido1.setCliente(cliente);
    pedido1.setProduto(produtoList);

    assertNotNull(pedido1);
  }


}
