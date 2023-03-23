package Scroll;

class ModelParse {

    private static final String ANSI_PRE = '\033' + "[";
    private static final String ANSI_END = "m";
    private static final String ANSI_POST = '\033' + "[0m";

    private static final String BOLD = "1";
    private static final String UNDERLINE = "4";

    private static final String RED = "31";
    private static final String GREEN = "32";
    private static final String BLUE = "34";

    private boolean markBold = false;
    private boolean markUnderline = false;

    private boolean markRed = false;
    private boolean markGreen = false;
    private boolean markBlue = false;

    String parse(String word) {

        if (word.contains("[B]") && ! word.contains("[/B]")) {
            word += "[/B]";
            this.markBold = true;
        }

        if (word.contains("[/B]") && ! word.contains("[B]")) {
            word = "[B]" + word;
            this.markBold = false;
        }

        if (word.contains("[U]") && ! word.contains("[/U]")) {
            word += "[/U]";
            this.markUnderline = true;
        }

        if (word.contains("[/U]") && ! word.contains("[U]")) {
            word = "[U]" + word;
            this.markUnderline = false;
        }

        if (word.contains("[C:R]") && ! word.contains("[/C:R]")) {
            word += "[/C:R]";
            this.markRed = true;
        }

        if (word.contains("[/C:R]") && ! word.contains("[C:R]")) {
            word = "[C:R]" + word;
            this.markRed = false;
        }

        if (word.contains("[C:G]") && ! word.contains("[/C:G]")) {
            word += "[/C:G]";
            this.markGreen = true;
        }

        if (word.contains("[/C:G]") && ! word.contains("[C:G]")) {
            word = "[C:G]" + word;
            this.markGreen = false;
        }

        if (word.contains("[C:B]") && ! word.contains("[/C:B]")) {
            word += "[/C:B]";
            this.markBlue = true;
        }

        if (word.contains("[/C:B]") && ! word.contains("[C:B]")) {
            word = "[C:B]" + word;
            this.markBlue = false;
        }

        if (markUnderline) word = "[U]" + word + "[/U]";
        if (markBold) word = "[B]" + word + "[/B]";

        if (markRed) word = "[C:R]" + word + "[/C:R]";
        if (markGreen) word = "[C:G]" + word + "[/C:G]";
        if (markBlue) word = "[C:B]" + word + "[/C:B]";

        word = word.replace("[B]", ANSI_PRE + BOLD + ANSI_END);
        word = word.replace("[/B]", ANSI_POST);
        word = word.replace("[U]", ANSI_PRE + UNDERLINE + ANSI_END);
        word = word.replace("[/U]", ANSI_POST);

        word = word.replace("[C:R]", ANSI_PRE + RED + ANSI_END);
        word = word.replace("[/C:R]", ANSI_POST);
        word = word.replace("[C:G]", ANSI_PRE + GREEN + ANSI_END);
        word = word.replace("[/C:G]", ANSI_POST);
        word = word.replace("[C:B]", ANSI_PRE + BLUE + ANSI_END);
        word = word.replace("[/C:B]", ANSI_POST);

        return word;

    }

}
