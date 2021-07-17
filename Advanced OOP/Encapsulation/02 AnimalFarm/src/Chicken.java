public class Chicken {
    private String name;
    private int age;
    private double productPerDay;

    public Chicken(String name, int age) {
       this. setName(name);
       this. setAge(age);
       calculateProductPerDay();
    }

    private void setName(String name) {
            if(name.length()<1 || name.equals(" ")||name.equals(null)){
           throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age<0||age>15){
           throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return this.calculateProductPerDay();
    }
    private double  calculateProductPerDay() {
        if (this.age >= 0 && age <= 5) {
           return this.productPerDay = 2.00;
        }
        else if(age>=6&&age<=11){
            return this.productPerDay=1.00;
        }
        return this.productPerDay=0.75;
    }
    @Override
   public String toString(){
       StringBuilder br=new StringBuilder();
       br.append("Chicken "+this.name+" (age "+this.age+") can produce ");
       br.append(String.format("%.2f",productPerDay()));
       br.append(" eggs per day.");
       return br.toString().trim();
    }
}
