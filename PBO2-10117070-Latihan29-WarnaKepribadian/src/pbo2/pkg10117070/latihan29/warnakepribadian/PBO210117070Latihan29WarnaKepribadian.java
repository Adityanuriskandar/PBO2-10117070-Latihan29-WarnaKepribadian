/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding berwarna.
 */
public class PBO210117070Latihan29WarnaKepribadian {
//TEXT COLOR
        public static final String ANSI_RESET ="\u001B[0m";
        public static final String ANSI_BLACK ="\u001B[30m";
        public static final String ANSI_RED ="\u001B[31m";
        public static final String ANSI_GREEN ="\u001B[32m";
        public static final String ANSI_YELLOW ="\u001B[33m";
        public static final String ANSI_BLUE ="\u001B[34m";
        public static final String ANSI_PURPLE ="\u001B[35m";
        public static final String ANSI_CYAN ="\u001B[36m";
        public static final String ANSI_WHITE ="\u001B[37m";
//TEXT BACKGROUND
        public static final String ANSI_BLACK_BACKGROUND ="\u001B[40m";
        public static final String ANSI_RED_BACKGROUND ="\u001B[41m";
        public static final String ANSI_GREEN_BACKGROUND ="\u001B[42m";
        public static final String ANSI_YELLOW_BACKGROUND ="\u001B[43m";
        public static final String ANSI_BLUE_BACKGROUND ="\u001B[44m";
        public static final String ANSI_PURPLE_BACKGROUND ="\u001B[45m";
        public static final String ANSI_CYAN_BACKGROUND ="\u001B[46m";
        public static final String ANSI_WHITE_BACKGROUND ="\u001B[47m";
    /**
     * @param args the command line arguments
     */
    public static void hasil(String colorPilih) {
        // TODO code application logic here
        String color = colorPilih.toUpperCase();
        switch (color){
            case "MERAH":
                System.out.print(ANSI_RED+" MERAH \n"+ ANSI_RESET);
                System.out.println("1. Periang \n"
                        +"2. Pemberani"
                        +"3. Berani mengambil resiko dalam setiap langkah, \n"
                        +"4. Menyukai tantangan, \n"
                        +"5. Kurang sabar, \n"
                        +"6. Dapat menahan marah namun jika tahap puncak "
                        +"toleransi, kemarahannya akan sulit dikontrol, \n"
                        +"7. Memiliki energi kehangatan dan cinta.");
            break;
            case "HIJAU":
                System.out.println(ANSI_GREEN+" HIJAU \n"+ ANSI_RESET);
                System.out.println("1. Romantis, \n"
                        +"2. Menyukai hal yang berbau alami dan keindahan, \n"
                        +"3. Teguh pada prinsip, \n"
                        +"4. Menginginkan kesempurnaan, \n"
                        +"5. Mudah Cemburu, \n"
                        +"6. Mudah Merasa, \n "
                        +"7. Menjunjung tinggi suatu nilai toleransi dan "
                        +"keparcayaan, \n");
                        
            break;
            case "KUNING":
                System.out.println(ANSI_YELLOW+" KUNING \n"+ ANSI_RESET);
                System.out.println("1. Optimis \n"
                        +"2.  Suka bergaul, \n"
                        +"3.  Periang, \n"
                        +"4.  Suka menolong, \n"
                        +"5.  Lincah dan aktif, \n"
                        +"6.  Tidak suka meremehkan kekurangan orang lain, \n"
                        +"7.  Loyal, \n"
                        +"8.  Hangat, \n"
                        +"9.  Meskipun karakternya optimis dan idealis, "
                        +"seringkali goyah dan tidak stabil, \n"
                        +"10. Cenderung penakut, \n");
            break;
            case "BIRU":
                System.out.println(ANSI_BLUE+" BIRU \n"+ ANSI_RESET);
                System.out.println("1. Menyenangkan \n"
                        +"2. Bijaksana, \n"
                        +"3. Pembawaan diri tenang saat menghadapi masalah, \n"
                        +"4. Dinamis, \n"
                        +"5. Senang berbagi, \n"
                        +"6. Bersahabat, \n "
                        +"7. Tidak terlalu suka menjadi sorotan banyak orang, \n"
                        +"8. Menyembunyikan perasaan karena karakternya yang"
                        +" cenderung mencari jalan damai.");
            break;
            case "UNGU":
                System.out.println(ANSI_PURPLE+" UNGU \n"+ ANSI_RESET);
                System.out.println("1. Optimis, \n"
                        +"2. Tidak pernah ragu, \n"
                        +"3. Menurut pasangannya yang ideal adalah yang"
                        +" memiliki mental yang kuat, \n"
                        +"4. Memiliki ambisi yang besar, \n"
                        +"5. Memiliki empati yang besar, \n "
                        +"6. Memiliki sisi misterius sebab seringkali menutupi"
                        +" perasaannya, \n"
                        +"7. Terkadang bersikap keras kepala dan angkuh, \n");
            break;
            default:
                System.out.println("Maaf Belum Terdefinisikan");
                break;
        }
    }
//    Method Utama
    public static void main (String[] args){
        String colorPilih;
        String nama;
        Scanner berwarna = new Scanner(System.in);
        
        System.out.println(ANSI_RED+"YUK "+ANSI_RESET);
        System.out.println(ANSI_GREEN+"CEK "+ANSI_RESET);
        System.out.println(ANSI_YELLOW+"KEPRIBADIANMU "+ANSI_RESET);
        System.out.println(ANSI_CYAN+"DARI "+ANSI_RESET);
        System.out.println(ANSI_PURPLE+"WARNA "+ANSI_RESET);
        System.out.println(ANSI_BLUE+"FAVORITMU "+ANSI_RESET);
    
        System.out.print("\n"+ANSI_RED_BACKGROUND + ANSI_WHITE +
                "\t MERAH \t\t"+ ANSI_RESET);
        System.out.print("\n"+ANSI_GREEN_BACKGROUND+ANSI_WHITE +
                "\t HIJAU \t\t"+ ANSI_RESET);
        System.out.print("\n"+ANSI_YELLOW_BACKGROUND+ANSI_WHITE +
                "\t KUNING \t\t"+ ANSI_RESET);
        System.out.print("\n"+ANSI_BLUE_BACKGROUND+ANSI_WHITE +
                "\t BIRU \t\t"+ ANSI_RESET);
        System.out.print("\n"+ANSI_PURPLE_BACKGROUND+ANSI_WHITE +
                "\t UNGU \t\t\n\n"+ ANSI_RESET);
//        INPUT
        System.out.print(" PILIH WARNA FAVORITMU\t : ");
        colorPilih = berwarna.next();
        
        System.out.print(" Nama Kamu\t : ");
        nama = berwarna.next();
        
//        Hasil
        System.out.println("\n===Hasil Test Kepribadian "
                + nama.toUpperCase()+"===");
        
        hasil(colorPilih);
    }
        
    
}
