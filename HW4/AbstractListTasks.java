package HW4;

//import java.util.*;

 public abstract class AbstractListTasks {

        public int ID;
        public String NameOfTheTask;
        public int TimeOfAddition;
        public int Deadline;
        public String NameAuthor;
       
        public AbstractListTasks(int ID, String NameOfTheTask, int TimeOfAddition, int Deadline, String NameAuthor) {
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
    
        public int getDeadline() {
            return Deadline;
        }
    
        public int setDeadline(int Deadline) {
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
    
        public int getTimeOfAddition() {
            return TimeOfAddition;
        }
    
        public int setTimeOfAddition(int TimeOfAddition) {
            return this.TimeOfAddition = TimeOfAddition;
        }
    
         public String toString(){
             return String.format("ID: %d      Название задачи: %s      Дата создания: %d      Дэдлайн: %d      Создал: %s      " , getID(),
            getNameOfTheTask(),getTimeOfAddition(), getDeadline(), getNameAuthor());
        }
       
}