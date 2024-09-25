import java.util.Scanner;

import SuperClass.CD;

public class TesterInput {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("CD/DVD??");
    String pilihan = in.nextInt();

    System.out.print("Name: ");
    String name = s.nextLine();
    System.out.print("Number: ");
    int number = s.nextInt();
    System.out.print("Quantity: ");
    int quantity = s.nextInt();
    System.out.print("Price: ");
    double price = s.nextDouble();
    s.nextLine(); // reset Scanner

    if (pilihan.equalsIgnoreCase("CD")) {
      System.out.print("Artist: ");
      String artist = s.nextLine();
      System.out.print("Label: ");
      String label = s.nextLine();
      System.out.print("Total Song: ");
      int numSong = s.nextInt();
       CD c1 = new CD(number,name,quantity,price,artist,numSong,label);
       c1.print();

    }else if (pilihan.equalsIgnoreCase("DVD")) {
      
    }
    s.close();


  }
  
}
