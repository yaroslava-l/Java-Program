package Model;

/**
 * Created by Yaroslava Levchuk on 05.07.2021.
 */
public class Record {

    private String firstName;
    private String secondName;
    private String nickName;

    public Record(String firstName, String secondName, String nickName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.nickName = nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
