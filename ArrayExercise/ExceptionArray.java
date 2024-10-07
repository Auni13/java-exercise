public class ExceptionArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num:numbers){
                System.out.println(num);
        }

        try{
            System.out.println(numbers[7]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }
    }
}
