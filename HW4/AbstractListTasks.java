package HW4;

import java.time.LocalDate;

public abstract class AbstractListTasks {


        public int ID;
        public String NameOfTheTask;
        public LocalDate TimeOfAddition;
        public LocalDate Deadline;
        public String NameAuthor;
        public int DegreeOfImportance;
       
        public AbstractListTasks(int ID, String NameOfTheTask, int t, int r, int c, int DegreeOfImportance, int y, int m, int d, String NameAuthor) {
            this.ID = ID;
            this.NameOfTheTask = NameOfTheTask;
            this.TimeOfAddition = LocalDate.of(y, m, d);
            this.DegreeOfImportance = DegreeOfImportance;
            this.Deadline = LocalDate.of(y, m, d);
            this.NameAuthor = NameAuthor;
        }
    
        public String getNameOfTheTask() {
            return NameOfTheTask;
        }
    
        public String setNameOfTheTask(String NameOfTheTask) {
            return this.NameOfTheTask = NameOfTheTask;
        }
    
        public LocalDate getDeadline() {
            return Deadline;
        }

        public String getDeadlineToString() {
            return this.Deadline.toString();
        }
    
        public LocalDate setDeadline(LocalDate Deadline) {
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
    
        public LocalDate getTimeOfAddition() {
            return TimeOfAddition;
        }
    
        public LocalDate setTimeOfAddition(LocalDate TimeOfAddition) {
            return this.TimeOfAddition = TimeOfAddition;
        }

        public String getTimeOfAdditionToString(String TimeOfAddition) {
            return this.TimeOfAddition.toString();
        }

        public int getDegreeOfImportance() {
            return DegreeOfImportance;
        }
    
        public int setDegreeOfImportance(int DegreeOfImportance) {
            return this.DegreeOfImportance = DegreeOfImportance;
        }
    
         public String toString(){
             return String.format("ID: %d  Название задачи: %s  Дата создания: %s  Степень важности:  %d  Дэдлайн: %s  Создал: %s   " ,
            getID(), getNameOfTheTask(),getTimeOfAddition(), getDegreeOfImportance(), getDeadlineToString(), getNameAuthor());
        }
       
}