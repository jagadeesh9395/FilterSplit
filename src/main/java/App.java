import com.google.common.base.Splitter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class App {
    public  static  final  String EQ=" eq ";
    public static void main(String[] args) throws UnsupportedEncodingException {

        String filter = "batchCode%20eq%20RTY45%26payGroup%20eq%2055P";
        String decodeFilter = URLDecoder.decode(filter, StandardCharsets.UTF_8.name());
        System.out.println("decodeFilter :" + decodeFilter);

        Map<String, String> map = Splitter.on("&").withKeyValueSeparator(EQ).split(decodeFilter);
        System.out.println(map.get("batchCode"));
        System.out.println(map.get("payGroup"));
    }
}
