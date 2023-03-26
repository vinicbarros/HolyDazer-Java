public class Holiday {
    private String name;
    private String date;

    public String showName() {
        return name;
    }

    public String showDate() {
        return date;
    }

    public Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }
}
