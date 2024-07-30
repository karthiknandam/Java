public class YourDet {
    private String name ;
    private int age ;
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }

    private String eligible = "Not Eligible to vote";

    public void setAge(int age){
        this.age = age;
        if(age>=18) this.eligible = "You are Eligible to vote";
    }


    public void getInputs(){
        System.out.println("Hi "+name+" Your age is "+age + " and you are " + eligible);
    }
}
