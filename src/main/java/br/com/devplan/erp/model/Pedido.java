package br.com.devplan.erp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "tbl_pedido")
public class Pedido {

  private Integer id;
  private String documentno;
  private Date dateOrdered;
  private byte[] foto;
  private Cliente cliente;
  private ArrayList<Produto> produto;

  public Pedido() {

  }

  public Pedido(String documentno, Date dateOrdered, Cliente cliente, ArrayList<Produto> produto) {
    this.documentno = documentno;
    this.dateOrdered = dateOrdered;
    this.cliente = cliente;
    this.produto = produto;
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
  public ArrayList<Produto> getProduto() {
    return produto;
  }

  public void setProduto(ArrayList<Produto> produto) {
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
