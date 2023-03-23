package Scroll;

import java.util.Arrays;

class ModelScroll {

    private final String[] scroller;
    private final String[] output;

    ModelScroll(String message, int screenWidth) {

        ModelParse modelParse = new ModelParse();

        message = message.trim().replaceAll(" +", " ");
        String[] messageSplit = message.split(" ");

        for (int i = 0; i < messageSplit.length; i++) {
            messageSplit[i] = modelParse.parse(messageSplit[i]);
            messageSplit[i] = messageSplit[i] + " ";
        }

        this.scroller = new String[messageSplit.length + 1];
        System.arraycopy(messageSplit, 0, this.scroller, 0, messageSplit.length);
        this.scroller[scroller.length - 1] = ". . . ";

        this.output = new String[screenWidth];
        for (int i = 0; i < screenWidth; i++) {
            if (i < scroller.length - 1) this.output[i] = scroller[i];
            else this.output[i] = "";
        }

    }

    String[] getOutput() { return output; }

    void update() {

        String wrapValue = "";

        for (int i = 0; i < scroller.length - 1; i++) {
            if (i == 0) wrapValue = scroller[0];
            this.scroller[i] = scroller[i + 1];
        }

        this.scroller[scroller.length - 1] = wrapValue;

        for (int i = 0; i < output.length; i++) {
            if (i == scroller.length - 1) break;
            this.output[i] = scroller[i];
        }

    }

}
