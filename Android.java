/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123230163;

/**
 *
 * @author alama
 */
class Android extends SistemOperasi implements OSBerbasisLinux {
    public Android(String versi) {
        super("Android", versi);
    }
    
    @Override
    public void boot() {
        System.out.println(nama + " versi " + versi + " sedang melakukan booting di perangkat mobile...");
    }
    
    @Override
    public void shutdown() {
        System.out.println(nama + " sedang dimatikan pada perangkat mobile.");
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Sistem Operasi: " + nama + " - Versi: " + versi);
    }
    
    @Override
    public void gunakanTerminal() {
        System.out.println("Menggunakan terminal di Android melalui ADB");
    }
    
    @Override
    public void instalPaket() {
        System.out.println("Menginstal aplikasi melalui Play Store atau APK di Android");
    }
    
    @Override
    public void tampilkanDistro() {
        System.out.println("Android tidak memiliki distro seperti Linux desktop, tetapi berbasis kernel Linux.");
    }
}

