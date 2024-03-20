package ooday05;

import javax.sound.midi.Soundbank;

public class StaticVar {
    int a;
    static int b;
    StaticVar(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a+"b="+b);
    }
}
