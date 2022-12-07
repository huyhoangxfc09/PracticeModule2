package StopWatch;

public class StopWatch {
    private long starTime;
    private long endTime;
    public StopWatch(){

    }

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void  star(){
        this.starTime =System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long result = this.endTime-this.starTime;
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.star();
        System.out.println(stopWatch.starTime);
        Thread.sleep(5000);
        stopWatch.end();
        System.out.println(stopWatch.endTime);
        System.out.println(stopWatch.getElapsedTime());
    }
}
