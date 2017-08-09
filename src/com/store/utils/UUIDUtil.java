package com.store.utils;
import java.util.UUID;

public class UUIDUtil {
	public static String getUUID(){
		UUID uuid = UUID.randomUUID();
		String uString = uuid.toString().replace("-", "");
		return uString;
	}
	public static void main(String[] args) {
		System.out.println(getUUID());
	}
}
