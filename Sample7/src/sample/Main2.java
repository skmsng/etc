package sample;

public class Main2 {
	
	public static void main(String[] args){
		
		Integer devNum = Integer.parseInt(args[1]);
		Device device = Main2.getDevice(devNum);
		
		switch(Integer.getInteger(args[0])){
		case 1:
			device.play();
			break;
		case 2:
			device.stop();
			break;
		case 3:
			device.fastForward();
			break;
		case 4:
			device.rewind();
			break;
			
		}
		
	}
	
	public static Device getDevice(Integer num){
		
		Device dev = null;
		
		switch(num){
		case 0:
			dev = new CD();
		case 1:
			dev = new Record();
		case 2:
			dev = new Casetto();
		case 3:
			dev = new BluRay();
		}
		
		return dev;
	}

}
