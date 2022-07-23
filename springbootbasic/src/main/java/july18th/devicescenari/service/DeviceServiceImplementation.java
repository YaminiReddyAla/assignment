package july18th.devicescenari.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import july18th.devicescenari.dao.DeviceDao;
import july18th.devicescenari.model.Device;
import july18th.devicescenari.model.DeviceStatus;
@Service
public class DeviceServiceImplementation implements DeviceService {
@Autowired	
private DeviceDao deviceDao;
	@Override
	public DeviceStatus getDeviceDetails(int deviceId) {
		// TODO Auto-generated method stub
		System.out.println("in service layer");
		return deviceDao.getDeviceDetailsFromDB(deviceId);
	}

}
