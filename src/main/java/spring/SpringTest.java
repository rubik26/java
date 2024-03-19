package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.MusicPlayer;
import spring.beans.musical.ClassicalMusic;
import spring.beans.musical.RockMusic;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicalBean", ClassicalMusic.class);
        RockMusic rockMusic = context.getBean("musicalBean2", RockMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());


        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.setVolume(20);
        System.out.println("firstMusicPlayer");
        firstMusicPlayer.musicPlay();
        System.out.println();
        System.out.println("secondMusicPlayer");
        secondMusicPlayer.musicPlay();

        context.close();
    }
}
