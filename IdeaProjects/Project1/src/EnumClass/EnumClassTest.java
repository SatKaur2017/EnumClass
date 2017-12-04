package EnumClass;

public class EnumClassTest {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        MonthYear monthname = new MonthYear(Month.MARCH);
        monthname.nameOfMonth();
        System.out.println(a+b);
    }
}
