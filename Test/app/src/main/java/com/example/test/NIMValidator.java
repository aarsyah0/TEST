package com.example.test;

public class NIMValidator {
    // Deklarasi metode statis 'isTrue' untuk memvalidasi NIM
    public static boolean isTrue(String nim) {
        // Definisi ekspresi reguler untuk memeriksa format nim
       String formatNIM = "^[A-Za-z0-9+_.-]+[*]";
        // Memeriksa apakah 'nim' cocok dengan ekspresi reguler
        // Jika cocok, maka nim dianggap valid dan metode mengembalikan 'true'

        return nim.matches(formatNIM);
    }
}
