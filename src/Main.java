public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            return;
        }

        String userInput = args[0];

        // Vulnerable code:
        // User-controlled input is passed directly to a system command.
        Runtime.getRuntime().exec(userInput);
    }
}
