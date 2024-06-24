/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perpustakaan;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author D-12
 */
public class PerpustakaanDigital extends Perpustakaan {

    private HashMap<String, Boolean> daftarBuku;

    public PerpustakaanDigital() {
        this.daftarBuku = new HashMap<>();
        this.daftarBuku.put("Buku A", true);
        this.daftarBuku.put("Buku B", true);
        this.daftarBuku.put("Buku C", true);
    }

    public void pinjamBuku(String judulBuku) {
        if (this.daftarBuku.get(judulBuku)) {
            this.daftarBuku.put(judulBuku, false);
            System.out.println("Meminjam buku: " + judulBuku);
        } else {
            System.out.println("Buku " + judulBuku + " sedang dipinjam.");
        }
    }

    public void kembalikanBuku(String judulBuku) {
        if (!this.daftarBuku.get(judulBuku)) {
            this.daftarBuku.put(judulBuku, true);
            System.out.println("Mengembalikan buku: " + judulBuku);
        } else {
            System.out.println("Buku " + judulBuku + " sudah dikembalikan.");
        }
    }

    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan digital:");
        for (Map.Entry<String, Boolean> entry : this.daftarBuku.entrySet()) {
            String buku = entry.getKey();
            boolean tersedia = entry.getValue();
            System.out.println("- " + buku + " (Tersedia: " + tersedia + ")");
        }
    }
}
