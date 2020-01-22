package company.collections.compose;


public class ComposeInt implements ComposeNumber<Integer> {
    public int value;

    public ComposeInt(){
        value = 0;
    }

    @Override
    public void set(Integer var) {
        value = var.intValue();
    }

    @Override
    public Integer get() {
        return value;
    }

    public ComposeInt(int value) {
        this.value = value;
    }

    @Override
    public void plus(Integer var) {
        this.value += var.intValue();
    }

    @Override
    public void minus(Integer var) {
        this.value -= var.intValue();
    }

    @Override
    public void multi(Integer var) {
        this.value *= var.intValue();
    }

    @Override
    public void multi(int factor) {
        this.value *= factor;
    }

    @Override
    public void reversed() {
        value = -value;
    }

    @Override
    public boolean isNegative() {
        if(value < 0) return true;
        return false;
    }

    @Override
    public void device(Integer var) {
        value /= var.intValue();
    }

}
