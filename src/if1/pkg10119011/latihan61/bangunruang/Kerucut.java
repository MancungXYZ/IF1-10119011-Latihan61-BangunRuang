/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan61.bangunruang;

/**
 *
 * @author Reihan Wiyanda
 */
public class Kerucut extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
        public double hitungVolume() {
               return (Math.PI * Math.pow(jariJari, 2) * tinggi) /3;
        }
}
