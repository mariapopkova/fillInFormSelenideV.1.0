package enums;

public enum Hobby {
    SPORTS ("Sports"),
    READING ("Reading"),
    MUSIC ("Music");

    public final String label;

    private Hobby (String label){
        this.label = label;
    }
}
