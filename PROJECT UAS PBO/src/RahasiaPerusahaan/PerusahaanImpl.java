/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RahasiaPerusahaan;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PerusahaanImpl extends Perusahaan {
  String namaPerusahaan;

  public PerusahaanImpl(String namaPerusahaan) {
    daftarVendor = new ArrayList<>();
    daftarPegawai = new ArrayList<>();
    this.namaPerusahaan = namaPerusahaan;
  }

  @Override
  public void tambahVendor(Vendor vendor) {
    daftarVendor.add(vendor);
  }

  @Override
  public void tambahPegawai(Pegawai pegawai) {
    daftarPegawai.add(pegawai);
  }

  @Override
  public ArrayList<Vendor> getDaftarVendor() {
    return daftarVendor;
  }

  @Override
  public ArrayList<Pegawai> getDaftarPegawai() {
    return daftarPegawai;
  }
}
