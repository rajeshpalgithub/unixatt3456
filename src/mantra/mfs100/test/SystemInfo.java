/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mantra.mfs100.test;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dk
 */
public class SystemInfo {
    
    public static Map<String,String> mac_ip() throws IOException
    {
        
        Map<String, String> map = new HashMap<String, String>();
        

        



	try {
            
            
        Process ps = Runtime.getRuntime().exec("ifconfig -a"); 

        InputStream in = ps.getInputStream(); 

        BufferedReader reader = new BufferedReader(new InputStreamReader(in)); 

        String line = null; 

           while( (line=reader.readLine())!=null)

           { 

               System.out.println(line); 

           } 

        reader.close(); 
               
	/*		
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("Current IP address : " + ip.getHostAddress());
		
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
		byte[] mac = null;
               // final String macAddress = bytesToMacAddressString(network.getHardwareAddress());
                //System.out.println(network.getHardwareAddress().toString());
		mac = network.getHardwareAddress();
			
		System.out.print("Current MAC address : "+mac.length);
			
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
		System.out.println(sb.toString());
                map.put("ip", ip.toString());
                map.put("mac", sb.toString());*/
			
	} catch (UnknownHostException e) {
	} catch (SocketException e){
	}
        return map;
	    
   

    }

    /** 
         * Return Opertaion System Name; 
         *  
         * @return os name. 
         */  
        public static String getOsName() {  
            String os = "";  
            os = System.getProperty("os.name");  
            return os;  
        }  
     public static String getMACAddress() {  
            String address = "";  
            String os = getOsName();  
            if (os.startsWith("Windows")) {  
                try {  
                    String command = "cmd.exe /c ipconfig /all";  
                    Process p = Runtime.getRuntime().exec(command);  
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));  
                    String line;  
                    while ((line = br.readLine()) != null) {  
                        if (line.indexOf("Physical Address") > 0) {  
                            int index = line.indexOf(":");  
                            index += 2;  
                            address = line.substring(index);  
                            break;  
                        }else if (line.indexOf("Physical address") > 0) { 
                            int index = line.indexOf(":");  
                            index += 2;  
                            address = line.substring(index);  
                            break;  
                        }  
                    }  
                    br.close();  
                    return address.trim();  
                } catch (IOException e) {  
                }  
            } else if (os.startsWith("Linux")) {  
                String command = "/bin/sh -c ifconfig -a";  
                Process p;  
                try {  
                    p = Runtime.getRuntime().exec(command);  
                    BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));  
                    String line;  
                    while ((line = br.readLine()) != null) {  
                        if (line.indexOf("HWaddr") > 0) {  
                            int index = line.indexOf("HWaddr") + "HWaddr".length();  
                            address = line.substring(index);  
                            break;  
                        }  
                    }  
                    br.close();  
                } catch (IOException e) {  
                }  
            }  
            address = address.trim();  
            return address;  
        }  
    
      /** 
         * Access to CPU, CPU, only the first one 
         * @return 
         */  
        public static String getCPUSerial() {  
            String result = "";  
            String os = getOsName();  
            if (os.startsWith("Windows")) {  
            try {  
                File file = File.createTempFile("tmp", ".vbs");  
                file.deleteOnExit();  
                FileWriter fw = new java.io.FileWriter(file);  
      
                String vbs = "On Error Resume Next \r\n\r\n" + "strComputer = \".\"  \r\n"  
                        + "Set objWMIService = GetObject(\"winmgmts:\" _ \r\n"  
                        + "    & \"{impersonationLevel=impersonate}!\\\\\" & strComputer & \"\\root\\cimv2\") \r\n"  
                        + "Set colItems = objWMIService.ExecQuery(\"Select * from Win32_Processor\")  \r\n "  
                        + "For Each objItem in colItems\r\n " + "    Wscript.Echo objItem.ProcessorId  \r\n "  
                        + "    exit for  ' do the first cpu only! \r\n" + "Next                    ";  
      
                fw.write(vbs);  
                fw.close();  
                Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());  
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));  
                String line;  
                while ((line = input.readLine()) != null) {  
                    result += line;  
                }  
                input.close();  
                file.delete();  
            } catch (Exception e) {  
                e.fillInStackTrace();  
            }  
            }else if (os.startsWith("Linux")) {  
                String CPU_ID_CMD = "dmidecode -t 4 | grep ID |sort -u |awk -F': ' '{print $2}'";  
                 Process p;  
                 try {  
                     p = Runtime.getRuntime().exec(new String[]{"sh","-c",CPU_ID_CMD});//The Conduit 
                     BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));  
                     String line;  
                     while ((line = br.readLine()) != null) {  
                             result += line;  
                             break;  
                     }  
                     br.close();  
                 } catch (IOException e) {  
                 }  
            }  
            if (result.trim().length() <1 || result == null) {  
                result = "No CPU_ID is read"; 
            }  
            return result.trim();  
        }  
          
}
