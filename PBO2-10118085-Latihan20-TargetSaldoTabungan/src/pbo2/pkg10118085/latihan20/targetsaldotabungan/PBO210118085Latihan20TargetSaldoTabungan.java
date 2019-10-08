/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan20.targetsaldotabungan;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Program : Target Saldo Tabungan
 */
public class PBO210118085Latihan20TargetSaldoTabungan {
    public static int saldoawal = 3500000;
    public static void main(String[] args) {
        for (int i = 1; i<=8; i++){
             saldoawal = saldoawal + (int)(saldoawal * 0.08);
             System.out.printf("Saldo di Bulan ke-"+ i +" Rp. %,d%n" , saldoawal);
        }
    }
}
