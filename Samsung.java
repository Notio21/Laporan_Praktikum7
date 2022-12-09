public class Samsung implements Phone{
    
    private int volume;
    private boolean isPowerOn;

    public Samsung(){
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("HP MENYALA");
        System.out.println("Selamat datang di SAMSUNG");
        System.out.println("Android versi 11");
    }

    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dinonaktifkan");
    }

    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume FULL");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Hidupkan Handphone!");
        }
    }
    
    @Override
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        }else {
            System.out.println("Silahkan Hidupkan HP Anda");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
