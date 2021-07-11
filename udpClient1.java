import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class udpClient1
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		DatagramSocket ds= new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		byte buf[]=null;
		while(true)
		{
			String inp=sc.nextLine();
			buf=inp.getBytes();
			DatagramPacket Dpsend=new DatagramPacket(buf,buf.length,ip,1234);
			ds.send(Dpsend);
			if(inp.equals("bye"))
				break;
		}
	}
}
