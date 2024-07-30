public class POGO1 {
    private String id;
    private String name;
    private String dob;
    private String sec;

    public POGO1(String id, String name, String dob, String sec) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "POGO1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", sec='" + sec + '\'' +
                '}';
    }

}
