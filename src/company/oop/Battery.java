package company.oop;

public class Battery {
	private String model;
	private Integer hours_idle;
	private Integer hours_talk;
	public Battery(String model, Integer hours_idle, Integer hours_talk) {
		super();
		this.model = model;
		this.hours_idle = hours_idle;
		this.hours_talk = hours_talk;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getHours_idle() {
		return hours_idle;
	}
	public void setHours_idle(Integer hours_idle) {
		this.hours_idle = hours_idle;
	}
	public Integer getHours_talk() {
		return hours_talk;
	}
	public void setHours_talk(Integer hours_talk) {
		this.hours_talk = hours_talk;
	}

	@Override
	public String toString() {
		return "Battery{" +
				"model='" + model + '\'' +
				", hours_idle=" + hours_idle +
				", hours_talk=" + hours_talk +
				'}';
	}

	public void Print() {
		System.out.println(this.toString());
	}
}
