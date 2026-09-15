package OOP;

class Time {
    int hours;
    int minutes;
    int seconds;

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 24) {
            this.hours = hours;
        }
        System.out.println("Invalid minutes. Must be between 0 and 24.");
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 60) {
            this.minutes = minutes;
        }
        System.out.println("Invalid minutes. Must be between 0 and 60.");
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 60) {
            this.seconds = seconds;
        }
        System.out.println("Invalid minutes. Must be between 0 and 60.");
    }

    public void displayTime() {
        System.out.println("Time: " + this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}

public class TimeValidation {
    public static void main(String[] args) {
        Time t = new Time(); 
        t.setHours(23); 
        t.setMinutes(75); 
        t.setSeconds(30);
        t.displayTime();
    }
}
