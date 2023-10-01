//12S23033 - Oloan Nainggolan

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int aNGKA;
        String p;

        aNGKA = input.nextInt();
        p = input.nextLine();
        if (aNGKA >= 3) {
            p = "PENTING";
        } else {
            if (aNGKA < 3 && aNGKA > 1.5) {
                p = "MENENGGAH";
            } else {
                if (aNGKA < 1.5) {
                    p = "AKHIR";
                }
            }
        }
        System.out.println(p);
    }
}
