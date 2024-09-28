package org.example.typeofClasses.localClass.filterListString;

public class Main {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        stringProcessor.filterStrings(new String[]{"Jazz", "Bumblebee", "Megatron", "OptimusPrime"}, 5);
    }
}
