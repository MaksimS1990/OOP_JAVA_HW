package HW4;

import java.util.Calendar;

public abstract class VeryUrgentTasks {

    public int ID;
    public String NameOfTheTask;
    public Calendar TimeOfAddition;
    public Calendar Deadline;
    public String NameAuthor;


    public void VeryUrgentTask(int ID, String NameOfTheTask, Calendar TimeOfAddition, Calendar Deadline, String NameAuthor) {
        this.ID = ID;
        this.NameOfTheTask = NameOfTheTask;
        this.TimeOfAddition = TimeOfAddition;
        this.Deadline = Deadline;
        this.NameAuthor = NameAuthor;
    }

    public String getNameOfTheTask() {
        return NameOfTheTask;
    }

    public String setNameOfTheTask(String NameOfTheTask) {
        return this.NameOfTheTask = NameOfTheTask;
    }

    public Calendar getDeadline() {
        return Deadline;
    }

    public Calendar setDeadline(Calendar Deadline) {
        return this.Deadline = Deadline;
    }

    public String getNameAuthor() {
        return NameAuthor;
    }

    public String setNameAuthor(String NameAuthor) {
        return this.NameAuthor = NameAuthor;
    }

    public int getID() {
        return ID;
    }

    public int setID(int ID) {
        return this.ID = ID;
    }

    public Calendar getTimeOfAddition() {
        return TimeOfAddition;
    }

    public Calendar setTimeOfAddition(Calendar TimeOfAddition) {
        return this.TimeOfAddition = TimeOfAddition;
    }

    public String toString(){
        return String.format("%s ", getNameOfTheTask(), getDeadline(), getNameAuthor(), getID(), getTimeOfAddition());
    }

}
