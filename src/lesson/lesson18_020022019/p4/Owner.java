package lesson.lesson18_020022019.p4;

import java.io.Serializable;

public class Owner implements Serializable {

    private String ownername;


    public Owner(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownername='" + ownername + '\'' +
                '}';
    }
}
