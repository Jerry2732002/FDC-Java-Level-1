package src.week_one.day_four.question02;

public class AudioFile implements Playable {
    private String fileName;
    private int duration;
    private String artist;

    public AudioFile(String fileName, int duration, String artist) {
        this.fileName = fileName;
        this.duration = duration;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + this.fileName + " by " + this.artist);
    }
}
