package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.method.Device;
import com.xworkz.polymorphism.dataCodes.inheritance.method.Camera;

public class DeviceData {

	public static void main(String[] args) {

		Device dev = new Device();
		dev.setType("Analog Camera");

		Camera cam = new Camera();
		cam.setBrand("Nikon", "Digital Camera");

		Device dev1 = new Camera();
		Camera dev3 = (Camera) dev1;
		dev3.setOld(150);
		
/*if(dev1 instanceof Camera) {
	Camera dev4 = (Camera) new Device();
		dev4.setSeries(15);
}
else {
	System.err.println("I am getting error");
}*/
	}

}
