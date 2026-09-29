public class BuddyInfo {


    private String name;

    public BuddyInfo() {
        this(null);
    }
    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static void main() {
        BuddyInfo b1 = new BuddyInfo("Homer");
        System.out.println("Hello " + b1.getName());
    }
}
