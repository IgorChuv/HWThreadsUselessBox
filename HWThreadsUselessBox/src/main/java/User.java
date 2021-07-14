public class User implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.tumbler = "ON";
        System.out.println("User: tumbler " + Main.tumbler);
    }
}
