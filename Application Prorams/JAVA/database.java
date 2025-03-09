import java.sql.*; //step1
// import Student;
class database
{
    public static void main(String[] args) throws Exception {
        String URL="jdbc:mysql://localhost:3306/ppa";
        String username="root";
        String password="root";
        String query="select * from student";

        Connection cobj = DriverManager.getConnection(URL, username, password); //step 2
        Statement sobj = cobj.createStatement(); //step 3
        ResultSet resultSet = sobj.executeQuery(query); //step 4

        while(resultSet.next())
        {
         
            System.out.println("RollNo:"+resultSet.getInt("RollNo"));
            System.out.println("Name: "+resultSet.getString("Name"));
            System.out.println("Marks: "+resultSet.getInt("Marks"));
            System.out.println("Address: "+resultSet.getString("Address"));
            
            // Student st = new Student();
            // st.setRollNo(resultSet.getInt("RollNo"));
            // st.setName(resultSet.getString("Name"));
            // st.setAddress(resultSet.getString("Address"));
            // st.setMarks(resultSet.getInt("Marks"));           
            // System.out.println(st);
            System.out.println("------------------------------------------------------");
        }

    }
}

