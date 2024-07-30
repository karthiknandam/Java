public class pojo1 {
    private String id;
    private String name;
    private String dob;
    private String sec;

    public String getId() {
        return id;
    }
    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public pojo1(String id, String name, String dob, String sec) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "pojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", sec='" + sec + '\'' +
                '}';
    }
}
