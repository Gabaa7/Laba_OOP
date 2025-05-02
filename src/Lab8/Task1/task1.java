package Lab8.Task1;

public class task1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Artur", 18, 9999);

        System.out.println("Перед змінною:");
        System.out.println(employee.getName() + " " + employee.getAge());

        employee.setName("Gaba");
        employee.setAge(25);

        System.out.println("Після змінни:");
        System.out.println(employee.getName() + " " + employee.getAge());
    }
}