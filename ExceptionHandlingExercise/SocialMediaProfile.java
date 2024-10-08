public class SocialMediaProfile {
    private String username;
    private int age;
    private String bio;

    public void createProfile(String username, int age, String bio){
        this.username = username;
        this.age = age;
        this.bio = bio;
        
        int charLength = bio.length();

        if (username == null){
                throw new IllegalArgumentException("Username cannot be empty");
        }
        if (age<13 && age>120){
                throw new IllegalArgumentException("Age should be between 13 and 120 only");
        }
        if (charLength > 10){
                throw new IndexOutOfBoundsException("Bio should not exceed 160 characters");
        }
    }

    public static void main(String[] args) {
        SocialMediaProfile cp = new SocialMediaProfile();
        

        try{
            cp.createProfile(null, 12, "Social Media profile");
        }catch (IllegalArgumentException e){
            System.out.println("Error occured: " + e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
