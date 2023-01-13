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
public class GudangImpl extends Gudang {
  public GudangImpl() {
    daftarBarang = new ArrayList<>();
    daftarVendor = new ArrayList<>();
  }

  @Override
  public void tambahBarang(Barang barang) {
    daftarBarang.add(barang);
  }

  @Override
  public void tambahVendor(Vendor vendor) {
    daftarVendor.add(vendor);
  }

  @Override
  public void tambahStokBarang(String kodeBarang, int jumlah) {
    for(Barang barang : daftarBarang) {
      if (barang.getKode().equals(kodeBarang)) {
        barang.setJumlah(barang.getJumlah() + jumlah);
      }
    }
  }

  @Override
  public void kurangiStokBarang(String kodeBarang, int jumlah) {
    for(Barang barang : daftarBarang) {
      if (barang.getKode().equals(kodeBarang)) {
        if(barang.getJumlah()<jumlah) {
          System.out.println("Jumlah barang tidak cukup");
        } else {
          barang.setJumlah(barang.getJumlah() - jumlah);
        }
      }
    }
  }

  @Override
  public ArrayList<Barang> getDaftarBarang() {
    return daftarBarang;
  }
  
  @Override
  public ArrayList<Vendor> getDaftarVendor() {
    return daftarVendor;
  }

  @Override
  public Barang cariBarang(String kode) {
    for (Barang barang : daftarBarang) {
      if (barang.getKode().equals(kode)) {
        return barang;
      }
    }
    return null;
  }

}
