
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> liquid = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(liquid::offer);

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        String[] arr = sc.nextLine().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            ingredients.push(Integer.parseInt(arr[i]));
        }

        TreeMap<String, Integer> baker = new TreeMap<>();
        baker.put("Bread", 0);
        baker.put("Cake", 0);
        baker.put("Pastry", 0);
        baker.put("Fruit Pie", 0);
        while (!ingredients.isEmpty() && !liquid.isEmpty()) {
            int first = ingredients.pop();
            int second = liquid.pop();
            int sum = first + second;
            boolean iscook=false;
            if ((sum == 25)) {
                baker.put("Bread", baker.get("Bread") + 1);
                iscook=true;
            } else if (sum == 50) {
                baker.put("Cake", baker.get("Cake") + 1);
                iscook=true;
            }
            else if(sum==75)
            {
                baker.put("Pastry", baker.get("Pastry") + 1);
                iscook=true;
            }
            else if(sum==100){
                baker.put("Fruit Pie", baker.get("Fruit Pie") + 1);
                iscook=true;
            }
            if(iscook==false){
                ingredients.push(first+3);
            }
        }
           boolean isEmptyMap=false;
        for(Map.Entry<String,Integer> f:baker.entrySet()){
            if(f.getValue()==0){
                isEmptyMap=true;
                break;
            }
        }
        if(isEmptyMap==false){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
            if(!liquid.isEmpty()){
                System.out.print("Liquids left: ");
                System.out.println(liquid.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            }
            else {
                System.out.println("Liquids left: none");


            }
            if(!ingredients.isEmpty()){
                System.out.print("Ingredients left: " );

                System.out.print (ingredients.stream().map(String::valueOf).collect(Collectors.joining(", ")));

                System.out.println();
            }
            else {
                System.out.println("Ingredients left: none");
            }
            for(Map.Entry<String,Integer> f: baker.entrySet()){
                System.out.println(f.getKey()+": "+f.getValue());
            }
        }
        else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
            if(!liquid.isEmpty()){
                System.out.print("Liquids left: none");
                liquid.stream().map(String::valueOf).collect(Collectors.joining(", "));
            }
            else {
                System.out.println("Liquids left: none");
            }
            if(!ingredients.isEmpty()){
                System.out.print("Ingredients left: " );

                System.out.print (ingredients.stream().map(String::valueOf).collect(Collectors.joining(", ")));

                System.out.println();
            }
            else {
                System.out.println("Ingredients left: none");
            }
            for(Map.Entry<String,Integer> f: baker.entrySet()){
                System.out.println(f.getKey()+": "+f.getValue());
            }
        }
    }
}
