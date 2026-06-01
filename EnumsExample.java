enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int value;

    Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumsExample {
    public static void main(String[] args) {

        Level level = Level.HIGH;

        System.out.println(level.getValue());
    }
}