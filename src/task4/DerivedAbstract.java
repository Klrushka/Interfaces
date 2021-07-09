package task4;

public class DerivedAbstract extends Abstract{
    protected void afterDownCast(){
        System.out.println("After down casting");
    }


    public static void downcast(Abstract a){
        //((task4.DerivedAbstract)a).afterDownCast();
        a.afterDownCast();
    }
}
