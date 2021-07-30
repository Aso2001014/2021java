public class Ship{
    private int x;
    private int y;
    private int hp;
  
    public static String　shiphp(int hp){
        if(hp > 0){
            return "生きている"
        }else{
            return "撃沈"

        }
    }
