package settersAndGetters;

public class Clock {
    String time;

    void setTime(String t){
        time = t;
    }

    public String getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {

        Clock c = new Clock();

        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("время: " + tod);
    }
}
