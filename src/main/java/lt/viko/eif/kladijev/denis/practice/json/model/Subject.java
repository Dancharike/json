package lt.viko.eif.kladijev.denis.practice.json.model;

public class Subject
{
    private String code;
    private String title;

    public Subject(String code, String title)
    {
        this.code = code;
        this.title = title;
    }

    public Subject() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
