public class Enums {
    public enum Day {
        MONDAY("Holla!"), TUESDAY("Aloha!"), WEDNESDAY("Hi!"), THURSDAY("Hello!"), FRIDAY("Yo!"), SATURDAY("What's up?"), SUNDAY(
                "Greetings!");
        private final String greeting;

        private Day(String greeting) {
            this.greeting = greeting;
        }
    }
    public String greetMe(Day day) {
        return day.greeting;
    }
}
