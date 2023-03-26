import java.util.Calendar;

public class StopWatch {
    private double startTime, endTime;

    public StopWatch() {
        Calendar calendar = Calendar.getInstance();
        this.startTime = calendar.getTimeInMillis();
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public void start() {
        Calendar calendar = Calendar.getInstance();
        this.startTime = calendar.getTimeInMillis();
    }

    public void stop() {
        Calendar calendar = Calendar.getInstance();
        this.endTime = calendar.getTimeInMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
