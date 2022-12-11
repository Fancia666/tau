package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class RomanTest {
    @Test
    public void checkOne() {
        String checker = new Roman().getRomanNumber(1);

        assertThat(checker).isEqualTo("I");
    }

    @Test
    public void checkTwo() {
        String checker = new Roman().getRomanNumber(2);

        assertThat(checker).isEqualTo("II");
    }

    @Test
    public void checkThree() {
        String checker = new Roman().getRomanNumber(3);

        assertThat(checker).isEqualTo("III");
    }

    @Test
    public void checkFour() {
        String checker = new Roman().getRomanNumber(4);

        assertThat(checker).isEqualTo("IV");
    }

    @Test
    public void checkFive() {
        String checker = new Roman().getRomanNumber(5);

        assertThat(checker).isEqualTo("V");
    }

    @Test
    public void checkSix() {
        String checker = new Roman().getRomanNumber(6);

        assertThat(checker).isEqualTo("VI");
    }

    @Test
    public void checkNine() {
        String checker = new Roman().getRomanNumber(9);

        assertThat(checker).isEqualTo("IX");
    }

    @Test
    public void checkTwentySeven() {
        String checker = new Roman().getRomanNumber(27);

        assertThat(checker).isEqualTo("XXVII");
    }

    @Test
    public void checkFortyEight() {
        String checker = new Roman().getRomanNumber(48);

        assertThat(checker).isEqualTo("XLVIII");
    }

    @Test
    public void checkFortyNine() {
        String checker = new Roman().getRomanNumber(49);

        assertThat(checker).isEqualTo("XLIX");
    }

    @Test
    public void checkFiftyNine() {
        String checker = new Roman().getRomanNumber(59);

        assertThat(checker).isEqualTo("LIX");
    }

    @Test
    public void checkNinetyThree() {
        String checker = new Roman().getRomanNumber(93);

        assertThat(checker).isEqualTo("XCIII");
    }

    @Test
    public void check141() {
        String checker = new Roman().getRomanNumber(141);

        assertThat(checker).isEqualTo("CXLI");
    }

    @Test
    public void check163() {
        String checker = new Roman().getRomanNumber(163);

        assertThat(checker).isEqualTo("CLXIII");
    }

    @Test
    public void check402() {
        String checker = new Roman().getRomanNumber(402);

        assertThat(checker).isEqualTo("CDII");
    }

    @Test
    public void check575() {
        String checker = new Roman().getRomanNumber(575);

        assertThat(checker).isEqualTo("DLXXV");
    }

    @Test
    public void check911() {
        String checker = new Roman().getRomanNumber(911);

        assertThat(checker).isEqualTo("CMXI");
    }

    @Test
    public void check1024() {
        String checker = new Roman().getRomanNumber(1024);

        assertThat(checker).isEqualTo("MXXIV");
    }

    @Test
    public void check3000() {
        String checker = new Roman().getRomanNumber(3000);

        assertThat(checker).isEqualTo("MMM");
    }

}
