package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Employee,String> hashmap =new HashMap<>();
        Employee e1 = new Employee("Khyati",1);
        Employee e2 = new Employee("Khyati",1);
        hashmap.put(e1,"Dev");
        hashmap.put(e2,"Dev");
        ArrayList<Integer> list =new ArrayList<>();

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("khyati");
        hashSet1.add(new String("khyati"));
        //hash(key);
        //index = hash & (n-1);
        System.out.println(hashmap.size());
        Employee e3 =e1;
//        System.out.println(e1.equals(e3));


    }
}

class Employee
{
    String name;
    Integer id;
    public Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public Integer getId()
    {
        return id;
    }

//    @Override
//    public int hashCode()
//    {
//        return name.hashCode()+id.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Employee u=(Employee) obj;
//        if(obj == this)
//            return true;
//        return u.name.equals(name) && u.id.equals(id);
//    }
}

