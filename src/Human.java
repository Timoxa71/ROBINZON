import java.util.Objects;

public abstract class Human {
    protected String name;
    protected Religion religion;

    public Human(String name, Religion religion) {
        this.name = name;
        this.religion = religion;
    }

    public abstract void performRole();

    @Override
    public String toString() {
        return "Name: " + name + ", Religion: " + religion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return Objects.equals(name, human.name) && religion == human.religion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, religion);
    }
}
