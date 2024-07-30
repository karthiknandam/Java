public class Worker {
    private String name;
    private String birthDay;
    private String endDate;
    public Worker(String name , String birthDay ){
        this.name = name ;
        this.birthDay = birthDay;

    }
    public int getAge(){
        return 2024 - Integer.parseInt(birthDay.substring(6));
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }
    public double collectPay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Worker [" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ']';
    }
}
