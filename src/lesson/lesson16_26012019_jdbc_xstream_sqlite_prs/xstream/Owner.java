package lesson.lesson16_26012019_jdbc_xstream_sqlite_prs.xstream;

public class Owner {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public Owner() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
