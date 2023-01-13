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
public abstract class Barang {
  String kode;
  String nama;
  Vendor vendor;
  String tanggalKiriman;
  String jenis;
  int jumlah;

  public Barang(String kode, String nama, Vendor vendor, String tanggalKiriman, String jenis, int jumlah) {
    this.kode = kode;
    this.nama = nama;
    this.vendor = vendor;
    this.tanggalKiriman = tanggalKiriman;
    this.jenis = jenis;
    this.jumlah = jumlah;
  }

  public String getKode() {
    return kode;
  }

  public String getNama() {
    return nama;
  }

  public Vendor getVendor() {
    return vendor;
  }

  public String getTanggalKiriman() {
    return tanggalKiriman;
  }

  public String getJenis() {
    return jenis;
  }

  public int getJumlah() {
    return jumlah;
  }

  public void setJumlah(int jumlah) {
    this.jumlah = jumlah;
  }
}
