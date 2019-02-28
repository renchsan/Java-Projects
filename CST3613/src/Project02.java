public class Project02 {
    public static void main(String[] args) {

        GeometricObject[] geoObjArray = {
                new Square("black", true, 3 ),
                new Square("blue", true, 3),
                new Square("purple", false, 7),
                new Square("gray", true, 2),
                new Square("red", false, 5)
        };

        for(int i = 0; i< geoObjArray.length; i++){
            if(geoObjArray[i] instanceof Square){
                Square square = (Square) geoObjArray[i];
                System.out.println("Object " + (i+1) + ": ");
                square.howToColor();
            }
            else System.out.println("Object " + (i+1) + ": Not able to Color");
        }
    }
}