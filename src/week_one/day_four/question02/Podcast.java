package src.week_one.day_four.question02;

public class Podcast implements Playable{
    private String fileName;
    private String host;
    private String topic;

    public Podcast(String fileName, String host, String topic) {
        this.fileName = fileName;
        this.host = host;
        this.topic = topic;
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + this.fileName + " hosted by " + this.host + " on " + this.topic);
    }
}
