public class DVDPLayer {
    boolean canRecord = false;

    void playDVD() {
        System.out.println("DVD проигрывается");
    }

    void recordDVD() {
        System.out.println("идёт запись на DVD");
    }
}

class DVDPLayerTestDrive{
    public static void main(String[] args) {
        DVDPLayer d = new DVDPLayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true){
            d.recordDVD();
        }
    }
}

