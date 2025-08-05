package Emums;

public enum Day {

    Sunday(false), 
    Monday(true), 
    Tuesday(true), 
    Wednesday(true), 
    Thursday(true), 
    Friday(true), 
    Saturday(false);

    private final boolean weekDay;

    private Day(boolean weekDay) {
        this.weekDay = weekDay;
    }

    public String isWeekDay() {
        return weekDay ? "WeekDay" :"WeekEnd";
    }

    

    

}