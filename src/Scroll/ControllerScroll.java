package Scroll;

public class ControllerScroll {

    private final ModelScroll modelScroll;

    public ControllerScroll(String message, int screenWidth) {

        this.modelScroll = new ModelScroll(message, screenWidth);

    }

    public String[] getOutput() { return modelScroll.getOutput(); }

    public void update() { this.modelScroll.update(); }

}
