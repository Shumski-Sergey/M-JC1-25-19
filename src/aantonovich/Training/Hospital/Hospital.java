//package aantonovich.Training.Hospital;
//
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Stream;
//
//import static java.util.function.Predicate.isEqual;
//
//public class Hospital {
//    public static void main(String[] args) {
//
//        List<Patient> patients = List.of(
//         new Patient("Иванов" , "Сергей", 35, true),
//         new Patient("Петров", "Иван", 26, true),
//         new Patient("Сидоров", "Петр", 30, false));
//        Stream<Patient> stream = patients.stream();
//        stream.forEach(System.out::println);
//
//
////        static void recordOnTheFileLibrary(){
////        Scanner sc = new Scanner(System.in) ;
////            System.out.println("Enter surname: ");
////            patient1.setSurname(sc.nextLine());
////            System.out.println("Enter name: ");
////            patient1.setName(sc.nextLine());
////            System.out.println("Enter age: ");
////            patient1.setAge(Integer.parseInt(sc.nextLine()));
////            System.out.println("Have a flu shot(true or false) ???");
////            patient1.setFluShot(Boolean.parseBoolean(sc.nextLine()));
////        }
////
////        System.out.println("Пациент " + patient1.getSurname()+" " + patient1.getName() + " - " + "Возраст = " + patient1.getAge());
//
//        System.out.println("Search by name. Enter surname: ");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//
//        stream.filter(isEqual(s)).forEach(System.out::println) ;
//
//            }
//    }
