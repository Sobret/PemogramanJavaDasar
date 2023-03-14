package chapter9_object_classes.latihan;

public class listing3 {
    int channel1 = 1;
    int volumelevel1 = 1;
    boolean on = false;

    public listing3() {
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
public void setChannel(int newChannel) {
    if (on && newChannel >= 1 && newChannel <= 120)
        channel1 = newChannel;
    }
    public void setVolume(int newVolumeLevel) {
      if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
        volumelevel1 = newVolumeLevel;
    }
    public void channelUp() {
        if (on && channel1 < 120)
            channel1++;
    }
        public void channelDown() {
        if (on && channel1 > 1)
            channel1--;
    }
        public void volumeUp() {
        if (on && volumelevel1 < 7)
            volumelevel1++;
    }

        public void volumeDown() {
        if (on && volumelevel1 > 1)
            volumelevel1--;
    }
}
