public class EncapsulationChallenge {

    private  int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public EncapsulationChallenge(int tonerLevel , boolean duplex){
        this.pagesPrinted = 0;
        this.duplex = duplex;
        if(tonerLevel <=0 || tonerLevel >100) this.tonerLevel = 1;
        else this.tonerLevel = tonerLevel;

    }
    public int addToner(int tonerAmount){
        int tonerAmountX = tonerAmount+tonerLevel;
        if ( tonerAmountX>100 || tonerAmountX<0)  return -1 ;
        return tonerLevel += tonerAmount ;
    }

    public int setPagesPrinted (int pagesPrinted){
        int pagesCalc = duplex ? (pagesPrinted/2)+(pagesPrinted%2):pagesPrinted;
//        System.out.println(String.format("Print pages of %d in %d of toner %d",pagesPrinted,pagesCalc,tonerLevel));
        this.pagesPrinted += pagesPrinted;
        return pagesCalc;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
    public int getToner(){
        return tonerLevel;
    }
}
