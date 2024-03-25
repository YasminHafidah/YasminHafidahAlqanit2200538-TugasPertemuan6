package PersegiPanjang;
public class Hitung {
    int panjang;
    int lebar;
   Hitung(){
        panjang = 1;
        lebar = 1;
   }
   
   Hitung(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
   }
   
   int getKeliling(){
       return 2*(panjang+lebar);
   }
   
   int getLuas(){
       return panjang * lebar;
   }
   
   void setPanjang(int panjangBaru){
       panjang = panjangBaru;
   }
   
   void setLebar(int lebarBaru){
       lebar = lebarBaru;
   }
}
