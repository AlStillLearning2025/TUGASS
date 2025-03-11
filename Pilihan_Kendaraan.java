/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_kuis_123230163;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pilihan_Kendaraan extends JFrame {

    public Pilihan_Kendaraan() {
        setTitle("Pilihan Kendaraan");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton motorBtn= new JButton("Motor");
        JButton mobilBtn = new JButton("Mobil");

        motorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Detail_Penyewaan("Motor").setVisible(true);
                dispose();
            }
        });

        mobilBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Detail_Penyewaan("Mobil").setVisible(true);
                dispose();
            }
        });

        add(motorBtn);
        add(mobilBtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Pilihan_Kendaraan();
    }
}