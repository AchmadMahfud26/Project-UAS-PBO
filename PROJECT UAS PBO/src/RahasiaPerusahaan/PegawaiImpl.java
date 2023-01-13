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
public class PegawaiImpl extends Pegawai {

  public PegawaiImpl(String nama, String jabatan, Gudang gudang) {
    super(nama, jabatan, gudang);
  }

  @Override
  public void tambahBarang(Barang barang) {
    gudang.tambahBarang(barang);
  }

  @Override
  public Barang cariBarang(String kode) {
    return gudang.cariBarang(kode);
  }
}
