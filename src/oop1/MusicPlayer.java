package oop1;

public class MusicPlayer {
// 음악 플레이어를 만드는 개발자와, 사용하는 개발자가 나뉘어져 있다고 생각하자.

    int volume = 0;
    boolean isOn = false;

    void on (){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("volume++ 현재 볼륨 : " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("volume-- 현재 볼륨 : " + volume);
    }
}
