public class NameEncoderDecoder {
    public String encode(String name){
      String replace1 = name.replace("e", "1");
      String replace2 = replace1.replace("u", "2");
      String replace3 = replace2.replace("i", "3");
      String replace4 = replace3.replace("o", "4");
      String replace5 = replace4.replace("a", "5");
      return "NOTFORYOU" + replace5 + "YESNOTFORYOU";
    }
    public String decode(String name) {
      String replace1 = name.replace("NOTFORYOU", "");
      String replace2 = replace1.replace("YESNOTFORYOU", "");
      String replace3 = replace2.replace("1", "e");
      String replace4 = replace3.replace("2", "u");
      String replace5 = replace4.replace("3", "i");
      String replace6 = replace5.replace("4", "o");
      String replace7 = replace6.replace("5", "a");
      return replace7.replace("YES", "");    
    }
}
