import java.util.List;

public class Smartphone implements Callable,Browsable{
   private  List<String>numbers;
    private List<String>urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

   @Override
    public String call(){
        StringBuilder br=new StringBuilder();
        for(int i=0;i<numbers.size();i++){
            boolean isAlphabetic=false;
            String current=numbers.get(i);
            for(int j=0;j<current.length();j++){
                if(current.charAt(j)>='A'&&current.charAt(j)<='z'){
                    br.append("Invalid number!");
                    isAlphabetic=true;
                    break;
                }
            }
          if(isAlphabetic==false){
                br.append("Calling... ");
                br.append(current);
            }
          br.append("\n");
        }
        return br.toString().trim();
   }
   @Override
    public String browse(){
       StringBuilder br=new StringBuilder();
       for(int i=0;i<urls.size();i++){
           boolean isDigit=false;
           String current=urls.get(i);
           for(int j=0;j<current.length();j++){
               if(current.charAt(j)>='0'&&current.charAt(j)<='9'){
                   br.append("Invalid URL!");
                   isDigit=true;
                   break;
               }
           }
           if(isDigit==false){
               br.append("Browsing: ");
               br.append(current);
               br.append("!");
               br.append("\n");
           }

       }
       return br.toString().trim();
   }
}
