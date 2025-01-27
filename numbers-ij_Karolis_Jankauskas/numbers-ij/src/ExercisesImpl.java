import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class ExercisesImpl implements Exercises {


    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().min(Integer::compareTo).orElseThrow();
    }




    @Override
    public Integer findLargest(List<Integer> list) {

        return list.stream().max(Integer::compareTo).orElseThrow();
    }

    @Override
    public boolean isEqual(Object o, Object o1) {

        if (o!=null && o1!= null){

       } return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        if (o == o1) {
            return true;
        }
        if (o == null || o1 == null) {
            return false;
        }
        return o.equals(o1);
    }


    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }






    @Override
    public int computeSumOfNumbers(int i) {
        int sum = 0;
        for (int j = 1; j <=i ; j++)
        {
            sum += j;
        }
        return sum;
    }


    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int sum = 0;

        for (int num = 1; num <= i; num++) {
            if (numberFilter.accept(num)) {
                sum += num;
            }
        }

        return sum;
    }


    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        List<Integer> numbers = new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            numbers.add(j);
        }
        return numbers;
    }


    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (Integer number : list) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }
        return occurrences;
    }


    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGenerator() {
            @Override
            public Integer getNext() {
                return 0;
            }

            private int current = i;

            public int next() {
                int value = current;
                current += i1;
                return value;
            }
        };
    }


    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {

        return null;
    }
}
