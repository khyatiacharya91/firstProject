import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {

//        List<Student> list = new ArrayList<>();
//        Student s = new Student(40,"subahsh");
//        list.add(s);
//
//        Student s1 = new Student(10,"annpurna");
//        list.add(s1);
//
//        Student s2 = new Student(40,"gagan");
//        list.add(s2);
//
//        Student s3 = new Student(14,"khyati");
//        list.add(s3);
//
//        Student s4 = new Student(10,"sapna");
//        list.add(s4);
//
//        Student s5 = new Student(12,"subhash");
//        list.add(s5);
//
        Lambda l =new Lambda();
//      l.mappingTransformation(list);


        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 100.0, "CREDIT"),
                new Transaction(2, 200.0, "Debit"),
                new Transaction(3, 30000.0, "CREDIT"),
                new Transaction(4, 4000.0, "Debit"),
                new Transaction(5, 50099.0, "CREDIT")
        );

//        l.filteringAndCollection(transactions);

//        List<Order> orders = Arrays.asList(
//                new Order(1, 150.0, Order.Status.COMPLETED),
//                new Order(2, 250.0, Order.Status.PENDING),
//                new Order(3, 100.0, Order.Status.CANCELLED),
//                new Order(4, 300.0, Order.Status.COMPLETED),
//                new Order(5, 50.0, Order.Status.PENDING)
//        );

//        l.reductionOperation(orders);

        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0, "Electronics"),
                new Product("Smartphone", 800.0, "Electronics"),
                new Product("Tablet", 500.0, "Electronics"),
                new Product("Desk", 200.0, "Furniture"),
                new Product("Chair", 100.0, "Furniture"),
                new Product("Pen", 1.5, "Stationery"),
                new Product("Notebook", 3.0, "Stationery")
        );

//        l.sortingAndComparing(products);
        List<Book> books = Arrays.asList(
                new Book("Book 1", Arrays.asList("Author A", "Author B")),
                new Book("Book 2", Arrays.asList("Author C")),
                new Book("Book 3", Arrays.asList("Author B", "Author D")),
                new Book("Book 4", Arrays.asList("Author A")),
                new Book("Book 5", Arrays.asList("Author B", "Author C"))
        );
//        l.flatMapAndDistintc(books);

//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "Alice", "HR", 50000),
//                new Employee(2, "Bob", "Engineering", 60000),
//                new Employee(3, "Charlie", "Finance", 55000),
//                new Employee(4, "David", "Engineering", 70000),
//                new Employee(5, "Emily", "Finance", 60000)
//        );

//        l.groupingAndPartitiong(employees);

        List<Invoice> invoices = Arrays.asList(
                new Invoice(1, 100.0, Invoice.Status.PAID),
                new Invoice(2, 7000.0, Invoice.Status.UNPAID),
                new Invoice(3, 150.0, Invoice.Status.UNPAID),
                new Invoice(4, 300.0, Invoice.Status.PAID),
                new Invoice(5, 600.0, Invoice.Status.UNPAID)
        );

//        l.combiningPredicting(invoices);

        List<Integer> numbers = Arrays.asList(10, 20, 3, 4, 5, 6, 7, 8, 9, 10);
//        l.handlingOptionalValue(numbers);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 25, Arrays.asList("Math", "Science", "Cistory")));
        students.add(new Student("Aggice", 25, Arrays.asList("Math", "Science", "History")));
        students.add(new Student("Cbce", 30, Arrays.asList("Math", "Science", "History")));
        students.add(new Student("Bob", 22, Arrays.asList("English", "Art", "Economics")));
        students.add(new Student("Charlie", 21, Arrays.asList("Physics", "Chemistry", "Biology")));
        students.add(new Student("Diana", 23, Arrays.asList("Computer Science", "Math", "Statistics")));
        students.add(new Student("Ethan", 19, Arrays.asList("Literature", "Philosophy", "Sociology")));

//        l.processingStudentData(students);

        List<OrderItem> items1 = new ArrayList<>();
        items1.add(new OrderItem(101, 2, 10.0));
        items1.add(new OrderItem(102, 1, 20.0));

        List<OrderItem> items2 = new ArrayList<>();
        items2.add(new OrderItem(103, 5, 15.0));

        List<OrderItem> items3 = new ArrayList<>();
        items3.add(new OrderItem(104, 1, 50.0));
        items3.add(new OrderItem(105, 3, 30.0));
        items3.add(new OrderItem(106, 2, 25.0));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 1001, LocalDate.of(2023, 6, 1), items1));
        orders.add(new Order(2, 1002, LocalDate.of(2023, 6, 2), items2));
        orders.add(new Order(3, 1001, LocalDate.of(2023, 6, 3), items3));

