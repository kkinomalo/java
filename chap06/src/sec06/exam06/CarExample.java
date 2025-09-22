package sec06.exam06;

public class CarExample {
    // 필드
    private int speed;
    private boolean stop;

    // getter
    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    // setter
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0; // 잘못된 값이면 0으로 처리
        } else {
            this.speed = speed;
        }
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0; // 멈추면 속도도 0
    }
}
