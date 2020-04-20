public class fase4 {
    public static String fullname(String name_in, String surname1_in, String surname2_in) {
        return name_in + " " + surname1_in + " " + surname2_in;
    }

    public static String birthdate(int day_in, int month_in, int year_in) {
        return day_in + "/" + month_in + "/" + year_in;
    }

    public static int initial_leap_year = 1948;
    public static float leap_year_period = 4;

    public static void main(String[] args) {
        String name = "Pepito";
        String surname1 = "Perez";
        String surname2 = "Gonzalez";
        int day = 27;
        int month = 12;
        int year = 1989;

        String name_together = fullname(name, surname1, surname2);
        System.out.println("My full name is " + name_together);

        String date_together = birthdate(day, month, year);
        System.out.println("My birth date is " + date_together);

        boolean mybirth_itis = (year - initial_leap_year) % leap_year_period == 0;
        if (mybirth_itis) {
            System.out.println("My birth year is a leap year");
        } else {
            System.out.println("My birth year is NOT a leap year");

        }
    }
}