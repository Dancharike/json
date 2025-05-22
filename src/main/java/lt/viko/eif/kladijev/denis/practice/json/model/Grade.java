package lt.viko.eif.kladijev.denis.practice.json.model;

public class Grade
{
    private String subjectCode;
    private double score;

    public Grade(String subjectCode, double score)
    {
        this.subjectCode = subjectCode;
        this.score = score;
    }

    public Grade() {}

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subjectCode='" + subjectCode + '\'' +
                ", score=" + score +
                '}';
    }
}
