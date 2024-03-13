package UserPackage;
import java.util.Scanner;
import TaskPackage.Task;
public class User {
    private String username ;
    private String password ;
    public String first_name ;
    public String last_name ;
    public String email ;
    public int streak ;

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String user_name){
        username = user_name ;
    }
    public String getFullName(){
        String neww = first_name+last_name;
        return neww;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String passsword){
        password=password;
    }
    public void set_data (String first_namee, String last_namee, String emaill){
        first_name=first_namee;
        last_name=last_namee;
        email=emaill;
    }
    public User (String username, String password, String first_name, String last_name, String email){
        setUsername(username);
        setPassword(password);
        set_data (first_name, last_name, email);
    }
    public Task createTask(){
        Scanner input= new Scanner (System.in);
        String newtask= input.next();
        Task task1 = new Task(newtask);
        input.close();
        return task1;
    }
}
