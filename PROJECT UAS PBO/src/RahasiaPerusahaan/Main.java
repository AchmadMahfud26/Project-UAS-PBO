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
 public class Main {
  public static void main(String[] args) {
    GudangImpl gudang = new GudangImpl();
    Vendor vendor = new VendorImpl("vendor 1", "123456789", "Jakarta");
    Barang barang = new BarangImpl("b001", "barang 1", vendor, "2022-01-01", "elektronik", 10);
    gudang.tambahBarang(barang);
    gudang.tambahVendor(vendor);
    gudang.tambahStokBarang("b001", 5);
    gudang.kurangiStokBarang("b001", 3);
    gudang.getDaftarBarang().forEach((item) -> {
        System.out.println(item.getKode() + " | " + item.getNama() + " | " + item.getVendor().getNama() + " | " + item.getTanggalKiriman() + " | " + item.getJenis() + " | " + item.getJumlah());
      });
    gudang.getDaftarVendor().forEach((vend) -> {
        System.out.println(vend.getNama() + " | " + vend.getKontak() + " | " + vend.getAlamat());
      });
    Pegawai pegawai = new PegawaiImpl("john doe", "staff", gudang);
    pegawai.tambahBarang(barang);
    Barang item = pegawai.cariBarang("b001");
    if (item != null) {
      System.out.println("Barang ditemukan: " + item.getKode() + " | " + item.getNama() + " | " + item.getVendor().getNama() + " | " + item.getTanggalKiriman() + " | " + item.getJenis() + " | " + item.getJumlah());
    } else {
      System.out.println("Barang tidak ditemukan");
    }
    Perusahaan perusahaan = new PerusahaanImpl("XYZ");
    perusahaan.tambahVendor(vendor);
    perusahaan.tambahPegawai(pegawai);
    perusahaan.getDaftarVendor().forEach((vend) -> {
        System.out.println(vend.getNama() + " | " + vend.getKontak() + " | " + vend.getAlamat());
      });
    perusahaan.getDaftarPegawai().forEach((peg) -> {
        System.out.println(peg.getNama() + " | " + peg.getJabatan());
      });
  }
}