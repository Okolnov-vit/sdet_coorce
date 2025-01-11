package Classes;

public class SumOperation implements PairOperation<Integer> {
    @Override
    public Integer operate(Integer a, Integer b) {
        return a + b;
    }
}