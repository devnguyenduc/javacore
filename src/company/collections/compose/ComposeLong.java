package company.collections.compose;

public class ComposeLong implements ComposeNumber<Long> {
    public long value;

    public ComposeLong(){
        value = 0L;
    }

    @Override
    public void set(Long var) {
        value = var.longValue();
    }

    @Override
    public Long get() {
        return value;
    }

    public ComposeLong(long value) {
        this.value = value;
    }

    @Override
    public void plus(Long var) {
        this.value += var.longValue();
    }

    @Override
    public void minus(Long var) {
        this.value -= var.longValue();
    }

    @Override
    public void multi(Long var) {
        this.value *= var.longValue();
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
    public void device(Long var) {
        this.value /= var.longValue();
    }
}
