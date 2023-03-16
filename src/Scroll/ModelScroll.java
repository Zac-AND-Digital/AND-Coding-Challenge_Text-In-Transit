package Scroll;

class ModelScroll {

    private final String[] scroller;
    private final String[] output;

    ModelScroll(String message, int screenWidth) {

        message = message.trim().replaceAll(" +", " ");

        this.scroller = new String[screenWidth + message.length() + 1];
        for (int i = 0; i < screenWidth; i++) this.scroller[i] = "";
        System.arraycopy(message.split(""), 0, scroller, screenWidth, message.length());

        this.output = new String[screenWidth];
        for (int i = 0; i < output.length; i++) this.output[i] = "";

    }

    String[] getOutput() { return output; }

    void update() {

        for (int i = 0; i < scroller.length - 1; i++) {
            this.scroller[i] = this.scroller[i + 1];
            this.scroller[scroller.length - 1] = scroller[0];
        }

        System.arraycopy(this.scroller, 0, this.output, 0, output.length);

    }

}
