package addibro;

import java.util.function.Consumer;

/**
 * Builder
 */
public class ClassToBuild {
    private String field;
    private int field2;

    public OuterClass(String field, int field2) {
        this.field = field;
        this.field2 = field2;
    }

    public static class Builder {
        public String field;
        public int field2;

        public Builder with(Consumer<Builder> b) {
            b.accept(this);
            return this;
        }

        public ClassToBuild build() {
            return new OuterClass();
        }
    }
}