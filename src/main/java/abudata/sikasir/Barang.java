/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abudata.sikasir;

/**
 *
 * @author nunu
 */
public class Barang {
    private String nama;
    private double harga;
    
    public double hitungsubtotal(int jumlah) {
    return harga * jumlah;
    } 
    public Barang (String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama(){
    return nama;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        }
    }
}

