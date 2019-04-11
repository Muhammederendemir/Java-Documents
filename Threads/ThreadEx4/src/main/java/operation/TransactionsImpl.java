package operation;

public class TransactionsImpl implements Transactions {

    public int toplama(int x, int y) {
        return x+y;
    }

    public int cikartma(int x, int y) {
        return x-y;
    }

    public int bolme(int x, int y) {
        return x*y;
    }

    public int carpma(int x, int y) {
        return x/y;
    }
}
