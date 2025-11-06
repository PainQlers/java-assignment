interface Playable {
    void play();
}

abstract class MusicDevice {
    abstract void connect();
    String brand;

    MusicDevice(String brand) {
        this.brand = brand;
    }

    void info() {
        System.out.println("This instrument is " + brand);
    }
}

class CDPlayer extends MusicDevice implements Playable {
    CDPlayer(String brand) {
        super(brand);
    }

    void connect() {
        System.out.println("Reading CD...");
    }
    public void play() {
        System.out.println("Playing music from CD.");
    }
}

class Smartphone extends MusicDevice implements Playable{
    Smartphone(String brand) {
        super(brand);
    }

    void connect() {
        System.out.println("Connecting through Bluetooth...");
    }

    public void play() {
        System.out.println("Playing music from Spotify.");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        CDPlayer dvdplayer = new CDPlayer("Sony");
        Smartphone phone = new Smartphone("Iphone");
        dvdplayer.connect();
        dvdplayer.play();
        dvdplayer.info();

        phone.connect();
        phone.play();
        phone.info();
    }
}