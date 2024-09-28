package org.example.OOP.anonymousClass;

public class Main  {
    public static void main(String[] args) {
        SoundControl soundControl = new SoundControl() {
            @Override
            public void play() {
                System.out.println("Воспроизведение начато");
            }

            @Override
            public void stop() {
                System.out.println("Воспроизведение остановлено");
            }
        };

        soundControl.play();
        soundControl.stop();
    }
}
