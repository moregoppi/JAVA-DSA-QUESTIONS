public class interfaces{
    public static void main(String[] args) {
        // Queen q1=new Queen();
        // q1.moves();
         Bear b1=new Bear();
         b1.eat();
         b1.meateat();
    }
}
// interface Chessplayer{
//     void moves();
// }
// class Queen implements Chessplayer{
//     public void moves(){
//         System.out.println("up, down, left right diagonally in all directions");
//     }
// }
// class King implements Chessplayer{
//     public void moves(){
//         System.out.println("up, down, left right diagonally in all directions -(but only one step");
//     }
// }
interface Herbivorus{
    void eat();
}
interface Carnivorus{
    void meateat();
}
class Bear implements Herbivorus, Carnivorus{
    public void eat(){
        System.out.println("eats grass also");
    }
    public void meateat(){
        System.out.println("also eats meat");
    }
}
