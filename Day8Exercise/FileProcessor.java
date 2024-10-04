import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<Integer> readFile(String fileName) throws IOException{
        List<Integer> numbers = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while((line = br.readLine()) != null){ //read line by line
            try{
                int number = Integer.parseInt(line);
                numbers.add(number);
            }catch (NumberFormatException e){
                System.out.println("Invalid number format: " + line);
            }
        }
        return numbers;
    }

    public List<String>divideNumbers(List<Integer> numbers, int divisor){
        List<String> results = new ArrayList<>();

        for(Integer number:numbers){
            if(number == null){
                results.add("Invalid number format");
            }else{
                try{
                    if (number == 0){
                        results.add("Division by zero error for number " + number);
                    }else {
                        results.add(String.valueOf(number/divisor));
                    }
                }catch (ArithmeticException e){
                    results.add("Division by zero error for number " + number);
                }
            }
        }
        return results;
    }

    public void writeFile(String fileName, List<String> results) throws IOException{
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            for (String result : results){
                bw.write(result);
                bw.newLine();
            }
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        Scanner sc = new Scanner(System.in);

        try{
            List<Integer> numbers = processor.readFile("input.txt");
            System.out.println("Enter a divisor: ");
            int divisor = sc.nextInt();

            List<String> results = processor.divideNumbers(numbers, divisor);
            processor.writeFile("output.txt", results);
        }catch (IOException e){
            System.err.println("File error: " + e.getMessage());
        }catch (InputMismatchException e) {
            System.err.println("Invalid input");
        }
    }
}
