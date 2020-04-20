public class fase3 {
    public static int initial_leap_year = 1948;
    public static void main(String[] args) {
        int mybirth_year = 1966;
        float leap_year_period = 4;
        float result = (mybirth_year - initial_leap_year) / leap_year_period;
        boolean mybirth_itis = (mybirth_year - initial_leap_year) % leap_year_period == 0;
        for (int i = 0; i <= result ; i++) {
            System.out.println(initial_leap_year + i * (int) leap_year_period);
        }
        if (mybirth_itis) {
            System.out.println("My birth year is a leap year");
        }
    }
}
