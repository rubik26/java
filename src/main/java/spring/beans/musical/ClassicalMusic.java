package spring.beans.musical;

import spring.beans.Music;

public class ClassicalMusic implements Music {
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Fantasy-impromptu";
    }
}
