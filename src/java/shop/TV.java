package java.shop;

public class TV extends Product {
  private int dimension;
  private boolean isSmart;
  
  public TV(String nome, String descrizione, double prezzo, int iva, int dimension, boolean isSmart) {
    super(nome, descrizione, prezzo, iva);
    this.dimension = dimension;
    this.isSmart = isSmart;
  }
  
  public int getDimension() {
    return dimension;
  }
  
  public void setDimension(int dimension) {
    this.dimension = dimension;
  }
  
  public boolean isSmart() {
    return isSmart;
  }
  
  public void setSmart(boolean smart) {
    isSmart = smart;
  }
}
