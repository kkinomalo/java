package sec01.exam05;

public interface RemoteControl {
    // 상수 (public static final 생략돼 있음)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 (public abstract 생략돼 있음)
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
