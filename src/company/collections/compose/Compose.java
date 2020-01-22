package company.collections.compose;

public class Compose {
    public ComposeLong cpint;
    public ComposeFloat cpfloat;
    public ComposeDouble cpdouble;
    public ComposeComplex<ComposeNumber> cpcomplex;
    public Compose(){
        cpint = new ComposeLong();
        cpfloat = new ComposeFloat();
        cpdouble = new ComposeDouble();
        cpcomplex = new ComposeComplex<>();
    }
}
