public interface Alarm {
    default String turnAlarmOn() {
        return "Turned alarm on";
    }

    default String turnAlarmOff() {
        return "Turned the alarm off";
    }
}
