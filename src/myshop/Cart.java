package myshop;

import java.util.Scanner;

public class Cart {
  public static void main(String[] args) {
    System.out.println("Benvenuto in negozio");
    Scanner scanner = new Scanner(System.in);
    
//  inserisci il numero di prodotti che vuoi acquistare
//  al termine dell' inserimento stampa il riepilogo carrello (metodo toString)
    System.out.println("Quanti prodotti vuoi acquistare?");
    int nProdotti = scanner.nextInt();
    Product[] cart = new Product[nProdotti];
    for (int i = 0; i < nProdotti; i++) {
//  chiedi all' utente di specificare la classe di prodotto che vuole acquistare'(smartphone tv hf)
      System.out.println("Inserisci la tipologia di prodotto");
      System.out.println("1 per Smartphone");
      System.out.println("2 per Tv");
      System.out.println("3 per Cuffie");

      int scelta;
      System.out.print("Scelta: ");
      scelta = scanner.nextInt();
      scanner.nextLine();
//  fill i campi del prodotto con i dati del constructor
      System.out.println("Inserisci il nome del prodotto");
      String nome = scanner.nextLine();
      
      System.out.println("Inserisci la descrizione del prodotto");
      String descrizione = scanner.nextLine();
      
      System.out.println("Inserisci il prezzo del prodotto");
      double prezzo = scanner.nextDouble();
      scanner.nextLine();
      System.out.println("Inserisci il iva del prodotto");
      int iva = scanner.nextInt();
      scanner.nextLine();
      switch (scelta) {
        case 1 -> {

          System.out.println("Inserisci l' IMEI del prodotto");
          String IMEI = scanner.nextLine();
          
          System.out.println("Inserisci la memoria del prodotto");
          int memory = scanner.nextInt();
          scanner.nextLine();
          cart[i] = new Smartphone(nome,descrizione,prezzo,iva,IMEI,memory);
        }
        case 2 -> {
          System.out.println("Inserisci la dimensione in pollici del prodotto");
          int dimension = scanner.nextInt();
          scanner.nextLine();
          System.out.println("se la tv è smart inserisci 'true' se no inserisci 'false'");
          boolean isSmart = scanner.nextBoolean();
          scanner.nextLine();
          cart[i] = new TV(nome,descrizione,prezzo,iva,dimension,isSmart);
        }
        case 3 -> {
          System.out.println("Inserisci la dimensione in pollici del prodotto");
          String color = scanner.nextLine();
          scanner.nextLine();
          System.out.println("Inserisci la memoria del prodotto");
          boolean isCabled = scanner.nextBoolean();
          scanner.nextLine();
          cart[i] = new Headphone(nome,descrizione,prezzo,iva,color,isCabled);
        }

        default -> System.out.println("Scelta non valida. Riprova.");
      }
    }
    System.out.println("Il tuo carrello:");
    for (Product prodotto : cart) {
      System.out.println(prodotto.toString());
    }
    
  }
}
