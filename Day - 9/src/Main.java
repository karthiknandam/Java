public class Main {
    public static void main(String[] args) {
        ComputerCase thCase = new ComputerCase("2208","dell","230W");
        Moniter moniter = new Moniter("Xps","ASUS","1245 X 350",50);
        MotherBoard motherBoard = new MotherBoard("2345","ROG","54",4,2);

        PersonalComputer pc = new PersonalComputer("2208","dell",thCase,moniter,motherBoard);

//        pc.getComputerCase().pressPowerButton();
//        pc.getMoniter().drawPixel(2,4,"black");
//        pc.getMotherBoard().loadProgram("Windows");
// VS single line of code ;; V ;;
        pc.turnOn("Windows");
    }
}
//power button Pressed
//Draw log of 120 , 60 and of color = RedBlack
//Windows Program is loading....