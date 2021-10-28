import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Long> nameToNumber = new HashMap<>();
        nameToNumber.put("Indy", 9341234L);
        nameToNumber.put("joe", 7431234L);
        nameToNumber.put("Assa", 5341764L);
        nameToNumber.put("Inco", 3340984L);
        nameToNumber.put("Vaso", 6654234L);
        System.out.println(nameToNumber);
        Long oldVFal = nameToNumber.put("Indy", 1123490L);
        System.out.println(nameToNumber);
        nameToNumber.putIfAbsent("Ivy", 42345432L);
        System.out.println(nameToNumber);

        Long jNum = nameToNumber.get("joe");
        System.out.println(jNum);
        Long unknownNum = nameToNumber.get("asdas");
        System.out.println(unknownNum);
        unknownNum = nameToNumber.getOrDefault("asd", 0L);
        System.out.println(unknownNum);

        System.out.println(nameToNumber.size());
        System.out.println(nameToNumber.keySet());
        System.out.println(nameToNumber.values());
    }
}
