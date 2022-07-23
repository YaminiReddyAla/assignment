package july18th.devicescenari.dao;

import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.stereotype.Repository;

import july18th.devicescenari.model.Device;
import july18th.devicescenari.model.DeviceStatus;
@Repository
public class DeviceDaoImplementation implements DeviceDao {


	@Override
	public DeviceStatus getDeviceDetailsFromDB(int deviceId) {
		// TODO Auto-generated method stub
		DeviceStatus deviceStatus=new DeviceStatus(1,"not found",new Device(0,"",0,""));
		System.out.println("inside Dao");
		return deviceStatus;
	}

}
