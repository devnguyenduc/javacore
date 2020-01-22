package company.collections.compose;

public class ComposeFloat implements ComposeNumber<Float> {

    public float value;

    public ComposeFloat(){
        value = 0.0F;
    }

    public ComposeFloat(float value) {
        this.value = value;
    }

    @Override
    public void set(Float var) {
        value = var.floatValue();
    }

    @Override
    public Float get() {
        return value;
    }

    @Override
    public void plus(Float var) {
        this.value += var.floatValue();
    }

    @Override
    public void minus(Float var){
        this.value -= var.floatValue();
    }

    @Override
    public void multi(Float var){
        this.value *= var.floatValue();
    }

    @Override
    public void multi(int var){
        this.value *= var;
    }

    @Override
    public void reversed() {
        value = - value;
    }

    @Override
    public boolean isNegative() {
        if(value < 0.0F) return true;
        return false;
    }

    @Override
    public void device(Float var){
        this.value /= var.floatValue();
    }
}
