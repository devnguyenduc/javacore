package company.collections.compose;

public class ComposeComplex<T extends ComposeNumber> implements ComposeNumber<ComposeComplex<T>> {

    // Real
    public T re;
    // Image
    public T im;

    public  ComposeComplex(){

    }

    public ComposeComplex(T re, T im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void set(ComposeComplex<T> var) {
        re = var.re;
        im = var.im;
    }

    public void set(T re, T im){
        re = re;
        im = im;
    }

    @Override
    public ComposeComplex<T> get() {
        return this;
    }

    @Override
    public void plus(ComposeComplex<T> var) {
        re.plus(var.re);
        im.plus(var.im);
    }

    @Override
    public void minus(ComposeComplex<T> var) {
        re.minus(var.re);
        im.minus(var.im);
    }

    @Override
    public void multi(ComposeComplex<T> var) {
        /*
        *
        * Re(a * b) = a.re * b.re - a.im * b.im;
        * Im(a * b) = a.re * b.im + a.im * b.re;
        *
        * */
        ComposeComplex<T> temp_re = new ComposeComplex<T>(var.re, var.im);
        ComposeComplex<T> temp_im = new ComposeComplex<T>(var.re, var.im);

        // temp_re.re = temp_re.re * re;
        temp_re.re.multi(re); // example: return a number A;
        // temp_re.im = temp_re.im * im;
        temp_re.im.multi(im); // example: return a number B;

        // temp_im.re = temp_im.re * re;
        temp_im.re.multi(im); // example: return a number C;
        // temp_im.im = temp_im.im * im;
        temp_im.im.multi(re); // example: return a number D;

        // number: A - B;
        temp_re.re.minus(temp_re.im);
        // re = number: A - B;
        re.set(temp_re.re);

        // number: C + D;
        temp_im.im.plus(temp_im.re);
        // im = number: C + D;
        im.set(temp_im.im);
    }

    @Override
    public void multi(int factor) {
        re.multi(factor);
        im.multi(factor);
    }

    @Override
    public  void reversed(){

    }

    public void conjure(){
        im.reversed();
    }

    @Override
    public void device(ComposeComplex<T> var) {
        var.conjure();
        multi(var);
    }

    @Override
    public boolean isNegative() {
        return false;
    }

    @Override
    public String toString() {
        ComposeComplex<T> temp = new ComposeComplex<T>(re, im);
        if(im.isNegative()) {
            temp.im.reversed();
            return "( " + re.get() + " - " + temp.im.get() +"i )";
        }else{
            return "( " + re.get() + " + " + im.get() +"i )";
        }
    }
}
