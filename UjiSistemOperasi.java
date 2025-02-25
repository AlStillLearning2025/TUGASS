/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_123230163;

/**
 *
 * @author alama
 */
public class UjiSistemOperasi {
    public static void main(String[] args) {
        SistemOperasi windows = new Windows("Windows", "10");
        SistemOperasi macos = new MacOS("macOS", "Monterey");
        Linux linux = new Linux("Linux", "5.15", "Ubuntu");
        Android android = new Android("12");
        
        try {
            windows.boot();
            macos.boot();
            linux.boot();
            android.boot();
            
            if (linux.versi.equals("4.0")) {
                throw new VersiTidakDukunganException("Versi tidak didukung untuk " + linux.nama);
            }
        } catch (VersiTidakDukunganException e) {
            System.out.println("Peringatan: " + e.getMessage());
        }
        
        windows.tampilkanInfo();
        macos.tampilkanInfo();
        linux.tampilkanInfo();
        android.tampilkanInfo();
        
        linux.gunakanTerminal();
        linux.instalPaket();
        linux.tampilkanDistro();
        
        android.gunakanTerminal();
        android.instalPaket();
        android.tampilkanDistro();
    }
}


