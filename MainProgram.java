import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){

        //membuat objek HP
        Phone s22Ultra = new Samsung();

        // membuat objek user
        PhoneUser notio = new PhoneUser(s22Ultra);

        //mencoba menyalakan HP
        notio.turnOnThePHone();

        //menjadikan satu program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Hidupkan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Tambah Volume");
            System.out.println("[4] Kurangi Volume");
            System.out.println("[0] Keluar");
            System.out.println("===========================");
            System.out.println("Pilih Aksi>");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                notio.turnOnThePHone();
            }else if(aksi.equalsIgnoreCase("2")){
                notio.turnOffThePHone();
            }else if(aksi.equalsIgnoreCase("3")){
                notio.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                notio.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
