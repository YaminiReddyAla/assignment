package july18th.devicescenari.dao;

import july18th.devicescenari.model.DeviceStatus;

public interface DeviceDao {

	DeviceStatus getDeviceDetailsFromDB(int deviceId);

}
