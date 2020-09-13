/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum01;

/**
 *
 * @author Acer
 */
public class Praktikum01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulasi KA = new Kalkulasi(); /*KA -> Keramik A*/
        KA.sisi = 30;
        KA.hargaPerbox = 54000;
        KA.jmlKeramik = 10;
        KA.kalkulasiKeramikPersegi();
        
        Kalkulasi KB = new Kalkulasi(); /*KB -> Keramik B*/
        KB.sisi = 40;
        KB.hargaPerbox = 65000;
        KB.jmlKeramik = 5;
        KB.kalkulasiKeramikPersegi();
        
        Kalkulasi KC = new Kalkulasi(); /*KC -> Keramik C*/
        KC.panjang = 30;
        KC.lebar = 40;
        KC.hargaPerbox = 60000;
        KC.jmlKeramik = 8;
        KC.kalkulasiKeramikPersegiPanjang();
    }
    
}
