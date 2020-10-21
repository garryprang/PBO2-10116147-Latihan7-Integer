package pbo2.pkg10116147.latihan7.integer;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan tipe-tipe data dasar (bilangan).
 */

public class PBO210116147Latihan7Integer {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        System.out.println("byte \t: " + b);
        System.out.println("short \t: " + s);
        System.out.println("int \t: " + i);
        System.out.println("long \t: " + l);
    }
    
}
