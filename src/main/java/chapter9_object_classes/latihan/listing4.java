package chapter9_object_classes.latihan;

public class listing4 {
    public static void main(String[] args) {
        listing3 tv1 = new listing3();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        listing3 tv2 = new listing3();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel1
                + " and volume level is " + tv1.volumelevel1);
        System.out.println("tv2's channel is " + tv2.channel1
                + " and volume level is " + tv2.volumelevel1);
    }
}
