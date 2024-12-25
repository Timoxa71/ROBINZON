public class NotSmart extends Exception {
    private final String objectName;
    private final String objectName2;
    public NotSmart(String objectName, String objectName2) {
        this.objectName = objectName;
        this.objectName2 = objectName2;
    }
    @Override
    public String getMessage() {
        return objectName + " недостаточно умен, чтобы построить " + objectName2;

    }
}