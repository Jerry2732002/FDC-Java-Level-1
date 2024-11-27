package src.week_one.day_four.question02;

public class VideoFile implements Playable{
    private String fileName;
    private String resolution;
    private String director;

    public VideoFile(String fileName, String director, String resolution) {
        this.fileName = fileName;
        this.director = director;
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + this.fileName + " directed by " + this.director + " at " + this.resolution);
    }
}
