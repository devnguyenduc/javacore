package company.collections.compose;

public class Compose {
    public ComposeInt cpint;
    public ComposeFloat cpfloat;
    public ComposeDouble cpdouble;
    public ComposeComplex<ComposeNumber> cpcomplex;
    public Compose(){
        cpint = new ComposeInt();
        cpfloat = new ComposeFloat();
        cpdouble = new ComposeDouble();
        cpcomplex = new ComposeComplex<>();
    }
}
