package com.strings;

import java.util.ArrayList;
import java.util.List;

//o(1) - time complexity o(1)- space complexity 
public class CheckIpAddressValidity {

	public static void main(String[] args) {

		System.out.println(validIPAddresses("1921680"));

	}

	public static List<String> validIPAddresses(String s) {
		List<String> ipAddressList = new ArrayList<String>();

		for (int i = 1; i < Math.min((int) s.length(), 4); i++) {

			String[] ipAddress = new String[] { "", "", "", "" };

			ipAddress[0] = s.substring(0, i);
			if (!isValidIpPart(ipAddress[0])) {
				continue;
			}

			for (int j = i + 1; j < i + Math.min((int) s.length() - i, 4); j++) {
				ipAddress[1] = s.substring(i, j);
				if (!isValidIpPart(ipAddress[1])) {
					continue;
				}

				for (int k = j + 1; k < j + Math.min((int) s.length() - j, 4); k++) {
					ipAddress[2] = s.substring(j, k);
					ipAddress[3] = s.substring(k);
					if (isValidIpPart(ipAddress[2]) && isValidIpPart(ipAddress[3])) {
						ipAddressList.add(String.join(".", ipAddress));
					}

				}

			}
		}

		return ipAddressList;
	}

	public static boolean isValidIpPart(String s) {

		int ipPart = Integer.parseInt(s);
		if (ipPart > 255) {
			return false;
		}

		return s.length() == String.valueOf(ipPart).length(); // checks the trailing part
	}

}
