public class PresidentialOrder {
    private final EGrade grade;
    private final String order;
    private String conclusion = "";

    public PresidentialOrder(EGrade grade, String order) {
        this.grade = grade;
        this.order = order;
    }

    public EGrade getGrade() {
        return grade;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
