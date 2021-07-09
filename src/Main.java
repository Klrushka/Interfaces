import task10.Music.*;
import task14_15.*;
import task7.Rodent.Rodent;
import task7.Rodent.RandomRodentGenerator;
import task4.Abstract;
import task4.DerivedAbstract;

public class Main {


    public static void main(String[] args) {

        /*
        Exercise 4: (3) Create an abstract class with no methods. Derive a class and add a
        method. Create a static method that takes a reference to the base class, downCasts it to the
        derived class, and calls the method. In main( ), demonstrate that it works. Now put the
        abstract declaration for the method in the base class, thus eliminating the need for the
        downcast.
         */

        Abstract anAbstract = new DerivedAbstract();

        DerivedAbstract.downcast(anAbstract);


        /*
        Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter so that task7.Rodent.task7.Rodent is an
        interface.
         */

        System.out.println();
        Rodent[] rodents = new Rodent[10];
        RandomRodentGenerator gen = new RandomRodentGenerator();
        for (int i = 0; i < 10; i++) {
            rodents[i] = gen.gen();
        }

        for (Rodent r : rodents) {
            r.sleep();
            r.eat();
        }

        /*
        Exercise 10: (3) Modify Musics.java by adding a task10.Music.Playable interface. Move the play( )
        declaration from task10.Music.Instrument to task10.Music.Playable. Add task10.Music.Playable to the derived classes by
        including it in the implement s list. Change tune( ) so that it takes a task10.Music.Playable instead of
        an task10.Music.Instrument.
         */
        System.out.println();

        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        Music.tuneAll(orchestra);

        /*
        Exercise 13: (2) Create an interface, and inherit two new interfaces from that interface.
        Multiply inherit a third interface from the second two.

        ***********************************IN task13 PACKAGE****************************************
         */


        /*
        Exercise 14: (2) Create three interfaces, each with two methods. Inherit a new interface
        that combines the three, adding a new method. Create a class by implementing the new
        interface and also inheriting from a concrete class. Now write four methods, each of which
        takes one of the four interfaces as an argument. In main( ), create an object of your class
        and pass it to each of the methods.

        Exercise 15: (2) Modify the previous exercise by creating an abstract class and
        inheriting that into the derived class.
         */

        SecondClass secondClass = new SecondClass();

        SecondClass.i1(secondClass);
        SecondClass.i2(secondClass);
        SecondClass.i3(secondClass);
        SecondClass.i4(secondClass);


    }
}
