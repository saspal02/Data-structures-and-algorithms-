package Enums;

public class Basic  {

    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        @Override
        public void hello() {
            System.out.println("It'");

        }
    }



    public static void main(String[] args) {
        Week week;
        week = Week.Thursday;
        week.hello();
//        System.out.println(week);

//        Week[] values = Week.values();
//        for (int i = 0; i < values.length; i++) {
//            Week day = values[i];
//            System.out.println(day);
//        }

        System.out.println(week.ordinal());

    }
}
