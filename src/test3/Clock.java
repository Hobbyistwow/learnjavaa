package test3;

public class Clock {
    private int seconds;
    private int minutes;
    private int hours;

    public Clock(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public void run(){
        seconds += 1;
        if (seconds ==  60) {
            minutes += 1;
            seconds = 0;
            if (minutes == 60) {
                hours += 1;
                minutes = 0;
                if(hours == 24){
                    hours = 0;
                }
            }
        }

    }
    public void showTime() {
        System.out.println("Time: " + hours + minutes + seconds);
    }


}
