package Radio;




public class App {
    public static void main(String[] args) {

        Radio radio1 = new Radio();
        System.out.println(radio1);
        radio1.on();
        for (int i = 0; i < 15; i++) {
            radio1.volumeUP();
            System.out.println(radio1);

        }
        radio1.off();
    }
}
