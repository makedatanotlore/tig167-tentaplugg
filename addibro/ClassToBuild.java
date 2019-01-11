package addibro;

import java.util.function.Consumer;

/**
 * Builder
 */
public class ClassToBuild {
    private String field;
    private int field2;

    public ClassToBuild(String field, int field2) {
        System.out.println("ClassToBuild constructor runs");
        this.field = field;
        this.field2 = field2;
    }

    public static class Builder {
        public String field;
        public int field2;

        public Builder with(Consumer<Builder> b) {
            System.out.println("with method runs");
            b.accept(this);
            return this;
        }

        public ClassToBuild build() {
            System.out.println("build method runs");
            return new ClassToBuild(field, field2);
        }
    }

    @Override
    public String toString() {
        return field + " : " + field2;
    }
}