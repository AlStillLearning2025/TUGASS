/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123230163;

/**
 *
 * @author alama
 */
class MacOS extends SistemOperasi {
    public MacOS(String nama, String versi) {
        super(nama, versi);
    }
    
    @Override
    public void boot() {
        System.out.println(nama + " versi " + versi + " sedang melakukan booting dengan animasi khas Apple...");
    }
    
    @Override
    public void shutdown() {
        System.out.println(nama + " sedang dimatikan dengan efek fade-out.");
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Sistem Operasi: " + nama + " - Versi: " + versi);
    }
}

