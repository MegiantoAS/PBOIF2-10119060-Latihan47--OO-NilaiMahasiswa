/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan47.oo.nilaimahasiswa;
import Nilai.Nilai;
/**
 *
@author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Nilai mahasiswa
 */
public class PBOIF210119060Latihan47OONilaiMahasiswa {

    public static void main(String[] args) {
        // TODO code application logic here
        Nilai objNilai = new Nilai(75, 45, 34);
        
        System.out.println("QUIZ        ="+objNilai.getQuiz());
        System.out.println("UTS         ="+objNilai.getUts());
        System.out.println("UAS         ="+objNilai.getUas());
        System.out.println("");
        
        System.out.println("Nilai Akhir = "+objNilai.hitungNilaiAkhir(objNilai.getQuiz(), objNilai.getUts(), objNilai.getUas()));
        System.out.println("");
        
        System.out.println("Index       = "+objNilai.aturanIndex());
        System.out.println("Keterangan  = "+objNilai.aturanKeterangan());
        
    }
    
}
