//package PazurProject;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Program {

	public static void main(String[] args) {
		
		LCD.drawString("hello everybody", 0, 4);
		//Delay.msDelay(1000);
		
		RegulatedMotor motor = new EV3LargeRegulatedMotor(MotorPort.A);//zobak
		motor.backward();//dole zobak
		Delay.msDelay(1000);
		motor.close();
		/*motor.rotate(200);//zatvor zobak
		motor.forward();//hore zobak
		Delay.msDelay(1000);
		motor.backward();//dole zobak
		Delay.msDelay(1000);
		motor.close();*/
		//bite((short) 1);
		
	}

	private static void bite(short times){
		RegulatedMotor motor = new EV3LargeRegulatedMotor(MotorPort.A);//zobak
		/*motor.forward();//hore zobak
		Delay.msDelay(1000);
		motor.backward();//dole zobak
		Delay.msDelay(1000);
		motor.stop();*/

		LCD.clear();
		LCD.drawString("I WILL EAT YOU!!!", 0, 4);
		for(short i = 0; i<times;i++){
			motor.rotate(-200);//otvor zobak
			motor.rotate(200);//zatvor zobak
		}
		motor.close();
		
	}
	
	
	
}
