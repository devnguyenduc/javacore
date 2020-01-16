package company.oop;

public class GSMTest {
    public GSMTest(){

    }
    public void Run(){
        BatteryType x = BatteryType.LiIon;
        DisplayType y = DisplayType.HD;
        GSM iphone4s = new GSM("IPhone 4s", "China", 0., "Apple", x.getBatteryModel(), y.getDisplayModel());
        iphone4s.Print();
    }
}
