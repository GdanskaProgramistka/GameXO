public class Position {

    private int positionX;
    private int positionY;

    public Position(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
// try to check that position is a number:
    /*public static boolean IsNumber(int positionX, int positionY) {
        if ((positionX == int && positionY == int){
            return true;
        }
        else {
            return false;
            System.out.println("Position is not a number. Please enter the correct position.");
        }
    }*/
}
