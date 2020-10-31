package if1.latihan25.ejaannama;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk mengubah nama menjadi ejaan
 * 
 */

import java.util.Scanner; // import kelas scanner

public class EjaanNama {
    static final Scanner sc = new Scanner(System.in);
    String nama;
    
    public void masukkanNama() {
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = sc.nextLine();
    }
    
    public void tampilEjaanNama() {
        System.out.println("Ejaan untuk \""+nama+"\" adalah : ");
        int i = 1;
        for (char eja : nama.toCharArray()) {
            System.out.println("Huruf ke-"+(i++)+" : "+eja);
        }
    }
    
    public static void main(String[] args) {
        EjaanNama ejaan = new EjaanNama();
        ejaan.masukkanNama();
        ejaan.tampilEjaanNama();
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}