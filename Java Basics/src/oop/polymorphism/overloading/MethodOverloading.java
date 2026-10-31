package oop.polymorphism.overloading;

class PlayerRating{
    private int playerPosition;
    private String playerName;
    private float criticOneRating;
    private float criticTwoRating;
    private float criticThreeRating;
    private float averageRating;
    private char category;

    PlayerRating(int playerPosition, String playerName){
        this.playerPosition=playerPosition;
        this.playerName=playerName;
    }
    //method overloading - same method name with different parameter passed.
    void calculateAverage(float  criticOneRating,float  criticTwoRating){
        this.averageRating=(criticOneRating+criticTwoRating)/2;
    }

    void calculateAverage(float criticOneRating,float criticTwoRating,float criticThreeRating){
        this.averageRating=(criticOneRating+criticTwoRating+criticThreeRating)/3;
    }
    void calculateCategory(){
        if(averageRating>8){
            this.category='A';
        }else if (averageRating>5){
            this.category='B';
        }else{
            this.category='C';
        }
    }
    void display(){
        System.out.println("Player Rating");
        System.out.println("Player Name: "+this.playerName);
        System.out.println("Player Position: "+this.playerPosition);
        System.out.println("Average Rating: "+this.averageRating);
        System.out.println("Category: "+this.category);
    }
}
public class MethodOverloading {
    //Compile-Time (Static) Polymorphism
    static void main(String[] args) {
        PlayerRating playerRating = new PlayerRating(1,"Devesh");
        playerRating.calculateAverage(9,9.9f);
        playerRating.calculateCategory();
        playerRating.display();
    }
}
