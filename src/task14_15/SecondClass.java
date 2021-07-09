package task14_15;

public class SecondClass extends FirstClass implements InterfaceForth {

    @Override
    public void iForthFirstMethod() {

    }

    @Override
    public void iSecondFirstMethod() {

    }

    @Override
    public void iSecondSecondMethod() {

    }

    @Override
    public void iThirdFirstMethod() {

    }

    @Override
    public void iThirdSecondMethod() {

    }

    @Override
    public void iFirstFirstMethod() {

    }

    @Override
    public void iFirstSecondMethod() {

    }

    public static void i1(InterfaceFirst i) {
        System.out.println("Interface first");
    }

    public static void i2(InterfaceSecond i) {
        System.out.println("Interface second");
    }

    public static void i3(InterfaceThird i) {
        System.out.println("Interface third");
    }

    public static void i4(InterfaceForth i) {
        System.out.println("Interface forth");
    }


}
