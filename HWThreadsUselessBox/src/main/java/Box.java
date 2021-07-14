public class Box implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.tumbler = "OFF";
        System.out.println("Box: tumbler " + Main.tumbler);
    }
}
