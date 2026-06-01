enum Days{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    Thrusday,
    FRIDAY,
    SATURDAY
}

class BasicEnum{
    public static void main(String[] args) {
        Days Today=Days.SUNDAY;

        System.out.println(Today);

        System.out.println("++++++++++++++++++++++++++++");

        for(Days day:Days.values()){
            System.out.println(day);
        }
    }
}