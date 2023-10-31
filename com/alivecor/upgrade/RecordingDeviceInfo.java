package com.alivecor.upgrade;

import java.io.Serializable;

public class RecordingDeviceInfo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private Float batteryLevel;
  private AliveCorDevice device;
  private String deviceUuid;
  private String firmwareVersion;
  private String hardwareVersion;
  private LeadConfiguration leadConfiguration;
  private String serialNumber;
  
  public RecordingDeviceInfo() {}
  
  public Float getBatteryLevel()
  {
    return batteryLevel;
  }
  
  public AliveCorDevice getDevice()
  {
    return device;
  }
  
  public String getDeviceUuid()
  {
    return deviceUuid;
  }
  
  public String getFirmwareVersion()
  {
    return firmwareVersion;
  }
  
  public String getHardwareVersion()
  {
    return hardwareVersion;
  }
  
  public LeadConfiguration getLeadConfiguration()
  {
    return leadConfiguration;
  }
  
  public String getSerialNumber()
  {
    return serialNumber;
  }
  
  public void setBatteryLevel(Float paramFloat)
  {
    batteryLevel = paramFloat;
  }
  
  public void setDevice(AliveCorDevice paramAliveCorDevice)
  {
    device = paramAliveCorDevice;
  }
  
  public void setDeviceUuid(String paramString)
  {
    deviceUuid = paramString;
  }
  
  public void setFirmwareVersion(String paramString)
  {
    firmwareVersion = paramString;
  }
  
  public void setHardwareVersion(String paramString)
  {
    hardwareVersion = paramString;
  }
  
  public void setLeadConfiguration(LeadConfiguration paramLeadConfiguration)
  {
    leadConfiguration = paramLeadConfiguration;
  }
  
  public void setSerialNumber(String paramString)
  {
    serialNumber = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RecordingDeviceInfo{device=");
    localStringBuilder.append(device);
    localStringBuilder.append(", deviceUuid='");
    localStringBuilder.append(deviceUuid);
    localStringBuilder.append('\'');
    localStringBuilder.append(", hardwareVersion='");
    localStringBuilder.append(hardwareVersion);
    localStringBuilder.append('\'');
    localStringBuilder.append(", firmwareVersion='");
    localStringBuilder.append(firmwareVersion);
    localStringBuilder.append('\'');
    localStringBuilder.append(", serialNumber='");
    localStringBuilder.append(serialNumber);
    localStringBuilder.append('\'');
    localStringBuilder.append(", batteryLevel=");
    localStringBuilder.append(batteryLevel);
    localStringBuilder.append(", leadConfiguration=");
    localStringBuilder.append(leadConfiguration);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}
