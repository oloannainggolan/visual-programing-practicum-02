//12S23033 - Oloan Nainggolan

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int kapasitas, jumlah, skor;
        String nama, ac, lantai, ketersediaan, status;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        jumlah = input.nextInt();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor >= 40) {
            status = "Gudang Elite";
        } else {
            if (skor >= 25) {
                status = "Gudang Standar";
            } else {
                if (skor < 25) {
                    status = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang");
        System.out.println(nama + "|" + kapasitas + "|" + jumlah + "|" + ac + "|" + lantai + "|" + ketersediaan + "|" + skor + "|" + status);
    }
}
