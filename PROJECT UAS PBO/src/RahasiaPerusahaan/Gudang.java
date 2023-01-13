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
import java.util.ArrayList;

public abstract class Gudang {
  ArrayList<Barang> daftarBarang;
  ArrayList<Vendor> daftarVendor;

  public Gudang() {
    // inisialisasi GUI dan komponennya
  }

  public abstract void tambahBarang(Barang barang);
  public abstract void tambahVendor(Vendor vendor);
  public abstract void tambahStokBarang(String kodeBarang, int jumlah);
  public abstract void kurangiStokBarang(String kodeBarang, int jumlah);
  public abstract ArrayList<Barang> getDaftarBarang();
  public abstract ArrayList<Vendor> getDaftarVendor();
  public abstract Barang cariBarang(String kode);
}