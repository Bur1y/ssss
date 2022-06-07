import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class Testing {
    // Константы
    static final LocalTime STARTTIMES[] = {LocalTime.parse("10:00:00"), LocalTime.parse("11:00:00"), LocalTime.parse("15:00:00"), LocalTime.parse("15:30:00"), LocalTime.parse("16:50:00")};
    static final int[] DURATIONS = {60, 30, 10, 10, 40};
    static final LocalTime BEGINWOORKINGTIME = LocalTime.parse("08:00");
    static final LocalTime  ENDWORKINGTIME = LocalTime.parse("18:00");
    static final int consultationTime = 30;


    @Test
    public static void isString(){
        String s = null;
        Assertions.assertSame(Calculations.availablePeriods(STARTTIMES,DURATIONS,BEGINWOORKINGTIME,ENDWORKINGTIME,consultationTime), s);
    }

    @Test
    public static void notNull(){
        Assertions.assertNotNull(Calculations.availablePeriods(STARTTIMES,DURATIONS,BEGINWOORKINGTIME,ENDWORKINGTIME,consultationTime));
    }

}
