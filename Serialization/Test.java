import com.fasterxml.jackson.databind.ObjectMapper;
public class Test {
    public static void main(String[] args) {
        String brand="{\"User name\":\"Kuldeep\",\"age\":\"21\",\"mail\":\"Kuldeep@gmail.com\"}";
        System.out.println(brand);
        ObjectMapper mapper=new ObjectMapper();
        user u=mapper.readValue(brand,user.class);
    }
    class user{
        String name;
        String mail;
        int age;
    }
}
