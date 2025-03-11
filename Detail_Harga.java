/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_kuis_123230163;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Detail_Harga extends JFrame {

    public Detail_Harga(String nama, String telepon, String jenis, int harga, int hari) {
        System.out.println("Konstruktor DetailHarga dipanggil!");
        System.out.println("Nama (Detail Harga): " + nama);
        System.out.println("Telepon (Detail Harga): " + telepon);
        System.out.println("Jenis (Detail Harga): " + jenis);
        System.out.println("Hari (Detail Harga): " + hari);
        System.out.println("Harga (Detail Harga): " + harga);

        try {
            setTitle("Detail Harga");
            setSize(300, 200);
            setLayout(new GridLayout(5, 2));
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            add(new JLabel("Nama:"));
            add(new JLabel(nama));

            add(new JLabel("Telepon:"));
            add(new JLabel(telepon));

            add(new JLabel("Jenis:"));
            add(new JLabel(jenis));

            add(new JLabel("Hari:"));
            add(new JLabel(String.valueOf(hari)));

            add(new JLabel("Total:"));
            add(new JLabel("Rp " + (harga * hari)));

            JButton selesaiButton = new JButton("Selesai");
            selesaiButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            add(selesaiButton);

            setVisible(true); // Pastikan ini ada!

        } catch (Exception e) {
            System.err.println("Terjadi kesalahan dalam konstruktor DetailHarga: " + e.getMessage());
            e.printStackTrace();
        }
    }
}