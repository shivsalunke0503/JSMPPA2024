import java.net.*;
import java.io.*;
public class server {
    public static void main(String[] args) throws Exception {
        System.out.println("server of jsm chat messenger running");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is in listening mode at port 2100");

        Socket sobj = ssobj.accept();
        System.out.println("client  server connection successful");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Jsm chat messenger started..");
        
        String str1, str2;

        while((str1=br1.readLine())!=null)
        {
            System.out.println("client says :"+str1);
            System.out.println("Enter message for client :");
            str2=br2.readLine();
            ps.println(str2);
        }

        System.out.println("Thank you for using chat messenger :)");
        sobj.close();
        ps.close();
        br1.close();
        br2.close();



    }
}
