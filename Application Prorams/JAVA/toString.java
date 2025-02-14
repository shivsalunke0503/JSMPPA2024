public class toString {
    public static void main(String[] args) {
        Employee e1 = new Employee("gaurav", 100000000, 20, "pune");
        e1.dispaly();
        
        System.out.println(e1.hashCode());
        System.out.println(e1);//internally calls toString()
        System.gc();
    }
}

class Employee
{
    public String name;
    public int salary;
    public int age;
    public String address;

    Employee(String name,int salary, int age,String address)
    {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.address =address;
    }

    void dispaly()
    {
        System.out.println("Employee name: "+ this.name);
        System.out.println("Employee salary: "+ this.salary);
        System.out.println("Employee age: "+ this.age);
        System.out.println("Employee address: "+ this.address);
    }

    protected void finalize()
    {
        System.out.println("inside finalize method");
    }

    public String toString()
    {
        return
        "name: "+this.name +"\n"+
        "salary: "+this.salary+"\n"+
        "age: "+this.age+"\n"+
        "address: "+this.address;
    }
}
