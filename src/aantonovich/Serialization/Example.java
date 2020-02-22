package aantonovich.Serialization;

import java.io.*;  // НЕ РАБОТАЕТ, НЕ МОЖЕТ ДЕСЕРИАЛИЗОВАТЬ (aantonovich.Serialization.Person@49c2faae)

public class Example {
  // private static final File FILE_DIRECTORY = new File("src" +File.separator+ "aantonovich"+ File.separator+ "Serializable");
    private static final String FILE = "person.txt";
    public static void main (String[] args) throws ClassNotFoundException {


        Person person = new Person("Chack", "Norris", 33);
         try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream (FILE))){
             outputStream.writeObject(person);
         } catch (IOException e){
             e.printStackTrace();
         }
         try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE))){
             Person fromFile = (Person) inputStream.readObject();
             System.out.println(fromFile);
         } catch (IOException e){
             e.printStackTrace();
         }
    }
}