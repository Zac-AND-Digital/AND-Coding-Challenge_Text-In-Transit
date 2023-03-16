import Display.ControllerDisplay;
import Scroll.ControllerScroll;

@SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
public class Main {

    private static void run(int screenWidth, int speed, String message) throws InterruptedException {

        ControllerScroll controllerScroll = new ControllerScroll(message, screenWidth);
        ControllerDisplay controllerDisplay = new ControllerDisplay();

        long sleepTime = (long) ((1.0d / speed) * 1000d);

        while (true) {

            controllerScroll.update();
            controllerDisplay.draw(controllerScroll.getOutput());

            Thread.sleep(sleepTime);

            controllerDisplay.blank();

        }

    }

    public static void main(String[] args) throws InterruptedException {

        int screenWidth = 8;
        int speed = 2;
        String message = "AND Coding Challenge!";

        switch (args.length) {

            case 1:

                try { screenWidth = Integer.parseInt(args[0]); }
                catch (NumberFormatException ignored) { throw new NumberFormatException("Screen Width must be an integer!"); }

                break;

            case 2:

                try { screenWidth = Integer.parseInt(args[0]); }
                catch (NumberFormatException ignored) { throw new NumberFormatException("Screen Width must be an integer!"); }

                try { speed = Integer.parseInt(args[1]); }
                catch (NumberFormatException ignored) { throw new NumberFormatException("Speed must be an integer!"); }

                break;

            case 3:

                try { screenWidth = Integer.parseInt(args[0]); }
                catch (NumberFormatException ignored) { throw new NumberFormatException("Screen Width must be an integer!"); }

                try { speed = Integer.parseInt(args[1]); }
                catch (NumberFormatException ignored) { throw new NumberFormatException("Speed must be an integer!"); }

                message = args[2];

                break;

        }

        run(screenWidth, speed, message);

    }

}