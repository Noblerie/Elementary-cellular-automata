package Final;

public class print {

    print() {
        return;
    }

    public void toPrint(String str) {
        char[] split = str.toCharArray();
        for (int i=0; i < split.length; i++) {
            if (split[i] == '0') {
                System.out.print(Character.toString(11035));
            } else {
                System.out.print(Character.toString(11036));
            }
        }
        System.out.println("");
    }
}
