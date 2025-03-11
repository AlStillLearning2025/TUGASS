/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_kuis_123230163;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Detail_Penyewaan extends JFrame {

    private String jenisKendaraan;
    private JTextField namaField, teleponField, hariField;
    private JRadioButton maticRB, bebekRB, sportRB, sedanRB, suvRB, mpvRB;
    private ButtonGroup jenisGroup;

    public Detail_Penyewaan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
        setTitle("Detail Penyewaan " + jenisKendaraan);
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Nama Penyewa:"));
        namaField = new JTextField();
        add(namaField);

        add(new JLabel("Nomor Telepon:"));
        teleponField = new JTextField();
        add(teleponField);

        add(new JLabel("Jenis Kendaraan:"));

        jenisGroup = new ButtonGroup();
        if (jenisKendaraan.equals("Motor")) {
            maticRB = new JRadioButton("Matic (Rp 50.000/hari)");
            bebekRB = new JRadioButton("Bebek (Rp 40.000/hari)");
            sportRB = new JRadioButton("Sport (Rp 70.000/hari)");
            jenisGroup.add(maticRB);
            jenisGroup.add(bebekRB);
            jenisGroup.add(sportRB);
            add(maticRB);
            add(bebekRB);
            add(sportRB);
        } else {
            sedanRB = new JRadioButton("Sedan (Rp 200.000/hari)");
            suvRB = new JRadioButton("SUV (Rp 300.000/hari)");
            mpvRB = new JRadioButton("MPV (Rp 250.000/hari)");
            jenisGroup.add(sedanRB);
            jenisGroup.add(suvRB);
            jenisGroup.add(mpvRB);
            add(sedanRB);
            add(suvRB);
            add(mpvRB);
        }

        add(new JLabel("Jumlah Hari:"));
        hariField = new JTextField();
        add(hariField);

        JButton simpanButton = new JButton("Simpan");
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tombol Simpan diklik!");
                String nama = namaField.getText();
                String telepon = teleponField.getText();
                String jenis = "";
                int harga = 0;
                if (jenisKendaraan.equals("Motor")) {
                    if (maticRB.isSelected()) {
                        jenis = "Matic";
                        harga = 50000;
                    } else if (bebekRB.isSelected()) {
                        jenis = "Bebek";
                        harga = 40000;
                    } else if (sportRB.isSelected()) {
                        jenis = "Sport";
                        harga = 70000;
                    }
                } else {
                    if (sedanRB.isSelected()) {
                        jenis = "Sedan";
                        harga = 200000;
                    } else if (suvRB.isSelected()) {
                        jenis = "SUV";
                        harga = 300000;
                    } else if (mpvRB.isSelected()) {
                        jenis = "MPV";
                        harga = 250000;
                    }
                }
                try {
                    int hari = Integer.parseInt(hariField.getText());
                    System.out.println("Nama: " + nama);
                    System.out.println("Telepon: " + telepon);
                    System.out.println("Jenis: " + jenisKendaraan + " " + jenis);
                    System.out.println("Harga: " + harga);
                    System.out.println("Hari: " + hari);

                    try {
                        SwingUtilities.invokeLater(() -> {
                            try{
                                System.out.println("Membuat objek DetailHarga...");
                                new Detail_Harga(nama, telepon, jenisKendaraan + " " + jenis, harga, hari).setVisible(true);
                                System.out.println("Objek DetailHarga dibuat dan ditampilkan.");
                            } catch (Exception err){
                                System.err.println("Error saat membuat Detail_Harga");
                                err.printStackTrace();
                            }

                        });
                    } catch (Exception ex) {
                        System.err.println("Terjadi kesalahan saat membuat DetailHarga: " + ex.getMessage());
                        ex.printStackTrace();
                    }

                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Detail_Penyewaan.this, "Masukkan jumlah hari yang valid (angka).", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Detail_Penyewaan.this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(simpanButton);

        setVisible(true);
    }
}