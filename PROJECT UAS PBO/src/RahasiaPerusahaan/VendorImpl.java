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
public class VendorImpl extends Vendor {
  int totalPembelian;

  public VendorImpl(String nama, String kontak, String alamat) {
    super(nama, kontak, alamat);
    totalPembelian = 0;
  }

  @Override
  public int hitungTotalPembelian() {
    return totalPembelian;
  }

  @Override
  public void tambahPembelian(int jumlah, int harga) {
    totalPembelian += jumlah * harga;
  }
}

