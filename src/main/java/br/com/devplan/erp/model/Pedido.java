package br.com.devplan.erp.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_pedido")
public class Pedido {

	private Integer id;
	private String documentno;
	private Date dateOrdered;
	private byte[] foto;
	private Cliente cliente;
	private Produto produto;

	public Pedido() {

	}

	public Pedido(String nome, Date dataNascimento, String modelo) {
		super();
		this.documentno = documentno;
		this.dateOrdered = dateOrdered;
		this.produto = new Produto();
		this.produto.setModelo(modelo);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(nullable = false)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_ordered")
	public Date getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	@Transient
	public String getMoeda() {
		return "Real";
	}

	@Lob
	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
