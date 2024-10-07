public class Authentication {
    public static void main(String[] args){
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        if (!isLoggedIn){
            System.out.println("Failed to log in");
        }else if (isLoggedIn && !hasPermission){
            System.out.println("Failed to login");
        }else{
            System.out.println("login successfull and permission is granted");
        }
    }   
}
    
