package Music;

public class Music {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
}
