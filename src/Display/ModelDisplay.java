package Display;

class ModelDisplay {

    void blank() { System.out.print('\r'); }

    void draw(String[] output) {

        System.out.print(" [ ");

        for (String item : output) {
            if (item.equals("")) System.out.print(" ");
            else System.out.print(item);
        }

        System.out.print("] ");

    }

}
