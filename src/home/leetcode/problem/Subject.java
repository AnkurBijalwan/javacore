package home.leetcode.problem;

public enum Subject {
    PHYSICS("Phy"),
    CHEMISTRY(""),
    CIVICS(""),
    GEO(""),
    STAT(""),
    ECO("");

    private final String sub;
    private Subject(String sub){
        this.sub= sub;
    }

    public String getSub(){
        return  this.sub;
    }
}
