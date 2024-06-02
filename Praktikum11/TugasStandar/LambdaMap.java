import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mahasiswaMap = new HashMap<Integer, String>();

        mahasiswaMap.put(1, "Adi");
        mahasiswaMap.put(2, "Bambang");
        mahasiswaMap.put(3, "Cici");
        mahasiswaMap.put(4, "Didi");

        mahasiswaMap.forEach((NIM, nama) -> System.out.println(NIM + ": " + nama));
    }
}