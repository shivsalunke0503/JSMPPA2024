public class finalizeDemo2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("gaurav", 100000000, 20, "pune");
        e1.dispaly();
        System.out.println("hashcode of e1: "+e1.hashCode());

        Employee e2=e1;
        System.out.println("hashcode of e2: "+e2.hashCode());
        System.out.println(e1.hashCode()==e2.hashCode());

        Employee e3 = new Employee("nikita", 2000000000, 20, "usa");
        System.out.println("e3 hashcode : "+e3.hashCode());
        System.out.println(e3.getClass());
        System.out.println("".getClass());
        System.out.println(new Integer(0).getClass());
        e1=null;
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
}
