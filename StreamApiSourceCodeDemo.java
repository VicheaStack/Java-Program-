package Learn.concepts.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        // // Example data
        // List<Integer> numbers = Arrays.asList(31, 88, 12, 8, 24, 54);
        // List<String> names = Arrays.asList("John", "Jane", "Jack", "DaeWon");

        // // Creating Address objects
        // Address address = new Address("Tokyo", "Japan");
        // Address address1 = new Address("Phnom Penh", "Cambodia");
        // Address address2 = new Address("New York", "USA");
        // Address address3 = new Address("Jakarta", "Indonesia");

        // // Creating MapOfObjectExample (Person) objects
        // MapOfObjectExample person = new MapOfObjectExample("John", 24, address);
        // MapOfObjectExample person1 = new MapOfObjectExample("Young", 20, address1);
        // MapOfObjectExample person2 = new MapOfObjectExample("Jane", 28, address2);
        // MapOfObjectExample person3 = new MapOfObjectExample("Kim", 21, address3);

        // // Creating a list of people
        // List<MapOfObjectExample> people = Arrays.asList(person, person1, person2, person3);

        // // Filter and map example: addresses in Japan
        // List<Address> addressesInJapan = people.stream()
        //     .filter(n -> "Japan".equalsIgnoreCase(n.getAddress().getCountry()))  // Filter people whose country is Japan
        //     .map(MapOfObjectExample::getAddress)  // Map each person to their address
        //     .collect(Collectors.toList());  // Collect the addresses into a list

        // System.out.println("Addresses in Japan: " + addressesInJapan);

        // Example stream operations

        // Filter even numbers
        /*
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)  // Filter even numbers
            .peek(n -> System.out.println("Even number: " + n))  // Print each even number
            .collect(Collectors.toList());  // Collect the even numbers into a list
        System.out.println("The result of even numbers: " + evenNumbers);
        */

        // Filter names starting with 'J'
        /*
        List<String> filteredNames = names.stream()
            .peek(name -> System.out.println("Processing: " + name))  // Print each name
            .filter(name -> name.startsWith("J"))  // Filter names starting with 'J'
            .collect(Collectors.toList());  // Collect the filtered names into a list
        System.out.println("Names starting with J: " + filteredNames);
        */

        // Map to squared numbers
        /*
        List<Integer> squaredNumbers = numbers.stream()
            .map(n -> n * n)  // Map each number to its square
            .collect(Collectors.toList());  // Collect the squared numbers into a list
        System.out.println("Square of numbers: " + squaredNumbers);
        */

        // Map names to uppercase
        /*
        List<String> uppercaseNames = names.stream()
            .map(String::toUpperCase)  // Map each name to its uppercase version
            .collect(Collectors.toList());  // Collect the uppercase names into a list
        System.out.println("Uppercase names: " + uppercaseNames);
        */

        // Map names to their lengths
        /*
        List<Integer> nameLengths = names.stream()
            .map(String::length)  // Map each name to its length
            .collect(Collectors.toList());  // Collect the lengths into a list
        System.out.println("Name lengths: " + nameLengths);
        */

        // Sorting numbers
        /*
        List<Integer> sortedNumbers = numbers.stream()
            //.sorted((a, b) -> b - a) // Uncomment for descending order
            .collect(Collectors.toList());  // Collect the sorted numbers into a list
        System.out.println("Sorted numbers: " + sortedNumbers);
        */

        // Sorting people by age
        /*
        List<MapOfObjectExample> sortedByAge = people.stream()
            .sorted(Comparator.comparing(MapOfObjectExample::getAge))  // Sort people by age
            .collect(Collectors.toList());  // Collect the sorted people into a list
        System.out.println("Sorted by age: " + sortedByAge);
        */

        // Sorting people by name
        /*
        List<MapOfObjectExample> sortedByName = people.stream()
            .sorted(Comparator.comparing(MapOfObjectExample::getName))  // Sort people by name
            .collect(Collectors.toList());  // Collect the sorted people into a list
        System.out.println("Sorted by name: " + sortedByName);

        sortedByName.forEach(n -> System.out.println(n.getName()));  // Print each name
        */


        //reduce
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // int sum = numbers.stream()
        // .reduce(0, (a, b) -> a + b); // Identity = 0, accumulator adds numbers

        // System.out.println("Sum: " + sum);

    }
}
