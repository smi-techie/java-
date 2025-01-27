public class WeekdayCalculator {
    public static void main(String[] args) {
        int dayNumber = 15; // Replace 15 with the desired day number

        String weekday;

        switch (dayNumber % 7) {
            case 0:
                weekday = "Sunday";
                break;
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid day number";
        }

        System.out.println("Weekday: " + weekday);
    }
}