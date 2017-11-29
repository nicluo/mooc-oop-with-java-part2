public class Smileys {
    public static void main(String[] args) {
        Smileys.printWithSmileys("Method");
        Smileys.printWithSmileys("Beerbottle");
        Smileys.printWithSmileys("Interface");
    }

    public static void printSeparatorSmileys(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(":)");
        }
        System.out.println(stringBuilder);
    }

    public static void printWithSmileys(String s) {
        /**
         * If the length of the character string is an odd number, add an extra space on the right side of the given
         * character string.
         */
        if (s.length() % 2 == 1) {
            s += " ";
        }

        /**
         * Calculate how many smileys should be printed for a character string of a certain length
         */
        int separatorLength = s.length() / 2 + 3;

        printSeparatorSmileys(separatorLength);

        System.out.print(":) ");
        System.out.print(s);
        System.out.print(" :)");
        System.out.println();

        printSeparatorSmileys(separatorLength);
    }
}
