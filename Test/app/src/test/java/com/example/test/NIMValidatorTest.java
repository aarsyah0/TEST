package com.example.test;

import static org.junit.Assert.assertTrue; // Mengimpor metode assertTrue dari pustaka JUnit
import org.junit.Test; // Mengimpor anotasi @Test dari pustaka JUnit

public class NIMValidatorTest {
    @Test // Anotasi @Test menandai metode ini sebagai metode tes JUnit
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        // Mendefinisikan nim yang valid
        String validNIM = "E41220559*";

        // Memanggil metode assertTrue untuk memverifikasi bahwa hasil validasi adalah benar
        assertTrue(NIMValidator.isTrue(validNIM));
    }
}
