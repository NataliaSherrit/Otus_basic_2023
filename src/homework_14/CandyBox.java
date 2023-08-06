package homework_14;

import java.util.Objects;
import java.util.Scanner;


public class CandyBox  implements AutoCloseable {
    private int presentsCount;

    public CandyBox setPresentsCount(int presentsCount) {
        this.presentsCount = presentsCount;
        return new CandyBox(presentsCount);
    }

    public CandyBox(int presentsCount) {
        this.presentsCount = presentsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return presentsCount == candyBox.presentsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(presentsCount);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Коробка запакована с " + presentsCount + " подарков и удалена из временного хранилища");
    }
}