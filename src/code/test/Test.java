package code.test;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Internal " + Inet4Address.getLocalHost().getHostAddress());
			System.out.println("Enternal " + getPublicIpAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getPublicIpAddress() {
		String res = null;
		try {
			String localhost = InetAddress.getLocalHost().getHostAddress();
			Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();
			while (e.hasMoreElements()) {
				NetworkInterface ni = e.nextElement();
				if (ni.isLoopback())
					continue;
				if (ni.isPointToPoint())
					continue;
				Enumeration<InetAddress> addresses = ni.getInetAddresses();
				while (addresses.hasMoreElements()) {
					InetAddress address = addresses.nextElement();
					if (address instanceof Inet4Address) {
						String ip = address.getHostAddress();
						if (!ip.equals(localhost))
							System.out.println((res = ip));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
