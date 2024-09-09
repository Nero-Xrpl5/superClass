package SuperClass;

public class TesterSuperClass {
    public static void main(String[] args) {
        DVD musik = new DVD();

        System.out.println("-----------------------");
        musik.setNumber(2);
        musik.setName("Reborn");
        musik.setQuantity(12);
        musik.setPrice(2000.00);
        musik.setArtist("Sady Laga");
        musik.setNumSong(10);
        musik.setLabel("Sony Music");
        musik.setLenght(300);
        musik.setRating("PG");
        musik.setStudio("NewLine Cinema");

        musik.print();
        System.out.println("-----------------------");




    }

    
}
