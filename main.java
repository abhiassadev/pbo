// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("========================================================");
    System.out.println("PROGRAM ARRAY (MATRIX)");
    System.out.println("========================================================");
    System.out.print("Panjang Elemen Baris : ");
    int panjangBaris = input.nextInt();
    System.out.print("Panjang Elemen Kolom : ");
    int panjangKolom = input.nextInt();
    System.out.println("========================================================");
    
    int [][] matrix = new int[panjangBaris][panjangKolom];
    boolean isGenap = random.nextBoolean();
      
    for (int baris = 0; baris < panjangBaris; baris++) {
      for (int kolom = 0; kolom < panjangKolom; kolom ++) {
        if (isGenap) {
          matrix[baris][kolom] = 2 * (random.nextInt(10) + 1);
        } else {
          matrix[baris][kolom] = 2 * random.nextInt(10) + 1;
        }
        // matrix[baris][kolom] = random.nextInt(20);
      }
    }

    for (int baris = 0; baris < matrix.length; baris++) {
      for (int kolom = 0; kolom < matrix[baris].length; kolom ++) {
        System.out.println("Input Angka ke dalam index [" + baris + "][" + kolom + "] = " + matrix[baris][kolom]);
        
      }
      System.out.println("========================================================");
    }
      System.out.println("TAMPILKAN ISI ARRAY MATRIX ANGKA");
      System.out.println("========================================================");
    for (int baris = 0; baris < panjangBaris; baris++) {
      int jumlahBaris = 0;
      System.out.print("Baris ke-" + (baris + 1) + " (" + (isGenap ? "Genap" : "Ganjil") + ")" + " : ");
      for (int kolom = 0; kolom < panjangKolom; kolom ++) {
        if ((matrix[baris][kolom] % 2 == 0 && isGenap) || (matrix[baris][kolom] % 2 != 0 && !isGenap)) {
        System.out.print("\t" + matrix[baris][kolom] + "\t");
        jumlahBaris += matrix[baris][kolom];
          
        }
      }
      System.out.println(" = " + jumlahBaris);
    }
      System.out.println("========================================================");

int [] jumlahKolom = new int[panjangKolom];
    int totalAngka = 0;
    for (int kolom = 0; kolom < panjangKolom; kolom ++) {
      for (int baris = 0; baris < panjangBaris; baris++) {
        jumlahKolom[kolom] += matrix[baris][kolom];
        totalAngka += matrix[baris][kolom];
      }
    }
      System.out.print("Jumlah Kolom    \t: ");
      
      for (int kolom = 0; kolom < panjangKolom; kolom ++) {
        System.out.print("\t" + jumlahKolom[kolom] + "\t");
      }
    
      System.out.println("\n========================================================");
      System.out.println("Total Angka " + totalAngka);
      System.out.println("========================================================");
    
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}