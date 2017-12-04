package EnumClass;

public class MonthYear {
    Month month;

    public MonthYear(Month month)
    {
        this.month = month;
    }
    public void nameOfMonth()
    {
        switch (month) {
            case JANUARY:
                System.out.println("January is the coldest month");
                break;
            case FEBRUARY:
                System.out.println("February is the spring month");
                break;
            case MARCH:
                System.out.println("March is the coldest month");
                break;
            case APRIL:
                System.out.println("January is the My religious month");
                break;
            case MAY:
                System.out.println("May is the coldest month");
                break;
            case JUNE:
                System.out.println("Dad b'day month");
                break;
            case JULY:
                System.out.println("Anniversay is month");
                break;
            case AUGUST:
                System.out.println("January is the coldest month");
                break;
            case SEPTEMBER:
                System.out.println("January is the coldest month");
                break;
            case OCTOBER:
                System.out.println("January is the coldest month");
                break;
            case NOVEMBER:
                System.out.println("January is the coldest month");
                break;
            case DECEMBER:
                System.out.println("January is the coldest month");
                break;
            default:
                System.out.println("Invalid");
                break;


        }

    }
}



