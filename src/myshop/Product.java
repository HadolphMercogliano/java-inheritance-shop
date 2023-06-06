package myshop;


public class Product {
  private final int codice;
  private String nome;
  private String descrizione;
  private double prezzo;
  private int iva;
  
  public Product(String nome, String descrizione, double prezzo, int iva) {
    this.codice = (int) (Math.random() * (10000 - 1) + 10);
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
  }
  
  public String getCode() {
    return String.format("%08d", codice);
    
  }
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getDescrizione() {
    return descrizione;
  }
  
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }
  
  public double getPrezzo() {
    return prezzo;
  }
  
  public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
  }
  
  public int getIva() {
    return iva;
  }
  
  public void setIva(int iva) {
    this.iva = iva;
  }
  public double getIvaPrice() {
    return prezzo + prezzo * iva / 100;
  }
  public String getFullName() {
    return getCode() + "-" + nome;
  }
  @Override
  public String toString() {
    return "Prodotto{" +
      "codice=" + codice +
      ", nome='" + nome +
      ", descrizione='" + descrizione +
      ", prezzo=" + prezzo +
      ", iva=" + iva +
      '}';
  }
}
