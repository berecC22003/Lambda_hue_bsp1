package bsp2;

import bsp2.HalloJavamitForEach;

public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();

        halloJavamitForEach.stringListOld.add("Kotlin");
        halloJavamitForEach.stringListOld.add("Java");

        halloJavamitForEach.printOld();
        halloJavamitForEach.printNew();

    }
}