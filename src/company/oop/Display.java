package company.oop;

public class Display {
	private  String name;
	private Integer width;
	private Integer height;
	private Integer colors;

	public Display(String name, Integer width, Integer height, Integer colors) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.colors = colors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getColors() {
		return colors;
	}

	public void setColors(Integer colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Display{" +
				"name='" + name + '\'' +
				", width=" + width +
				" x height=" + height +
				", colors=" + colors +
				'}';
	}

	public void Print() {
		System.out.println(this.toString());
	}
}
