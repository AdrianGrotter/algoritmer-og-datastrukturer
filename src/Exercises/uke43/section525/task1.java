package Exercises.uke43.section525;

import eksempelklasser.SBinTre;

public class task1 {
    public static void main(String[] args) {
        SBinTre<String> tre = SBinTre.balansert("ABCDDEFFGH".split(""));
        System.out.println(tre.antall() + " " + tre.høyde() + " " + tre);
    }
}
