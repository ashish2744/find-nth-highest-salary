public class Main {
    public static void main(String[] args) {
        NthHighestSalary.findNthHighestEmployeesSalary(3, TestData.getEmployees()).stream()
                .forEach(e -> System.out.println(e.getName()));

    }


}