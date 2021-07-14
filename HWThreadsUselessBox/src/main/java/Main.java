public class Main {

    public static volatile String tumbler = "OFF";
    public static int count = 1;

    public static void main(String[] args) throws InterruptedException {

        User user = new User();
        Box box = new Box();

        while(count < 5) {

            Thread userThread = new Thread(user);
            Thread boxThread = new Thread(box);

            userThread.start();
            userThread.join();
            count++;

            if (tumbler.equals("ON")) {
                boxThread.start();
                boxThread.join();
            } else {
                boxThread.interrupt();
            }
        }
    }
}
