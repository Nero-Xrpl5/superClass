package SuperClass;
import java.util.*;

public class TesterSuperClass {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        //CONDITION
        System.out.println("Masukkan berapa objet yang ingin anda buat");
        System.out.println("(Limit Objek adalah 10!!)");
        int jumlah = m.nextInt();
        if (jumlah > 10 ) {
            System.out.println("Objek melebihi limit");
        return;
            
        }else{
           
            for (int i=1; i <= jumlah; i++){
               

                  //Mencegah eror karena tipe data tidak sesuai
                try {
                    System.out.println();
            
                    System.out.println("Silahkan pilih 1. untuk membuat CD atau 2. untuk membuat DVD");
                    int pilihan = m.nextInt();
                        
                    if (pilihan == 1) {
                            CD c = new CD();
                            c.print();
                            System.out.println("-------------------------------------------------------");            
                        }else if (pilihan == 2) {
                            DVD d = new DVD();
                            d.print();
                            System.out.println("-------------------------------------------------------");
                        }else {
                            System.out.println("Pilihan Salah!");
                             }
                            
                             // TODO: handle exception
                            } catch (Exception e) {
                        System.out.println("Tipe Data salah, Hanya menerima angka!");
                      
                    
                    m.close();
             
            
                    }
                }        
         }
         s.close();
         
    }
    }
    




        // System.out.println("-----------------------");
        // musik.setNumber(2);
        // musik.setName("Reborn");
        // musik.setQuantity(12);
        // musik.setPrice(2000.00);
        // musik.setArtist("Sady Laga");
        // musik.setNumSong(10);
        // musik.setLabel("Sony Music");
        // musik.setLenght(300);
        // musik.setRating("PG");
        // musik.setStudio("NewLine Cinema");

        // musik.print();
        // System.out.println("-----------------------");




    

    

