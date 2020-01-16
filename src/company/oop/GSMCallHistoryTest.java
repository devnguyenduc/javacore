package company.oop;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class GSMCallHistoryTest {
    public GSMCallHistoryTest(){

    }
    public void Run(){
        BatteryType x = BatteryType.LiIon;
        DisplayType y = DisplayType.HD;
        GSM iphone4s = new GSM("IPhone 4s", "China", 0., "Apple", x.getBatteryModel(), y.getDisplayModel());
        iphone4s.Print();

        Integer id = 0;
        id = iphone4s.getCallHistory().size() + 1;
        Call call1 = new Call(id, LocalDate.now(), LocalTime.now(), "+84123456789",100.0);
        iphone4s.Called(call1);
        id = iphone4s.getCallHistory().size() + 1;
        Call call2 = new Call(id, LocalDate.now(), LocalTime.now(), "+84123456789",60.0);
        iphone4s.Called(call2);
        id = iphone4s.getCallHistory().size() + 1;
        Call call = new Call(id, LocalDate.now(), LocalTime.now(), "+84098765432", 30.0);
        iphone4s.Called(call);
        iphone4s.ViewCallHistory();
        iphone4s.TotalPrice();
        iphone4s.Print();

        Integer position = 0;
        List<Call> list_check = iphone4s.getCallHistory().stream().collect(Collectors.toList());

        Comparator<Call> compareById = (Call o1, Call o2) -> o2.getDuration().compareTo( o1.getDuration() );
        Collections.sort(list_check, compareById);
        position = list_check.get(0).getId();

        iphone4s.deleteCalled(position - 1);
        iphone4s.ViewCallHistory();
        iphone4s.TotalPrice();
        iphone4s.Print();
        iphone4s.ClearCallHistory();

    }
}
