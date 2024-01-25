// Spring_2021_A_Q12
public class Task {
    private String title;
    private int minutes;
    private int priority;
    private boolean isComplete;


    public Task(String title, int minutes, int priority, boolean isComplete) {
        this.title = title;
        this.minutes = minutes;
        this.priority = priority;
        this.isComplete = isComplete;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }


    public class TaskManager {
        private Task[] tasks;
        private int numOfTasks;

        public TaskManager(Task[] tasks, int numOfTasks) {
            this.tasks = tasks;
            this.numOfTasks = numOfTasks;
        }

        public Task[] getTasks() {
            return tasks;
        }

        public void setTasks(Task[] tasks) {
            this.tasks = tasks;
        }

        public int getNumOfTasks() {
            return numOfTasks;
        }

        public void setNumOfTasks(int numOfTasks) {
            this.numOfTasks = numOfTasks;
        }
    }

    //A
    public int doIt(int num) {
        if (this.minutes < num) {
            this.minutes = 0;
            this.isComplete = true;
            return num - this.minutes;
        } else return 0;
    }
}
    //B
   /*public boolean addTask(Task t) {
        boolean flag = false;
        if (this.numOfTasks() < this.tasks.length) {
            Tasks[this.numOfTasks++] = t;
            flag = true;
        } else {
            for (int i = 0; i < this.tasks.length && this.tasks[i].getIsComplete(); i++) {
                if (i < this.tasks.length) {
                    this.tasks[i] = t;
                    flag = true;
                }
            }
            return flag;
        }
        //C
        public int importantTask () {
            int index = -1;
            for (int i = 0; i < this.tasks.length; i++) {
                if (!this.tasks[i].getIsComplete()) {
                    if (index == -1)
                        index = i;
                    else if (this.tasks[index].getPririty() < this.tasks[i].getPririty())
                        index = i;
                }
            }
            return index;
        }

        //D
        public void work ( int num){
            int index;
            while (num > 0) {
                index = importantTask();
                if (index != -1) {
                    num = this.tasks[index].doIt(num);
                    else
                    num = 0;
                }
            }

        }
    }
    */









