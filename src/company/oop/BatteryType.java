package company.oop;

public enum BatteryType {
	LiIon(new Battery("Lithium Ion", 18, 12)),
	PolyIon(new Battery("PolymerLithium Ion",24,15)),
	;

	private Battery BatteryModel = null;

	BatteryType(Battery batteryModel) {
		BatteryModel = batteryModel;
	}

	public Battery getBatteryModel() {
		return BatteryModel;
	}

	public void setBatteryModel(Battery batteryModel) {
		BatteryModel = batteryModel;
	}

	public void Print(){
		BatteryModel.Print();
	}
};
