package org.fenci.greeting.time;

import java.util.HashMap;
import java.util.Random;

public class Time {

    private static TimeOfDay timeOfDay;

    public static HashMap<String, TimeOfDay> generateTime() {
        HashMap<String, TimeOfDay> todMap = new HashMap<>();
        Random random = new Random();
        String randomHour = String.valueOf(5 + random.nextInt(24 - 5 + 1)); //generates a random number between 5 and 24
        String randomMin = String.valueOf(random.nextInt(61)); //generates a random number between 0 and 60

        if (randomMin.length() == 1) randomMin = "0" + randomMin;

        TimeOfDay timeOfDay = getTimeofDay(randomHour, randomMin);

        String finalTime = randomHour + ":" + randomMin;
        todMap.put(finalTime, timeOfDay);

        return todMap;
    }

    private static TimeOfDay getTimeofDay(String hour, String mins) {
        int totalMins = (Integer.parseInt(hour) * 60) + Integer.parseInt(mins);

        if (totalMins >= 300 && totalMins < 720) {
            timeOfDay = TimeOfDay.Morning;
        } else if (totalMins >= 720 && totalMins < 1020) {
            timeOfDay = TimeOfDay.Afternoon;
        } else if (totalMins >= 1020 && totalMins < 1440) {
            timeOfDay = TimeOfDay.Evening;
        }
        return timeOfDay;
    }
}
