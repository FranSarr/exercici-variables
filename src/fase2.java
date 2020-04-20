public class fase2 {
    public static int initial_leap_year = 1948;
    public static void main(String[] args) {
        float leap_year_period = 4;
        int mybirth_year = 1966;
        float result = (mybirth_year - initial_leap_year) / leap_year_period;
        System.out.println( "leap years since " + initial_leap_year + " to "+ mybirth_year + ": " + (int) result + " years");
    }

}
