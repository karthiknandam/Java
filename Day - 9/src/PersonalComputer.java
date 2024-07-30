public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Moniter moniter;
    private MotherBoard motherBoard;

    public PersonalComputer(String model , String manufacture , ComputerCase computerCase ,
                            Moniter moniter , MotherBoard motherBoard)
    {
        super(model, manufacture);
        this.computerCase = computerCase;
        this.moniter = moniter;
        this.motherBoard = motherBoard;

    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Moniter getMoniter() {
        return moniter;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    private void logo(){
        moniter.drawPixel(120,60,"RedBlack");
    }

    public void turnOn(String programName){
        computerCase.pressPowerButton();
        logo();
        motherBoard.loadProgram(programName);
    }
}
