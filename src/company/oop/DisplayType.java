package company.oop;

public enum DisplayType {
    FullHD(new Display("FullHD", 1080, 1920, 16000000 )),
    HD(new Display("HD", 720, 1280, 10800000));

    private Display DisplayModel = null;

    DisplayType(Display displayModel) {
        DisplayModel = displayModel;
    }

    public Display getDisplayModel() {
        return DisplayModel;
    }

    public void setDisplayModel(Display displayModel) {
        DisplayModel = displayModel;
    }

    public void Print(){
        DisplayModel.Print();
    }
}
