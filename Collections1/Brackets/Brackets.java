public class Brackets {
    private int counter = 0;

    public Brackets() {
    }

    public boolean isCorrect(String input) {
        for (Character ch : input.toCharArray()) {
            if (ch == '(') {
                counter++;
            } else if (ch == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }
}
