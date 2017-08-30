package entities.Builder;

import entities.factoryMethod.ValidUser;

/**
 * Created by Sona_Gamaryan on 7/17/2017.
 */
public class User extends ValidUser {
    private static final String PASSWORD ="epam1234.";
    private static final String LOGIN ="epam0333";
    private String firstName; //
    private String lastName; //
    private String age;// optional

    public String getPassword(){
       return PASSWORD;
   }

    public String getLogin() {

        this.FactoryMethod();
        return LOGIN;
    }

    public void FactoryMethod() {
        System.out.println("userName is valid");
    }

    private User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String age;


        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(String age){
            this.age =age;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
}
