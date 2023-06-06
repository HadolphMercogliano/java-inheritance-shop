package java.shop;
public class Shop {
  public static void main(String[] args) {
  
//  creazione nuovo prodotto
    Product product1 = new Product("Mela", "Frutto rosso", 10.0, 23);
    
//  stampa dati del nuovo prodotto
    System.out.println("Codice: " + product1.getCode());
    System.out.println("Nome: " + product1.getNome());
    System.out.println("Descrizione: " + product1.getDescrizione());
    System.out.println("Prezzo base: " + product1.getPrezzo());
    System.out.println("IVA: " + product1.getIva());
    System.out.println("Prezzo con IVA: " + product1.getIvaPrice());
    System.out.println("Nome esteso: " + product1.getFullName());
    
    product1.setNome("Banana");
    product1.setDescrizione("Frutto giallo");
    product1.setPrezzo(15.0);
    product1.setIva(25);
    
    System.out.println("Nome prodotto dopo la modifica: " + product1.getNome());
    System.out.println("Descrizione prodotto dopo la modifica: " + product1.getDescrizione());
    System.out.println("Prezzo base prodotto dopo la modifica: " + product1.getPrezzo());
    System.out.println("IVA prodotto dopo la modifica: " + product1.getIva());
    
    System.out.println("Prezzo con IVA dopo la modifica: " + product1.getIvaPrice());
    System.out.println("Nome esteso dopo la modifica: " + product1.getFullName());
  }
}
