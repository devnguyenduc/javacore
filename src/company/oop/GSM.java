package company.oop;
import java.util.ArrayList;
import java.util.List;

public class GSM {
	private String model;
	private String manufacturer;
	private Double price;
	private String owner;
	private Battery battery;
	private Display display;
	private List<Call> CallHistory;

	public GSM(String model, String manufacturer, Double price, String owner, Battery battery, Display display) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.display = display;
		this.CallHistory = new ArrayList<>() ;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}

	public void Called(Call call){
		this.CallHistory.add(call);
	}

	public void ViewCallHistory(){
		this.CallHistory.forEach(Call::Print);
	}

	public void deleteCalled(int index){
		this.CallHistory.remove(index);
	}

	public void ClearCallHistory(){
		this.CallHistory.clear();
	}

	public List<Call> getCallHistory() {
		return CallHistory;
	}

	public void setCallHistory(List<Call> callHistory) {
		CallHistory = callHistory;
	}

	public void TotalPrice(){
		Double totalTime = 0.0;
		for (int i = 0; i < this.CallHistory.size(); i++) {
			totalTime += this.CallHistory.get(i).getDuration();
		}
		this.price = 0.37 * totalTime / 60.0;
	}

	@Override
	public String toString() {
		return "GSM{" +
				"model='" + model + '\'' +
				", manufacturer='" + manufacturer + '\'' +
				", price=" + price +
				", owner='" + owner + '\'' +
				", battery=" + battery +
				", display=" + display +
				'}';
	}

	public void Print() {
		System.out.println(this.toString());
	}
}
