public enum Days {
    DUISHOMBU(" java lesson"),
    SHEISHEMBI(" practise lesson"),
    SHARSHEMBI(" english and java lessons"),
    BEISHEMBI(" practice and soft skills lessons"),
    JUMA(" java lesson"),
    ISHEMBI("free"),
    JEKSEMBI("free");

    private String plan;

    Days(String plan) {
        this.plan = plan;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Days{" +
                "plan='" + plan + '\'' +
                '}';
    }
}
