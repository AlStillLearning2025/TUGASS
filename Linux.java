/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123230163;

/**
 *
 * @author alama
 */
class Linux extends SistemOperasi implements OSBerbasisLinux {
    private final String distro;
    
    public Linux(String nama, String versi, String distro) {
        super(nama, versi);
        this.distro = distro;
    }
    
    @Override
    public void boot() {
        System.out.println(nama + " distro " + distro + " versi " + versi + " sedang melakukan booting...");
    }
    
    @Override
    public void shutdown() {
        System.out.println(nama + " sedang dimatikan dengan perintah shutdown.");
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Sistem Operasi: " + nama + " - Versi: " + versi + " - Distro: " + distro);
    }
    
    @Override
    public void gunakanTerminal() {
        System.out.println("Menggunakan terminal di " + distro);
    }
    
    @Override
    public void instalPaket() {
        System.out.println("Menginstal paket menggunakan package manager pada " + distro);
    }
    
    @Override
    public void tampilkanDistro() {
        System.out.println("Distro Linux yang digunakan: " + distro);
    }
}

