package spring.beans.musical;

import spring.beans.Music;

public class RockMusic implements Music {
    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    private RockMusic() {
    }


    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
