import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {
    int min;
    int max;
    Random rnd;
    int[] hgh;

    public RandomIterator(Random random, int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Неправильно задан диапазон чисел");
        }
        this.min = min;
        this.max = max;
        this.rnd = random;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return rnd.nextInt(max - min + 1) + min;
    }
}
