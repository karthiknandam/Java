public class Interfce implements callPhone {
    private int number;
    private boolean IsCalling;
    private boolean isOn = false;
    public Interfce(int number , boolean isOn){
        this.number = number;
        this.isOn = true;
    }

    @Override
    public void powerON() {
        if(isOn) System.out.println("Power is on");
    }

    @Override
    public void calling(int number) {
        if(isOn && this.number == number) {
            System.out.println("Phone is ringing");
            this.IsCalling = true;
        }
        else {
            System.out.println("No power on or switch off may be");
        }
    }

    @Override
    public void answer() {
        if(IsCalling) System.out.println("Pickup the phone -> phone is ringing tick tick tick jingle bell jingle bell jingle on the way pick up the phone already");
    }

    public static void main(String[] args) {
        callPhone c = new Interfce(23456,true);
        c.powerON();
        c.calling(23456);
        c.answer();

    }

}
interface callPhone{
    void powerON();
    void calling(int number);
    void answer();
}


//Power is on
//Phone is ringing
//Pickup the phone -> phone is ringing tick tick tick jingle bell jingle bell jingle on the way pick up the phone already
