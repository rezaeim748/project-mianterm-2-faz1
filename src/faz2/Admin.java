package faz2;

public class Admin {
    private String username ;
    private String password ;
    private String[] meals ;

    public Admin (String username, String password){
        this.username = username ;
        this.password = password ;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getMeals() {
        return meals;
    }

    public void setPassword (String password){
        this.password = password ;
    }

    public void setMeals (String[] meals){
        this.meals = meals ;
    }

}
