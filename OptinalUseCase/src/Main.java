import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Customer customer =new Customer(101,"paul","paul@gmail.com", Arrays.asList("9876543222","9876543211"));
//        Customer customer2 =new Customer(101,"paul",null, Arrays.asList("9876543222","9876543211"));
//
//        // static method of Optional for creating optional object
//        // Optional.empty() for customer
////        System.out.println("Optional.empty():"+Optional.empty());
////
////        // Optional.of()
////        System.out.println("Optional.of():"+Optional.of(customer.getEmail()));
////
////        // Optional.ofNullable()
////        System.out.println("Optional.ofNullable():"+Optional.ofNullable(customer.getEmail()));
////
////         // Optional.empty() for customer2
////        System.out.println("For Customer with null value --------------");
////        System.out.println("Optional.empty():"+Optional.empty());
//
//        // Optional.of()
////        System.out.println("Optional.of():"+Optional.of(customer2.getEmail()));
//
//        // Optional.ofNullable()
////        System.out.println("Optional.ofNullable():"+Optional.ofNullable(customer2.getEmail()));
//
//
//        Optional<String> optionalObj=Optional.ofNullable(customer.getEmail());
//        Optional<String> optionalObj2=Optional.ofNullable(customer2.getEmail());
//        // Optional.isPresent()
//        if(optionalObj.isPresent()){
//
//            System.out.println("Get value:"+optionalObj.get());
//        }

//        System.out.println("Optional default else value:"+optionalObj.orElse("default@gmail.com"));
//        System.out.println("Optional default else throw exception:"+optionalObj2.orElseThrow(()->new IllegalArgumentException("Email not provided")));
//        System.out.println("String to Uppercase, it returns optional type string "+optionalObj.map(String::toUpperCase));
//        System.out.println("String to Uppercase "+optionalObj.map(String::toUpperCase).orElse("default@gmail.com"));
//        System.out.println("String to Uppercase2 "+optionalObj2.map(String::toUpperCase).orElseGet(() -> "default@gmail.com"));

//        System.out.println("Get customer by email:"+ getCustomerByEmail("kono@gmail.com"));
        System.out.println("Get customer by email: "+ getCustomerByEmail("kono@gmail.com").toString());
    }

     static Customer getCustomerByEmail(String email){
       List<Customer> customers=CustomerDatabase.getAll();
//        return customers
//                .stream()
//                .filter(customer -> customer.getEmail().equals(email))
//                .findAny()
//                .orElse(new Customer(000,"empty","no@gmail.com",Arrays.asList("000","0000")));
        return customers
                .stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Could not find customer by email"));
    }


}