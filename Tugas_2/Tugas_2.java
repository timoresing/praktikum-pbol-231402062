package Tugas_2;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) {

        Map<Integer, String> mhsDB = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Database Open");
        while (true) {
            System.out.println("\nManajemen Sistem Informasi Mahasiswa Sederhana");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Daftar Mahasiswa");
            System.out.println("3. Edit Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("0. Exit");
            System.out.print("Menu : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nTambah Mahasiswa");
                    System.out.print("NIM (-1 = cancel): ");
                    int nim = scanner.nextInt();
                    scanner.nextLine();
                    if (nim == -1) {
                        break;
                    } else {
                        System.out.print("Nama : ");
                        String nama = scanner.nextLine();
                        mhsDB.put(nim, nama);
                        System.out.println("Data mahasiswa berhasil ditambahkan.");
                    }
                    break;

                case 2:
                    if (mhsDB.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        System.out.println("\nDaftar Mahasiswa");
                        for (Map.Entry<Integer, String> data : mhsDB.entrySet()) {
                            System.out.println("NIM : " + data.getKey() + "; Nama : " + data.getValue());
                        }
                    }
                    break;

                case 3:
                    boolean dataFound = false;
                    while (!dataFound) {
                        System.out.println("\nEdit Data Mahasiswa");
                        System.out.print("NIM (-1 = cancel): ");
                        nim = scanner.nextInt();
                        scanner.nextLine();

                        if (nim == -1) {
                            break;
                        } else if (mhsDB.containsKey(nim)) {
                            System.out.println("Nama lama : " + mhsDB.get(nim));
                            System.out.print("Nama baru : ");
                            String namaBaru = scanner.nextLine();
                            mhsDB.put(nim, namaBaru);
                            dataFound = true;
                            System.out.println("Data mahasiswa berhasil diupdate.");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    }
                    break;

                case 4:
                    dataFound = false;
                    while (!dataFound) {
                        System.out.println("\nHapus Data Mahasiswa");
                        System.out.print("NIM (-1 = cancel): ");
                        nim = scanner.nextInt();
                        if (nim == -1) {
                            break;
                        } else if (mhsDB.containsKey(nim)) {
                            mhsDB.remove(nim);
                            dataFound = true;
                            System.out.println("Data mahasiswa berhasil dihapus.");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Database Closed");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan salah!");
            }
        }
    }
}
