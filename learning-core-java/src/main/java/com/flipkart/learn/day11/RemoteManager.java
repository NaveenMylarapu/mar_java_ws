package com.flipkart.learn.day11;

public class RemoteManager {
    public static void main(String[] args) {
        Remote r1 = new Remote();
        Remote r2 = new Remote();
        Remote r3 = new Remote();
        Remote r4 = new Remote();
        System.out.println(r1.volume);
        System.out.println(r1.ismute);
       r1.volumeUp();
        System.out.println(r1.volume);
       r1.mute();
        System.out.println(r1.volume);
      // r1.volumeDown();
        //System.out.println(r1.volume);
        r1.volumeUp();
        System.out.println(r1.volume);

    }
}
