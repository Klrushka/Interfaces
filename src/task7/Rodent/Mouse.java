package task7.Rodent;

public class Mouse implements Rodent {

    @Override
    public void eat() {
        System.out.println("task7.Rodent.Mouse eating");
    }

    @Override
    public void sleep() {
        System.out.println("task7.Rodent.Mouse sleeping");
    }
}
