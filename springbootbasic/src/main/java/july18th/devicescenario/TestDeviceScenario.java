package july18th.devicescenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import july18th.devicescenari.model.DeviceStatus;
import july18th.devicescenari.service.DeviceService;
@SpringBootApplication
public class TestDeviceScenario implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestDeviceScenario.class, args);
	}
	@Autowired
  private DeviceService deviceService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hey hi");
		/*int deviceId=23;
	
		
		DeviceStatus deviceStatus=deviceService.getDeviceDetails(deviceId);
		if(deviceStatus.getStatusCode()==0) {
			System.out.println("device details with the device id not found");
		}
		else {
			System.out.println(deviceStatus.getDevice());
		}*/
		
	}

}
