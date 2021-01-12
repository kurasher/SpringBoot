import java.util.Optional;

public class Test {
    public  static void main(String[] args){
        String str = null;

        Optional<String> strOpt = Optional.ofNullable(str);

        if(strOpt.isPresent()){
            String message = strOpt.get();
            System.out.println(message);
        }else{
            System.out.println("message is null");
        }

        strOpt.ifPresent(v -> System.out.println(v.length()));
    }
}
