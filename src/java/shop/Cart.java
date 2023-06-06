package java.shop;

import java.util.Objects;
import java.util.Scanner;

public class Cart {
  public static void main(String[] args) {
    System.out.println("Benvenuto in negozio");
    Scanner scanner = new Scanner(System.in);
    
//  inserisci il numero di prodotti che vuoi acquistare
//  fill i campi del prodotto con i dati del constructor
//  chiedi all' utente di specificare la classe di prodotto che vuole acquistare'(smartphone tv hf)
//  al termine dell' inserimento stampa il riepilogo carrello (metodo toString)
  System.out.println("Quanti prodotti vuoi acquistare?");
  int nProdotti = scanner.nextInt();
    Object[] cart = new Object[nProdotti];
    for (int i = 0; i < nProdotti; i++) {
      System.out.println("Inserisci la tipologia di prodotto");
      System.out.println("1 per Smartphone");
      System.out.println("2 per Tv");
      System.out.println("3 per Cuffie");
      
      int scelta;
      System.out.print("Scelta: ");
      scelta = scanner.nextInt();
      
      switch (scelta) {
        case 1 -> {
        Smartphone smartphone = new Smartphone();
        System.out.println("Inserisci il nome del prodotto");
        
        }
        case 2 -> {
        
        }
        case 3 ->  {
        
        }
        case 4 -> System.out.println("Grazie per aver utilizzato il nostro negozio. Arrivederci!");
        
        default -> System.out.println("Scelta non valida. Riprova.");
      
      String nome = scanner.next();
      System.out.println("Inserisci il prezzo del prodotto");
      double prezzo = scanner.nextDouble();
      cart[i] = new Prodotto(nome, prezzo);
    }
  }
  
}
