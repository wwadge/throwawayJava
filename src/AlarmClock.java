/**
 * Created by wwadge on 01/01/15.
 *
 * DRY = Don't Repeat Yourself
 *
 *  AlarmClock is a subclass of Clock
 *  AlarmClock extends Clock
 *  Clock is a superclass of AlarmClock
 *  Clock is a parent of AlarmClock
 *  AlarmClock is a child of Clock
 *  AlarmClock inherits from Clock
 */
public class AlarmClock extends Clock{

    private int alarmHours;
    private int alarmMins;

    public int getAlarmMins() {
        return alarmMins;
    }

    public void setAlarmMins(int alarmMins) {
        this.alarmMins = alarmMins;
    }



    public int getAlarmHours() {
        return alarmHours;
    }

    public void setAlarmHours(int alarmHours) {
        this.alarmHours = alarmHours;
    }

}
