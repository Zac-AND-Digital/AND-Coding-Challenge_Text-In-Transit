import Display.ControllerDisplay;
import Scroll.ControllerScroll;

@SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
public class Main {

    private static void run(int screenWidth, int speed, String message) throws InterruptedException {

        ControllerScroll controllerScroll = new ControllerScroll(message, screenWidth);
        ControllerDisplay controllerDisplay = new ControllerDisplay();

        long sleepTime = (long) ((1.0d / speed) * 1000d);

        while (true) {

            controllerDisplay.draw(controllerScroll.getOutput());

            Thread.sleep(sleepTime);

            controllerDisplay.blank();

            controllerScroll.update();

        }

    }

    public static void main(String[] args) throws InterruptedException {

        int screenWidth = 8;
        int speed = 1;
        String message = "[B][C:R]AND[/C:R][/B] Coding Challenge [C:B]2023/3[/C:B] - [B][U]Text [C:G]in[/C:G] Transit[/U][/B]";

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