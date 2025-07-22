package src;

public class VisitorCounter {

    private static int totalVisitors = 0;

    private int sessionVisits;
    private String visitorName;

    // Constructor
    public VisitorCounter(String name) {
        this.visitorName = name;
        this.sessionVisits = 0;
        totalVisitors++;
    }
    // Non-static method
    public void recordVisit() {
        sessionVisits++;
        System.out.println(visitorName + " visited. Session visits: " +
                sessionVisits);
    }
    // Static method
    public static void displayTotalVisitors() {
        System.out.println("Total visitors today: " + totalVisitors);
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }
    public static void main(String[] args) {
        VisitorCounter vc1 = new VisitorCounter("Al Baraa");
        vc1.recordVisit();
        VisitorCounter vc2 = new VisitorCounter("Ahmed");
        vc2.recordVisit();
        VisitorCounter vc3 = new VisitorCounter("Ali");
        vc3.recordVisit();
        displayTotalVisitors();

    }
}
