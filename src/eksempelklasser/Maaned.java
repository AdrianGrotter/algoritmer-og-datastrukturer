package eksempelklasser;

import java.util.Arrays;

public enum Maaned
{
    Jan ("Januar",1),
    Feb ("Februar",2),
    Mar ("Mars",3),
    Apr ("April",4),
    Mai ("Mai",5),
    Jun ("Juni",6),
    Jul ("Juli",7),
    Aug ("August",8),
    Sep ("September",9),
    Okt ("Oktober",10),
    Nov ("November",11),
    Des ("Desember",12);

    private final String fulltnavn;      // instansvariabel
    private final int mndnr;
    private Maaned(String fulltnavn, int mndnr) {
        this.fulltnavn = fulltnavn;
        this.mndnr = mndnr;
    }
    public int mndnr() { return mndnr; }

    public String toString() { return fulltnavn; }

    public static Maaned[] vår()
    {
        return Arrays.copyOfRange(values(),3,5);
    }

    public static Maaned[] sommer()
    {
        return Arrays.copyOfRange(values(),5,8);
    }

    public static Maaned[] høst()
    {
        return Arrays.copyOfRange(values(),8,10);
    }

    public static Maaned[] vinter()
    {
        return new Maaned[] { Nov, Des, Jan, Feb, Mar };
    }
}
