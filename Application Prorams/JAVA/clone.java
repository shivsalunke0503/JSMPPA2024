public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("gaurav", 100000000, 20, "pune");
        e1.dispaly();
        System.out.println("e1 hashcode : "+e1.hashCode());
        Employee e2 = (Employee)e1.clone();
        System.out.println("e2 hashcode : "+e2.hashCode());
        e2.dispaly();
        System.gc();
    }
}

class Employee implements Cloneable
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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
