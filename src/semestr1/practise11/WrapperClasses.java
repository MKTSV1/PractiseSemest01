package semestr1.practise11;

import java.util.ArrayList;

public class WrapperClasses {
    public static void demonstrateWrapperTwins(){
        byte byteg = 10;
        short shorteg = 15;
        int integ = 20;
        long longg = 25;
        float floatg = 25.5f;
        double doubleg = 26.0;
        char charonchik = 'c';
        String stringg = " gg";
        Byte gbyte = Byte.valueOf(byteg);
        Short gshort = Short.valueOf(shorteg);
        Integer gint = Integer.valueOf(integ);
        Long glong = Long.valueOf(longg);
        Float gfloat = Float.valueOf(floatg);
        Double gdouble = Double.valueOf(doubleg);
        Character gcharonchik = Character.valueOf(charonchik);
        String gstring = String.valueOf(stringg);
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(gbyte.getClass().getSimpleName() + gbyte.byteValue());
        System.out.println(gshort.getClass().getSimpleName() + gshort.shortValue());
        System.out.println(gint.getClass().getSimpleName() + gint.intValue());
        System.out.println(glong.getClass().getSimpleName() + glong.longValue());
        System.out.println(gfloat.getClass().getSimpleName() + gfloat.floatValue());
        System.out.println(gdouble.getClass().getSimpleName() + gdouble.doubleValue());
        System.out.println(gcharonchik.getClass().getSimpleName() + gcharonchik.charValue());
        System.out.println(gstring.getClass().getSimpleName() + gstring.toString());
    }
}
