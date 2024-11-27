package src.week_one.day_four.question02;

import java.util.ArrayDeque;
import java.util.Queue;

public class MediaPlayer {
    Queue<Playable> playables = new ArrayDeque<>();
    public void addToQueue(Playable file){
        playables.add(file);
    }
    public void playAll() {
        while (playables.peek() != null) {
            playables.remove().play();
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
