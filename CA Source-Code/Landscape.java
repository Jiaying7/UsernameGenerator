/*
*LandscapeApp.java
*22/11/2022
*@Jiaying Yu
*/

public class Landscape {
    //Declare variables
    private String name, day;
    private int time = 0;
    private int etime;

    //constructor
    public Landscape(){
    }

    //compute
    public void compute(){
    }

    //getters and setters
    public void setName(String name){
        this.name = name;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void setEtime(int etime) {
        this.etime = etime;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getName() {
        return name;
    }
    public int getTime() {
        return time;
    }
    public int getEtime() {
        return etime;
    }
    public String getDay() {
        return day;
    }
    public Landscape(String name, int etime, String day){
        this.name = name;
        this.etime = etime;
        this.day = day;
    }
    public void show() {
    }//class
}//main