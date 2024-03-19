package spring.beans;

import spring.beans.musical.ClassicalMusic;
import spring.beans.musical.RockMusic;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private int volume = 40;
    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;
    private Music musics;


    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void musicPlay() {
        System.out.println(volume);
        musicList.add(classicalMusic);
        musicList.add(rockMusic);
        for (int i = 0; i < musicList.size(); i++) {
            musics = musicList.get(i);
            System.out.println(musics.getSong());
        }
    }
}

