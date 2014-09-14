import java.util.Iterator;
// import java.util.Iterable;

public class test {
    public static void main(String[] args) {
        /* ITERABLES
                MyIterable myIt  = new MyIterable();

                for (Integer i : myIt)
                    System.out.println("i: " + i);*/

        // CONTINUE
        for (int i = 0; i < 3; i++) {
            if (i < 2 ) {
                System.out.println("Lower");
                continue;
            }
            System.out.println("next.");
        }

        /*
        FOR
        int i = 0;
        for (; i < 2; i++)
            System.out.println("i: " + i);

        for (int i = 0, j = 10; j > 5; i++, j--) {
            System.out.printf("%3d %3d%n", i , j);
        }
        */

        //Average of ages

        final int size = 5;
        int age[] = new int[size];
        int total = 0;
        float average;
        age[0] = 23;
        age[1] = 18;
        age[2] = 19;
        age[3] = 18;
        age[4] = 21;

        for (int number : age)
            total = total + number;

        average = total / (age.length * 1.0f); //
        System.out.println("Average: " + average) ;
    }
}

/**
The class which makes the magic of the iteration
*/
class MyIterable implements Iterable<Integer> {
    private MyIterator iterator;

    public MyIterable() {
        iterator = new MyIterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return iterator;
    }
}

/**
The class that contains the logic for iterate
*/
class MyIterator implements Iterator<Integer> {
    private int value;
    private int size;

    public MyIterator() {
        value = 1;
        size = 10;
    }

    @Override
    public boolean hasNext() {
        return (value <= size);
    }

    @Override
    public Integer next() {
        return value++;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}