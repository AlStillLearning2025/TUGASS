/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123230163;

/**
 *
 * @author alama
 */
public abstract class SistemOperasi {
    protected String nama;
    protected String versi;
    
    public SistemOperasi(String nama, String versi) {
        this.nama = nama;
        this.versi = versi;
    }
    
    public abstract void boot();
    public abstract void shutdown();
    public abstract void tampilkanInfo();
}

