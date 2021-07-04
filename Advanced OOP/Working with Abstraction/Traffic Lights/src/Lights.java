public enum Lights {
    RED(0),
    GREEN(1),
    YELLOW(2);
   public int index;
      Lights(int index){
        this.index=index;
    }
 public    int getIndex(){
        return this.index;
    }
}
