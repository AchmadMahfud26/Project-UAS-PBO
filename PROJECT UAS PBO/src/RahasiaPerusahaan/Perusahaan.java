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

public abstract class Perusahaan {
  ArrayList<Vendor> daftarVendor;
  ArrayList<Pegawai> daftarPegawai;

  public Perusahaan() {
    daftarVendor = new ArrayList<>();
    daftarPegawai = new ArrayList<>();
  }

  public abstract void tambahVendor(Vendor vendor);
  public abstract void tambahPegawai(Pegawai pegawai);
  public abstract ArrayList<Vendor> getDaftarVendor();
  public abstract ArrayList<Pegawai> getDaftarPegawai();
}