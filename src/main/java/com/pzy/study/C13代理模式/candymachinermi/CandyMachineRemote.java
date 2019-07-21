package com.pzy.study.C13代理模式.candymachinermi;

import com.pzy.study.C13代理模式.candymachine.State;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface CandyMachineRemote extends Remote{
	public String  getLocation() throws RemoteException;
	public int getCount() throws RemoteException;
	public State getstate() throws RemoteException;
}
