package br.com.devplan.erp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PedidoTesteConsulta {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session sessao = sessionFactory.openSession();

		sessao.beginTransaction();

		/*List<Pedido> pedidos = sessao.createQuery("select new Pedido(p.documentno, p.dateOrdered)" + " from Pedido p"
				+ "where id >= :id").setParameter("id", 12).list();

		for (Pedido pedido : pedidos) {
			System.out.println(pedido.getDocumentno() + " - " + pedido.getDateOrdered());
		}*/

		sessao.close();
	}
}
