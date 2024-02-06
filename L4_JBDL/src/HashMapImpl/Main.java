package HashMapImpl;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String,String> map = new CustomHashMap<>();
        map.put("Delhi","Delhi");
        map.put("UP", "Lucknow");

        System.out.println(map.get("UP"));
        System.out.println(map.size);
        System.out.println(map.isEmpty());
        map.remove("Delhi");
        System.out.println(map.size());
    }
}
