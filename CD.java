package SuperClass;

//Inheritance SuperClass (Pewarisan)
public class CD extends Product {
    private String artist;
    private int numSong;
    private String label;

    public CD() {
        super(); // Constructor dari SuperClass
        artist = "";
        numSong = 0;
        label = "";
    }

    public CD(int number, String name, int quantity, double price, String artist, int numSong, String label){
        
    }
    
    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
		this.label = label;
    }

    //Override
    public void print () {
        super.print();
        System.out.println("Artist:\t" + artist);
        System.out.println("Total Song:\t" + numSong);
        System.out.println("Label:\t" + label);
    }
}

