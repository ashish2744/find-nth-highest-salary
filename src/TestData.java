import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestData {

    public static Map<String, Integer> testData() {
        Map<String, Integer> data = new HashMap<>();
        data.put("Ashish", 100000);
        data.put("Aman", 100000);
        data.put("Aakash", 70000);
        data.put("Gautam", 90000);
        data.put("Sanjay", 90000);
        data.put("Gaurav", 90000);
        data.put("Keshav", 150000);
        data.put("Vijay", 100000);
        data.put("Monika", 120000);
        data.put("Himanshu", 120000);

        return data;
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 45000),
                new Employee("David", 60000) // Employee with duplicate salary
        );
    }
}
