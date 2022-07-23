package com.interfaceinbuiltexample;

import java.util.Arrays;

import com.inheritance.inbuiltexample.Resource;

public class TestInterfaces {
	public static void main(String[] args) {
		Resource[] resources= {new Resource(1,"y",false),
				new Resource(2,"x",true),
				new Resource(3,"z",false)};
		Arrays.sort(resources);
		for(Resource resource:resources) {
			System.out.println(resource);
		}
			
	}
public static void main2(String[] args) {
	String[] deviceNamess= {"port","Zigbee","accesory"};
	 Arrays.parallelSort(deviceNamess);
	 for(String deviceName:deviceNamess)
	 {
		 System.out.println(deviceName);
	 }
		}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
 int[] deviceNumbers= {1,3,2,7,6};
 Arrays.parallelSort(deviceNumbers);
 for(int deviceId:deviceNumbers)
 {
	 System.out.println(deviceId);
 }
	}

}
