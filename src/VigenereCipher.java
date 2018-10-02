import java.util.Scanner;

class VigenereCipher {

    private String message;
    private String key;
    private String encodedMessage;
    private Scanner userInput = new Scanner(System.in);

    void run() {
        message = "";
        key = "";
        encodedMessage = "";

        askForMessage();
        askForKey();
        calculateEncodedMessage();
        printEncodedMessage();
        run();
    }

    private void askForMessage() {
        System.out.println("Enter message:");
        message = userInput.next();
    }

    private void askForKey() {
        System.out.println("Enter key:");
        key = userInput.next();
    }

        private void calculateEncodedMessage() {
        StringBuilder sb = new StringBuilder();
        int lengthOfMessage = message.length();
        int keyIndex = 0;

        for (int i = 0; i < lengthOfMessage; i++, keyIndex++) {
            if (keyIndex >= key.length()) {
                keyIndex = 0;
            }
            sb.append((char) (message.charAt(i) + (key.charAt(keyIndex) - 97)));
        }
        encodedMessage = sb.toString();
    }

    private void printEncodedMessage() {
        System.out.println("Encoded message: " + encodedMessage);
    }
}
