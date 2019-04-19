package lesson.annotation;

@XTable(name = "students")
public class Students {

    @XField (type = "integer")
    int id;

    @XField (type = "text")
    String name;

    @XField (type = "integer")
    int score;

    public Students(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
