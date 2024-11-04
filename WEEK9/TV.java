public class TV {
    int channel = 1; // Default value
    int volumelevel = 1; // Default value
    boolean on = false;

    public TV() { // Constructor
    }

    // turn on tv
    public void turnOn() {
        on = true;
    }

    // turn off tv
    public void turnOff() {
        on = false;
    }

    // set channel
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    // set volume
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumelevel = newVolumeLevel;
    }

    // increase channel
    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    // decrease channel
    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    // increase volume
    public void volumeUp() {
        if (on && volumelevel <= 7)
            volumelevel++;
    }

    // decrease volume
    void volumeDown() {
        if (on && volumelevel > 1)
            volumelevel--;
    }
}
