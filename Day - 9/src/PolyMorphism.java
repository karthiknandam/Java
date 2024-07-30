public class PolyMorphism {
    private String movie;

    public PolyMorphism(String movie){
        this.movie = movie;
    }
    public void theWatch(){
        System.out.println(movie + " is an "+ this.getClass().getSimpleName() + " Film");
    }
    public static PolyMorphism getMovie(String type , String name){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Action(name);
            case 'H' -> new Horror(name);
            case 'F' -> new Funny(name);
            default -> new PolyMorphism(name);
        };
    }
}
class Action extends PolyMorphism{
    public Action(String movie){
        super(movie);
    }
    @Override
    public void theWatch(){
        super.theWatch();
        System.out.printf("... %s %n".repeat(3),"Welcome","Take your Seat","Have a blast experience");
    }
}
class Horror extends PolyMorphism{
    public Horror(String movie){
        super(movie);
    }
    @Override
    public void theWatch(){
        super.theWatch();
        System.out.printf("... %s %n".repeat(3),"🥶🥶🥶🥶Welcome🥶🥶🥶🥶","Take your Seat","Have a blast experience");
    }
}
class Funny extends PolyMorphism{
    public Funny(String movie){
        super(movie);
    }
    @Override
    public void theWatch(){
        super.theWatch();
        System.out.printf("... %s %n".repeat(3),"😁😁😁Welcome😁😁😁","Take your Seat","Have a blast experience");
    }
}
