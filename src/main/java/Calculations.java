import java.time.LocalTime;

public class Calculations {

    static LocalTime startTimes[] = {LocalTime.parse("10:00:00"), LocalTime.parse("11:00:00"), LocalTime.parse("15:00:00"), LocalTime.parse("15:30:00"), LocalTime.parse("16:50:00")};
    static int[] durations = {60, 30, 10, 10, 40};
    static LocalTime beginWorkingTime = LocalTime.parse("08:00");
    static LocalTime endWorkingTime = LocalTime.parse("18:00");
    static int consultationTime = 30;

    public static String availablePeriods(LocalTime[] startTimes, int[] durations, LocalTime beginWorkingTime, LocalTime endWorkingTime, int consultationTime) {
        String s = "";


        while (beginWorkingTime.isBefore(endWorkingTime)) {
            s = s + beginWorkingTime;
            beginWorkingTime = beginWorkingTime.plusMinutes(consultationTime);


            if ((beginWorkingTime.plusMinutes(consultationTime)).isAfter(endWorkingTime)) {
                s = s + "-" + endWorkingTime;
                break;
            } else {
                s = s + "-" + beginWorkingTime + "\n";
            }


            for (int i = 0; i < startTimes.length; i++) {

                if (beginWorkingTime.isBefore(startTimes[i]) && (beginWorkingTime.plusMinutes(consultationTime)).isAfter(startTimes[i])) {
                    beginWorkingTime = startTimes[i];
                    beginWorkingTime = beginWorkingTime.plusMinutes(durations[i]);
                }

                if (beginWorkingTime == startTimes[i]) {
                    beginWorkingTime = beginWorkingTime.plusMinutes(durations[i]);
                    beginWorkingTime = beginWorkingTime.plusMinutes(consultationTime);
                }
            }

        }

        return s;
    }

    public static void main(String... args) {
        System.out.println(availablePeriods(startTimes, durations, beginWorkingTime, endWorkingTime, consultationTime));
    }
}
