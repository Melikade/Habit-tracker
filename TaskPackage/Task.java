package TaskPackage;

public class Task {
    public double start_time=0;
    public double finish_time=0;
    public String name;
    public Task(String name){
        this.name = name;
    }
    public double getDuration(){
        return(finish_time-start_time);
    }
}
