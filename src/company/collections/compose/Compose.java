package company.collections.compose;

public class Compose {
    public ComposeInt cpint;
    public ComposeFloat cpfloat;
    public ComposeDouble cpdouble;
    public ComposeComplex<ComposeInt> cpcomplexint;
    public Compose(){
        cpint = new ComposeInt();
        cpfloat = new ComposeFloat();
        cpdouble = new ComposeDouble();
        cpcomplexint = new ComposeComplex<ComposeInt>();
    }
}
