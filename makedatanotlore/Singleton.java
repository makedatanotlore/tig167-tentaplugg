package makedatanotlore;

public class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton instance(){
        System.out.println("Singleton.instance(): START");
        System.out.println("- returning instance");
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
