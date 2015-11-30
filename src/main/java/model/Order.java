package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "tbl_order")
public class Order {

  private Integer id;
  private String documentno;
  private Date dateOrdered;
  private byte[] foto;
  private Client client;
  private ArrayList<Product> product;

  public Order() {

  }

  public Order(String documentno, Date dateOrdered, Client client, ArrayList<Product> product) {
    this.documentno = documentno;
    this.dateOrdered = dateOrdered;
    this.client = client;
    this.product = product;
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
  public ArrayList<Product> getProduct() {
    return product;
  }

  public void setProduto(ArrayList<Product> product) {
    this.product = product;
  }

  @OneToOne(cascade = CascadeType.ALL)
  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

}
