/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RahasiaPerusahaan;

/**
 *
 * @author ASUS
 */
public abstract class Vendor {
  String nama;
  String kontak;
  String alamat;

  public Vendor(String nama, String kontak, String alamat) {
    this.nama = nama;
    this.kontak = kontak;
    this.alamat = alamat;
  }

  public String getNama() {
    return nama;
  }

  public String getKontak() {
    return kontak;
  }
  public String getAlamat() {
    return alamat;
  }

  public abstract int hitungTotalPembelian();
  public abstract void tambahPembelian(int jumlah, int harga);
}
 