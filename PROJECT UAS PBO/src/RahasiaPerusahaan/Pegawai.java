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
public abstract class Pegawai {
  String nama;
  String jabatan;
  Gudang gudang;

  public Pegawai(String nama, String jabatan, Gudang gudang) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.gudang = gudang;
  }

  public String getNama() {
    return nama;
  }

  public String getJabatan() {
    return jabatan;
  }

  public abstract void tambahBarang(Barang barang);
  public abstract Barang cariBarang(String kode);
}