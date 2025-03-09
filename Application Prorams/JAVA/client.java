import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) throws Exception {
        System.out.println("client of jsm chat messenger");
        Socket sobj = new Socket("localhost",2100);
        System.out.println("client is waiting for server to accept the request...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("JSM chat messeger started..");
        String str1, str2;

        while(!(str1=br2.readLine()).equals("end"))
        {
            System.out.println("Enter message for server: ");
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Server says :" + str2);
        }

        System.out.println("Thank you for using chat messenger :)");
        sobj.close();
        ps.close();
        br1.close();
        br2.close();
    }
    
}
