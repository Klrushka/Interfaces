package task10.Music;

public class Wind implements Playable, Instrument {

    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
}
