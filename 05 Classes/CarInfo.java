public class CarInfo {
	private String brand;
	private String model;
	private int horsePower;

/*
		public void setBrand (String brandInput){
			this.brand = brandInput;
		}
		public void setModel (String modelInput){
			model = modelInput;
		}
		public void setHorsePower ( int horsePowerInput){
			horsePower = horsePowerInput;
		}
		public String getCarInfo() {
			return "The car is: " + brand + " " + model + " – " + horsePower + " HP.";
		}

 */
	public CarInfo(){
		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
	}
	public CarInfo(String brandInput){
		this.brand = brandInput;
		this.model = "unknown";
		this.horsePower = -1;
	}
	public CarInfo(String brandInput, String modelInput){
		this.brand = brandInput;
		this.model = modelInput;
		this.horsePower = -1;
	}
	public CarInfo(String brandInput, int horsePowerInput){
		this.brand = brandInput;
		this.model = "unkonown";
		this.horsePower = horsePowerInput;
	}
	public CarInfo(int horsePowerInput){
		this.brand = "unknown";
		this.model = "unknown";
		this.horsePower = horsePowerInput;

	}

	public CarInfo(String brandInput, String modelInput, int horsePowerInput){
		this.brand = brandInput;
		this.model = modelInput;
		this.horsePower = horsePowerInput;
	}
	public void getCarInfo(){
		System.out.println("The car is: " + brand  + " " + model + " – " + horsePower + " HP.");
	}

}
