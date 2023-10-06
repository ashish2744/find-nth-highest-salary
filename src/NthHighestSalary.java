import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static List<Employee> findNthHighestEmployeesSalary(int n, List<Employee> employees) {

        if (n >= employees.size()) {
            throw new IllegalArgumentException("Value of nth salary can't be equal or greater than : "+employees.size());
        }

        double highestSalary = employees.stream().
                map(employee -> employee.getSalary())
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList()).get(n-1);

        if (n <= employees.size()) {

            // Find all employees with the nth highest salary
            return employees.stream()
                    .filter(e -> e.getSalary() == highestSalary)
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList(); // Return an empty list if there are not enough employees.
        }

    }

    public static Map.Entry<Integer, List<String>> findNthHighestSalary(int number, Map<String, Integer> data) {
        return data.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(number - 1);
    }

}