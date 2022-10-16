import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

   public static List<Customer> getAll(){
       return Stream.of(
               new Customer(101,"john","john@gmail.com",Arrays.asList("123")),
               new Customer(101,"parbati","parbati@gmail.com",Arrays.asList("123")),
               new Customer(101,"yaku","yaku@gmai.com",Arrays.asList("123"))
       ).collect(Collectors.toList());
   }
}
