package Noyau;
public class Administrateur {
    public static boolean authentifier(String userName,String motDePasse){
        return (userName.equals("admin") && motDePasse.equals("admin"));
    }
}
