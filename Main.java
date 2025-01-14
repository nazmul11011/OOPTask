public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
    }
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };

        System.out.println(day+" stands for "+dayOfWeek);
    }
}