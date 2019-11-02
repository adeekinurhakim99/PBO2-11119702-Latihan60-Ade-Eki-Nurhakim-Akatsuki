/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatsuki;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Pein p=new Pein();
        p.setNama("Pein");
        p.setAsal("Amegakure");
        p.setCincin("Nol");
        p.setPasangan("Konan");
        p.setCiri("Rambut lancip, memiliki seperti piercing di hidung, rambut berwarna orange");
        p.Pein();
        
        Deidara d=new Deidara();
        d.setNama("Deidara");
        d.setAsal("Iwagakure");
        d.setCincin("Biru/Hijau");
        d.setPasangan("Sasori");
        d.setCiri("Spesialis ledakan menggunakan tanah liat, memanipulasi tanah liat menggunakan mulut di telapak tangan dan dada, meneropong dengan mata kiri, mata kiri yang terlatih untuk menggagalkan genjutsu Sharingan");
        d.Deidara();
        
        Tobi t=new Tobi();
        t.setNama("Tobi");
        t.setAsal("Konohagakure");
        t.setCincin("Virgo");
        t.setPasangan("Deidara");
        t.setCiri("Topeng jingga dengan satu lubang mata dengan pola pusaran yang terpusat pada mata kanan, Sharingan");
        t.Tobi();
        
        Kisame k=new Kisame();
        k.setNama("Kisame Hoshigaki");
        k.setAsal("Kirigakure");
        k.setCincin("Selatan");
        k.setPasangan("Itachi Uchiha");
        k.setCiri("Penampilan seperti ikan hiu");
        k.Kisame();
        
        Zetsu z=new Zetsu();
        z.setNama("Zetsu");
        z.setAsal("Kusagakure");
        z.setCincin("亥");
        z.setPasangan("-");
        z.setCiri("Mempunyai dua kepribadian, kanibal");
        z.Zetsu();
        
        Konan ko=new Konan();
        ko.setNama("Konan");
        ko.setAsal("-");
        ko.setCincin("Putih");
        ko.setPasangan("Pein");
        ko.setCiri("Memiliki aksesoris seperti bunga di kepala");
        ko.Konan();
        
        Itachi i=new Itachi();
        i.setNama("Itachi");
        i.setAsal("Konohagakure");
        i.setCincin("Merah Darah");
        i.setPasangan("Kisame Hosigakhi");
        i.setCiri("Ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan");
        i.Itachi();
        
        Orochimaru o=new Orochimaru();
        o.setNama("Orochimaru");
        o.setAsal("Konohagakure");
        o.setCincin("Langit");
        o.setPasangan("-");
        o.setCiri("Penampilan seperti ular, dapat memperpanjang hidup dengan memindahkan jiwanya ke tubuh yang baru.");
        o.Orochimaru();
        
        Kakuzu ka=new Kakuzu();
        ka.setNama("Kakuzu");
        ka.setAsal("Takigakure");
        ka.setCincin("Utara");
        ka.setPasangan("Hidan");
        ka.setCiri("Dapat memperpanjang hidupnya dengan cara mengambil jantung manusia, dapat memiliki lima jantung manusia secara bersamaan, dapat menggunakan seluruh lima elemen chakra, tubuh terdiri dari jaring-jaring untuk menyerang dan memanipulasi tubuh yang lain.");
        ka.Kakuzu();
        
        Sasori s=new Sasori();
        s.setNama("Sasori");
        s.setAsal("Sunagakure");
        s.setCincin("Virgo");
        s.setPasangan("Deidara");
        s.setCiri("Ahli boneka, tubuh boneka, spesialis racun");
        s.Sasori();
        
        Hidan h=new Hidan();
        h.setNama("Hidan");
        h.setAsal("-");
        h.setCincin("3 Tingkatan");
        h.setPasangan("Kakuzu");
        h.setCiri("Tidak bisa mati, membawa sabit besar bermata tiga, rambut cepak berwarna pucat");
        h.Hidan();
    }
}