//        l.processingOrder(items1,items2,items3,orders);

        List<String> strings = Arrays.asList("Java", "python", "javaScript", "C++", "Java SE", "ruby");
//        l.manipulatingstringData(strings);

        List<SensorReading> readings = List.of(
                new SensorReading("K1", LocalDateTime.of(2024, 6, 21, 10, 0), 25.5),
                new SensorReading("S2", LocalDateTime.of(2024, 6, 21, 10, 15), 30.0),
                new SensorReading("S1", LocalDateTime.of(2024, 6, 21, 10, 30), 28.2),
                new SensorReading("S3", LocalDateTime.of(2024, 6, 21, 10, 45), 22.8),
                new SensorReading("S2", LocalDateTime.of(2024, 6, 21, 11, 0), 27.3)
        );
//        l.analysingSensorData(readings);

        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 60000, Set.of("Java", "C++", "Python")),
                new Employee("Bob", "Engineering", 45000, Set.of("Java", "JavaScript")),
                new Employee("Charlie", "HR", 55000, Set.of("Communication", "Recruiting")),
                new Employee("David", "Engineering", 70000, Set.of("Java", "C#", "SQL")),
                new Employee("Eve", "Marketing", 50000, Set.of("SEO", "Content Marketing"))
        );
        l.processingEmpData(employees);
    }

    private void processingEmpData(List<Employee> employees) {
//        List<Employee> emp = employees.stream().filter(s->s.getDepartment().equals("Engineering")).filter(s->s.getSalary() >= 50000).collect(Collectors.toList());
//        emp.forEach(System.out::println);
//        Set<String> emp = employees.stream().flatMap(s->s.getSkills().stream()).collect(Collectors.toSet());
//        emp.forEach(System.out::println);
        OptionalDouble salary=employees.stream().filter(s->s.getSkills().contains("Java")).mapToDouble(s->s.getSalary()).average();
        System.out.println(salary);
    }

    private void analysingSensorData(List<SensorReading> readings) {
        OptionalDouble a = readings.stream().filter(s->s.getSensorId().startsWith("S")).mapToDouble(s->s.getValue()).max();
        System.out.println(a);
//        OptionalDouble a =
//                readings.stream().filter(s->s.getTimestamp().getDayOfYear() ==2024)
//                        .mapToDouble(SensorReading::getValue).average();
        List<Double> list= readings.stream().map(SensorReading::getValue).collect(Collectors.toList());
        list.forEach(System.out::println);
//        System.out.println(list);
    }

    private void manipulatingstringData(List<String> strings) {
//        strings.stream().filter(s->s.equals("Java"));
//        strings.stream().map(String::toUpperCase).collect(Collectors.toList());
//
//        strings.forEach(System.out::println);
        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        Map<Integer, List<String>> abc= strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Uppercase strings: " + abc);
    }


    public void processingOrder(List<OrderItem> items1,List<OrderItem> items2,List<OrderItem> items3, List<Order> orders)
    {
//        double total = orders.stream()
//                .filter(order -> order.getOrderDate().getYear() == 2023)
//                .count();
//        items1.stream().mapToDouble(i1->i1.getQuantity() * (i1.getProductPrice())).max();
//        items2.stream().mapToDouble(i1->i1.getQuantity() * (i1.getProductPrice())).max();
//        items3.stream().mapToDouble(i1->i1.getQuantity() * (i1.getProductPrice())).max();
//
//        orders.stream().mapToDouble(o->o.getOrderItems().stream()
//                .mapToDouble(i1->i1.getQuantity() * (i1.getProductPrice())).sum())
//                .max();


    }

    public void processingStudentData(List<Student> s)
    {
        OptionalDouble age = s.stream().filter(s1->s1.getAge() > 20)
                .filter(s1->s1.getCourses().stream().anyMatch(c->c.startsWith("C")))
                .mapToInt(s1-> s1.getAge()).average();
        System.out.println(age);
//                .filter(s1->s1.getCourses().contains("Math")).collect(Collectors.toList());

//        Stream<String> distinct = st.stream().flatMap(a -> a.getCourses().stream()).distinct();
//       st.forEach(System.out::println);

    }

    public void handlingOptionalValue(List<Integer> numbers)
    {
        Optional<Integer> a = numbers.stream().sorted().findFirst();
        System.out.println(a.get());
    }

    public void combiningPredicting(List<Invoice> invoices)
    {
        List<Invoice> result = invoices.stream()
                .filter(s->s.getAmount() > 500)
                .filter(s->s.getStatus() == Invoice.Status.UNPAID)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }


