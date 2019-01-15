package addibro;

public enum Base {
    BINARY(100),
    OCTAL(1),
    DECIMAL(10),
    HEX(2);

    private Base(int i) {
        this.prize = i;
    }

    private int prize;

    @Override
    public String toString() {
        return name();
    }
}