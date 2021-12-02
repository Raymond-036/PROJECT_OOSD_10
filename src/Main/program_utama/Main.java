package Main.program_utama;

import Main.kelas.*;

import java.util.Scanner;

public class Main {
    /*1. set main method*/
    public static void main(String[] args) {
        /*2. instansiasi kelas Scanner*/
        Scanner scanner = new Scanner(System.in);
        /*3 set variabel / atribut untuk menampung inputan user*/
        String aksi;

        while(true) {
            System.out.println("= = = = = = = = = = = = ");
            System.out.println("=== SELAMAT DATANG ===");
            System.out.println("= = = = = = = = = = = = ");
            System.out.println("||== MENU UTAMA :  ==||");
            System.out.println("1. Info Dosen");
            System.out.println("2. Info Mata Kuliah");
            System.out.println("3. Jadwal Kuliah");
            System.out.println("4. Info Ruangan");
            System.out.println("5. Info Gedung");
            System.out.println("6. Laporan");
            System.out.println("7. Pengumuman");
            System.out.println("8. Silabus");
            System.out.println("9. Metode Pembelajaran");
            System.out.println("10. Keluar");
            System.out.println("= = = = = = = = = = = = = = =");

            System.out.print("Pilih nomor pada daftar menu : "); //1
            /*4. membaca dan menyimpan inputan user ke variable aksi */
            aksi = scanner.nextLine();


            /*5. menggunakan pengkondisian untuk memfilter inputan user*/
            if(aksi.equalsIgnoreCase("1")) {
                /*6. instansiasi kelas InfoDosenDriver*/
                InfoDosenDriver infoDosenDriver = new InfoDosenDriver();
                System.out.println("Pilihan anda adalah : " + aksi);
                infoDosenDriver.tampilDataDosen();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if(aksi.equalsIgnoreCase("2")) {
                /*7. instansiasi kelas InfoMataKuliah*/
                InfoMataKuliahDriver infoMataKuliahDriver = new InfoMataKuliahDriver();
                System.out.println("Pilihan anda adalah : " + aksi);
                infoMataKuliahDriver.tampilInfoMataKuliah();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("3")) {
                /*8. instansiasi kelas JadwalKuliah*/
                JadwalKuliah jadwalKuliah = new JadwalKuliah();
                System.out.println("Pilihan anda adalah : " + aksi);
                jadwalKuliah.tampilJadwalKuliah();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("4")) {
                /*9. instansiasi kelas InfoRuangan*/

            } else if (aksi.equalsIgnoreCase("5")) {
                /*10. instansiasi kelas InfoGedung*/
                InfoGedung infoGedung = new InfoGedung();
                System.out.println("Pilihan anda adalah : " + aksi);
                infoGedung.tampilInfoGedung();
                System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                String ulang;
                ulang = scanner.next();
                if (ulang.equals("t")) {
                    System.exit(0);
                }
            } else if (aksi.equalsIgnoreCase("6")) {

            } else if (aksi.equalsIgnoreCase("7")) {

            } else if (aksi.equalsIgnoreCase("8")) {

            } else if (aksi.equalsIgnoreCase("9")) {
                Scanner inputUser = new Scanner(System.in);
                String input;
                System.out.println("1. Tatap Muka");
                System.out.println("2. Pembelajaran Jarak Jauh");
                System.out.print("== MASUKKAN ANGKA : \n");
                input = inputUser.next();
                if (input.equalsIgnoreCase("1")) {
                    System.out.println();
                    /*11. instansiasi kelas MetodePembelajaran*/
                    MetodePembelajaran metodePembelajaran = new MetodePembelajaran();
                    metodePembelajaran.metodeTatapMuka();
                    System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                    String ulang;
                    ulang = inputUser.next();
                    if (ulang.equals("t")) {
                        System.exit(0);
                    }
                    continue;
                } else {
                    System.out.println();
                    /*12. instansiasi kelas MetodePembelajaran*/
                    MetodePembelajaran metodePembelajaran = new MetodePembelajaran();
                    metodePembelajaran.metodeJarakJauh();
                    System.out.print("Apakah anda ingin melihat informasi lagi (y/t)? ");

                    String ulang;
                    ulang = inputUser.next();
                    if (ulang.equals("t")) {
                        System.exit(0);
                    }
                }
            } else if (aksi.equalsIgnoreCase("10")) {
                String pilihan;
                System.out.print("Apakah Anda ingin keluar ? (y/t) : ");
                pilihan = scanner.next();
                if (pilihan.equals("y")) {
                    System.exit(0);
                }
                System.out.println("=== TERIMAKASIH SUDAH BERKUNJUNG ===");
                break;
            }
        }
    }
}