public class Box {
    private double height;
    private double length;
    private double width;

    public Box(double _length,double _width,double _height){
        setLength(_length);
        setWidth(_width);
        setHeight(_height);
    }
    private void setHeight(double height) {
        if(height<=0){
           throw new IllegalArgumentException("Height cannot be zero or negative.");

        }
        this.height = height;
    }

    private void setLength(double length) {
        if(length<=0){
          throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width<=0){
           throw new IllegalArgumentException("Width cannot be zero or negative.");

        }
        this.width = width;
    }

    public final double getHeight() {
        return height;
    }

    public final double getLength() {
        return length;
    }

    public final double getWidth() {
        return width;
    }
    public double calculateSurfaceArea (){
       double surfaceArea=2*getLength()*getHeight()
                         +2*getHeight()*getWidth()
                         +2*getWidth()*getLength();
        return surfaceArea;
    }
    public double calculateLateralSurfaceArea (){
        double lateralSurfaceArea=(2*getLength()*getHeight())
                                 +(2*getHeight()*getWidth());
        return lateralSurfaceArea;
    }
    public double calculateVolume (){
        return  getWidth()*getHeight()*getLength();
    }
}
