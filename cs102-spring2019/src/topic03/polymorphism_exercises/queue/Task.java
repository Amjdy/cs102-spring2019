package topic03.polymorphism_exercises.queue;


public class Task implements QueuableObject, Comparable<Task> {
    
    private int priority;
    private int id;
    private String name;

    public Task(String name, int priority, int id) {
        this.priority = priority;
        this.id = id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Task o) {
        if (this.priority != o.priority)
            return (this.priority - o.priority);
        else return (this.id - o.id);
    }

    
}
