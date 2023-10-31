package com.alivecor.universal_monitor.bluetooth.configurations;

import android.bluetooth.BluetoothDevice;
import com.alivecor.universal_monitor.bluetooth.BluetoothDeviceProperties;

public abstract class EcgBleManagerCallback
{
  public EcgBleManagerCallback() {}
  
  public void onBatteryLevelReceived(BluetoothDevice paramBluetoothDevice, int paramInt) {}
  
  public void onDeviceConnected(BluetoothDevice paramBluetoothDevice) {}
  
  public void onDeviceConnecting(BluetoothDevice paramBluetoothDevice) {}
  
  public void onDeviceDisconnected(BluetoothDevice paramBluetoothDevice) {}
  
  public void onDeviceDiscovered(BluetoothDevice paramBluetoothDevice) {}
  
  public void onDeviceProperties(BluetoothDevice paramBluetoothDevice, BluetoothDeviceProperties paramBluetoothDeviceProperties) {}
  
  public void onDeviceReadyToStream(BluetoothDevice paramBluetoothDevice) {}
  
  public void onDeviceScanning() {}
  
  public void onDeviceScanningStopped() {}
  
  public void onDeviceStreaming(BluetoothDevice paramBluetoothDevice) {}
  
  public void onEcgPacketReceived(BluetoothDevice paramBluetoothDevice, int paramInt1, int paramInt2, byte[] paramArrayOfByte) {}
  
  public void onError(BluetoothDevice paramBluetoothDevice, String paramString, int paramInt) {}
  
  public void onStopped() {}
}
