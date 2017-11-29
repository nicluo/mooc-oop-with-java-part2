public class Calculator {
    Reader reader;
    private int calculations;

    public Calculator() {
        this.reader = new Reader();
        this.calculations = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics();
    }

    private int[] promptValues(int numberOfValues) {
        int[] results = new int[numberOfValues];

        for (int i = 0; i < numberOfValues; i++) {
            String label = "value" + (i + 1) + ": ";
            System.out.print(label);
            results[i] = reader.readInteger();
        }

        return results;
    }

    public void sum() {
        int[] values = promptValues(2);
        System.out.println("sum of the values " + (values[0] + values[1]));
    }

    public void difference() {
        int[] values = promptValues(2);
        System.out.println("difference of the values " + (values[0] - values[1]));
    }

    public void product() {
        int[] values = promptValues(2);
        System.out.println("product of the values " + (values[0] * values[1]));
    }

    public void statistics() {
        System.out.println("Calculations done " + calculations);
    }
}
