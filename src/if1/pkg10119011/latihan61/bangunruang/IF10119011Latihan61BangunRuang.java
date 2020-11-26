/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan61.bangunruang;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF10119011Latihan61BangunRuang {
        
    public static void main(String[] args) {
        Bola bola = new Bola ();
        Kerucut kerucut = new Kerucut ();
        Tabung tabung = new Tabung ();
        System.out.println("===Program menghitung volume bangun ruang===");
        System.out.println();
        
        bola.setJariJari(7);
        System.out.println("Jari-jari bola basket : " + bola.getJariJari());
        System.out.println("Hasil = V = " + bola.hitungVolume());
        
        System.out.println();
        
        kerucut.setJariJari(14);
        kerucut.setTinggi(9);
        System.out.println("Jari-jari kerucut : " + kerucut.getJariJari());
        System.out.println("Tinggi kerucut : " + kerucut.getTinggi());
        System.out.println("Hasil = V = " + kerucut.hitungVolume());
        
        System.out.println();
        
        tabung.setJariJari(10);
        tabung.setTinggi(21);
        System.out.println("Jari-Jari tabung : " + tabung.getJariJari());
        System.out.println("Tinggi kerucut : " + tabung.getTinggi());
        System.out.println("Hasil = V = " + tabung.hitungVolume());
    }
}
