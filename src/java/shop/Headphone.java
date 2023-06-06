package java.shop;

public class Headphone extends Product {
  private String color;
  private boolean isCabled;
  
  public Headphone(String nome, String descrizione, double prezzo, int iva, String color, boolean isCabled) {
    super(nome, descrizione, prezzo, iva);
    this.color = color;
    this.isCabled = isCabled;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public boolean isCabled() {
    return isCabled;
  }
  
  public void setCabled(boolean cabled) {
    isCabled = cabled;
  }
}
