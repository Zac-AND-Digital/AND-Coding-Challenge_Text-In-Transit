package Display;

public class ControllerDisplay {

    private final ModelDisplay modelDisplay;

    public ControllerDisplay() {

        this.modelDisplay = new ModelDisplay();

    }

    public void blank() { this.modelDisplay.blank(); }

    public void draw(String[] output) { this.modelDisplay.draw(output); }

}
