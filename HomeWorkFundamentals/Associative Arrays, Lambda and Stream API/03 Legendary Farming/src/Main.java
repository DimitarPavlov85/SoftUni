import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isNextLine = true;
        Map<String, Integer> base = new HashMap<>();
        //base.put("fragments",0);
        base.put("shards",0);
        base.put("motes",0);

        Map<String, Integer> junk = new TreeMap<>();
        List<String> line = new ArrayList<>();
        while (isNextLine == true) {
            line = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
            int currentValue = 0;
            String typeOfMaterial = "";
            for (int i = 0; i < line.size(); i++) {
                boolean isAPir = false;
                if (i % 2 == 0) {
                    currentValue = Integer.parseInt(line.get(i));
                }
                if (i % 2 != 0) {
                    typeOfMaterial = typeOfMaterial = line.get(i).toLowerCase();
                    isAPir = true;
                }
                if (isAPir == true) {
                    if (typeOfMaterial.equals("shards") || typeOfMaterial.equals("fragments")
                            || typeOfMaterial.equals("motes")) {
                        Integer isAdd = base.get(typeOfMaterial);
                        if (isAdd == null) {
                            base.put(typeOfMaterial, currentValue);
                        } else {
                            base.put(typeOfMaterial, base.get(typeOfMaterial) + currentValue);
                        }

                        if (base.get(typeOfMaterial) >= 250) {
                            if (typeOfMaterial.equals("motes")) {
                                System.out.println("Dragonwrath" + " obtained!");
                                base.put(typeOfMaterial, base.get(typeOfMaterial) - 250);
                            } else if (typeOfMaterial.equals("fragments")) {
                                System.out.println("Valanyr" + " obtained!");
                                base.put(typeOfMaterial, base.get(typeOfMaterial) - 250);
                            } else if (typeOfMaterial.equals("shards")) {
                                System.out.println("Shadowmourne" + " obtained!");
                                base.put(typeOfMaterial, base.get(typeOfMaterial) - 250);
                            }
                            isNextLine = false;
                            break;
                        }
                    } else {
                        Integer isAdd = junk.get(typeOfMaterial);
                        if (isAdd == null) {
                            junk.put(typeOfMaterial, currentValue);
                        } else {
                            junk.put(typeOfMaterial, junk.get(typeOfMaterial) + currentValue);
                        }
                    }
                }
            }
        }
        base.entrySet().stream().sorted((a, b) -> {
            int compare = (b.getValue().compareTo(a.getValue()));
            if (compare == 0) {
                compare = a.getKey().compareTo(b.getKey());
            }
            return compare;
        }).forEach(a -> System.out.println(a.getKey() + ": " + a.getValue()));
        junk.entrySet().stream()
                .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
