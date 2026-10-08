package clase20261008.productor_consumidor;

public class Utils {
    public static long getNumRandom(long min, long max) {
        return (long)(Math.random()*(max-min+1)+min);
    }

    public static long getItemRandom() {
        return getNumRandom(1, 10);
    }
}
