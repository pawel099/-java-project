package jaknauczycsieprogramowania.app;

import java.util.ArrayList;

public class komputer {

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	public void setHeadphones(headphones headphones) {
		Headphones = headphones;
	}

	private Monitor monitor;
    private Drive drive;
	private headphones Headphones;

	public ArrayList<UsbDevices> getUsbDevices() {
		return usbDevices;
	}

	ArrayList<UsbDevices> usbDevices = new ArrayList<>();

	public Monitor getMonitor() {
		return monitor;
	}

	public Drive getDrive() {
		return drive;
	}

	public headphones getHeadphones() {
		return Headphones;
	}

	public komputer(Monitor monitor , Drive drive) {

		this.monitor = monitor;
		this.drive = drive;


	}



}
