package myshop;

public class Smartphone extends Product {
  private String IMEI;
  private int memory;
  
  public Smartphone(String nome, String descrizione, double prezzo, int iva, String IMEI, int memory) {
    super(nome, descrizione, prezzo, iva);
    this.IMEI = IMEI;
    this.memory = memory;
  }
  
  public String getIMEI() {
    return IMEI;
  }
  
  public void setIMEI(String IMEI) {
    this.IMEI = IMEI;
  }
  
  public int getMemory() {
    return memory;
  }
  
  public void setMemory(int memory) {
    this.memory = memory;
  }
  @Override
  public String toString() {
    return "Smartphone {" +
      "imei=" + IMEI +
      ", memoria=" + memory +
      "} " + super.toString();
  }
}
