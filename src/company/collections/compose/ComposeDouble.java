package company.collections.compose;

public class ComposeDouble implements ComposeNumber<Double> {
    public double value;

    public ComposeDouble(){
        value = 0.0;
    }

    public ComposeDouble(double value) {
        this.value = value;
    }

    @Override
    public void set(Double var) {
        this.value = var.doubleValue();
    }

    @Override
    public Double get() {
        return value;
    }

    @Override
    public void plus(Double var) {
        this.value += var.doubleValue();
    }

    @Override
    public void minus(Double var){
        this.value -= var.doubleValue();
    }

    @Override
    public void multi(Double var){
        this.value *= var.doubleValue();
    }

    @Override
    public void multi(int var){
        this.value *= var;
    }

    @Override
    public void reversed() {
        this.value = - this.value;
    }

    @Override
    public boolean isNegative() {
        if(value < 0.0) return true;
        return false;
    }

    @Override
    public void device(Double var){
        this.value /= var.doubleValue();
    }

}
