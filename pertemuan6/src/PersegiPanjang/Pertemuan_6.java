
package PersegiPanjang;

public class Pertemuan_6 {

    public static void main(String[] args) {
        Hitung persegi1 = new Hitung();
        System.out.println("Keliling persegi panjang dengan panjang "+ persegi1.panjang+" dan lebar "+persegi1.lebar+" adalah "+persegi1.getKeliling());
        System.out.println("Luas persegi panjang dengan panjang "+ persegi1.panjang+" dan lebar "+persegi1.lebar+" adalah "+persegi1.getLuas());
        
        Hitung persegi2 = new Hitung(30,40);
        System.out.println("Keliling persegi panjang dengan panjang "+ persegi2.panjang+" dan lebar "+persegi2.lebar+" adalah "+persegi2.getKeliling());
        System.out.println("Luas persegi panjang dengan panjang "+ persegi2.panjang+" dan lebar "+persegi2.lebar+" adalah "+persegi2.getLuas());
        
        Hitung persegi3 = new Hitung(25,35);
        System.out.println("Keliling persegi panjang dengan panjang "+ persegi3.panjang+" dan lebar "+persegi3.lebar+" adalah "+persegi3.getKeliling());
        System.out.println("Luas persegi panjang dengan panjang "+ persegi3.panjang+" dan lebar "+persegi3.lebar+" adalah "+persegi3.getLuas());
    }
    
}
