// https://wpilib.screenstepslive.com/s/currentCS/m/vision/l/669166-using-the-cameraserver-on-the-roborio

package frc.robot;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

public class RoboRIOClient {

	private UsbCamera camera;
	private CvSink sink;
	private Mat source;

	public void initRoboRIOCameraAlignmentSystem() {
		UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
		camera.setResolution(840,680);
		CvSink cvSink = CameraServer.getInstance.getVideo();
		Mat source = new Mat();
				
	}

	public double roboRIOCameraAlignmentSystemGetAngleToTurn() {
		cvSink.grabFrame(source);
		MyVector choice = ProcessImage.processImage(source);
	}
}
