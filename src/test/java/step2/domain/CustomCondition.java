package step2.domain;

public class CustomCondition implements Condition{

    private int count = 0;

    @Override
    public boolean getCondition() {
        if (count++ % 2 == 0) {
            return true;
        }

        return false;
    }
}
