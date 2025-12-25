package Set;

import java.util.EnumSet;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Days> days = EnumSet.noneOf(Days.class);
        days.add(Days.MONDAY);
        days.add(Days.WEDNESDAY);
        System.out.println(days);
    }
}


