package com.flipkart.learn.day11;

public class Remote {
    int volume;
     boolean ismute;
    public Remote(){
        this.volume =5;
        this.ismute = false;
    }
    public void volumeUp() {
        if(this.ismute) {
            this.ismute =false;
        }
        this.volume++;
    }
    public void volumeDown(){
        if(volume>0) {
            this.volume -= 1;
        }
        if(this.volume==0){
            this.ismute= true;
        }
    }
   public void mute(){
        this.volume=0;

   }
}