//    public void mappingTransformation(List<Student> list)
//    {
//         List<String> result = list.stream()
//                 .filter(s->s.getAge() > 25)
//                 .sorted((s1,s2)->s1.getName().compareTo(s2.getName()))
//                         .map(s->s.getName())
//                 .collect(Collectors.toList());
//
//         result.forEach(System.out::println);
//    }

    public void filteringAndCollection(List<Transaction> list)
    {
        List<Integer> result = list.stream()
                .filter(t->t.getType().equals("Debit"))
                .filter(t->t.getAmount() > 1000)
                .map(t->t.getId())
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    public void flatMapAndDistintc(List<Book> book)
    {
        List<String> result = book.stream()
                .flatMap(a->a.getAuthors().stream())
                .distinct()
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

//    public void sortingAndComparing(List<Product> productList)
//    {
//        Map<String, List<Product>> result = productList.stream()
//                .sorted((c1,c2)->c1.getCategory().compareTo(c2.getCategory()))
//                .map(p->p.getPrice())
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toMap(Product::getCategory,Product::getName))
//    }

//    public void reductionOperation(List<Order> list)
//    {
//        double sum = list.stream().filter(o->o.getStatus() == Order.Status.COMPLETED)
//                        .map(o->o.getTotalAmount())
//                                .collect(Collectors.summingDouble(Double::doubleValue));
//        System.out.println(sum);
//    }

//    public void groupingAndPartitiong(List<Employee> employees )
//    {
//        Map<String, Double> collect = employees.stream()
//                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.averagingDouble(e -> e.getSalary())));
//        collect.forEach((k,v)-> System.out.println(k+":"+v));
//    }


}

class Student {
    private String name;
    private int age;
    private List<String> courses;

    public Student(String name, int age, List<String> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student(name=" + name + ", age=" + age + ", courses=" + courses + ")";
    }

    // Getters and setters can be added if needed
}


class Transaction {
    public enum Type {
        CREDIT, DEBIT
    }

    private int id;
    private double amount;
    private String type;

    // Constructor, getters, and setters
    public Transaction(int id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", amount=" + amount + ", type=" + type + "}";
    }
}

class Product {
    private String name;
    private double price;
    private String category;

    // Constructor, getters, and setters
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}

class Book {
    private String title;
    private List<String> authors;

    // Constructor, getters, and setters
    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', authors=" + authors + "}";
    }
}
// class Employee {
//    private int id;
//    private String name;
//    private String department;
//    private double salary;

    // Constructor, getters, and setters
//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
//    }
//}

class Invoice {
    public enum Status {
        PAID, UNPAID
    }

    private int id;
    private double amount;
    private Status status;

    // Constructor, getters, and setters
    public Invoice(int id, double amount, Status status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Invoice{id=" + id + ", amount=" + amount + ", status=" + status + "}";
    }
}

class OrderItem {
    private int productId;
    private int quantity;
    private double productPrice;

    public OrderItem(int productId, int quantity, double productPrice) {
        this.productId = productId;
        this.quantity = quantity;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getTotalValue() {
        return quantity * productPrice;
    }

    @Override
    public String toString() {
        return "OrderItem(productId=" + productId + ", quantity=" + quantity + ", productPrice=" + productPrice + ")";
    }
}

class Order {
    private int orderId;
    private int customerId;
    private LocalDate orderDate;
    private List<OrderItem> orderItems;

    public Order(int orderId, int customerId, LocalDate orderDate, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotalValue() {
        return orderItems.stream().mapToDouble(OrderItem::getTotalValue).sum();
    }

    @Override
    public String toString() {
        return "Order(orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate + ", orderItems=" + orderItems + ")";
    }
}

class SensorReading {
    private String sensorId;
    private LocalDateTime timestamp;
    private double value;

    public SensorReading(String sensorId, LocalDateTime timestamp, double value) {
        this.sensorId = sensorId;
        this.timestamp = timestamp;
        this.value = value;
    }

    public String getSensorId() {
        return sensorId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }

}


class Employee {
    private String name;
    private String department;
    private double salary;
    private Set<String> skills;

    public Employee(String name, String department, double salary, Set<String> skills) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Set<String> getSkills() {
        return skills;
    }
}
