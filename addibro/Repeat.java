package addibro;

import java.util.function.Consumer;

public enum Repeat {
    ONE,
    TWO,
    THREE;

    public void times(Consumer<String> con, String s) {
        for (int i = 0; i < ordinal() + 1; i++) {
          con.accept(s);  
        }
    }
}