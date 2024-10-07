public class DataTypeArray {
    public static void main(String[] args) {

        int[] intArr = new int[2];
        double[] doubleArr = new double[2];
        char[] charArr = new char[2];
        boolean[] booleanArr = new boolean[2];
        String[] stringArr = new String[2];


        System.out.print("\nDefault Value for Int Array: ");
        for(int i=0; i<intArr.length; i++){
            System.out.print(intArr[0]+ " ");
        }

        System.out.print("\nDefault Value for Double Array: ");
        for(int i=0; i<doubleArr.length; i++){
            System.out.print(doubleArr[0]+ " ");
        }

        System.out.print("\nDefault Value for Char array: ");
        for(int i=0; i<charArr.length; i++){
            System.out.print(charArr[0] + " ");
        }

        System.out.print("\nDefault Value for Boolean Array: ");
        for(int i=0; i<booleanArr.length; i++){
            System.out.print(booleanArr[0] + " ");
        }

        System.out.print("\nDefault Value for String Array: ");
        for(int i=0; i<stringArr.length; i++){
            System.out.print(stringArr[0] + " ");
        }
    }
    
}
