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
    public void isData(){
        String s = "08:00-08:30\n" +
                "08:30-09:00\n" +
                "09:00-09:30\n" +
                "09:30-10:00\n" +
                "11:30-12:00\n" +
                "12:00-12:30\n" +
                "12:30-13:00\n" +
                "13:00-13:30\n" +
                "13:30-14:00\n" +
                "14:00-14:30\n" +
                "14:30-15:00\n" +
                "15:40-16:10\n" +
                "16:10-16:40\n" +
                "17:30-18:00";
        Assertions.assertTrue(Calculations.availablePeriods(STARTTIMES,DURATIONS,BEGINWOORKINGTIME,ENDWORKINGTIME,consultationTime).equals(s));
    }

    @Test
    public void notNull(){
        Assertions.assertNotNull(Calculations.availablePeriods(STARTTIMES,DURATIONS,BEGINWOORKINGTIME,ENDWORKINGTIME,consultationTime));
    }

}
