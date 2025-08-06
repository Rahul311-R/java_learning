import java.util.Scanner;

class year_month {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int year=n/365;
        int month=(n%365)/30;
        int days=(n%365)%30;
        System.out.println("year:"+year);
        System.out.println("month:"+month);
        System.out.println("days:"+days);

    }

}
