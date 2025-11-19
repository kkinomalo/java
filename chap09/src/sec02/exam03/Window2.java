package sec02.exam03;

public class Window2 {
    Button button1 = new Button();
    Button button2 = new Button();
    // 필드 초기값으로 대입
    Button.OnClickListener listener = () -> {
        System.out.println("전화를 겁니다.");
    };

    Window2() {
        button1.setOnClickListener(listener);
        // 매개값으로 람다식 대입
        button2.setOnClickListener(() -> System.out.println("메시지를 보냅니다."));
    }
}
