class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
      int row = 0, column = 0;
        for(String command : commands){
            if(command.equals("UP")){
                row--;
            }
            else if(command.equals("RIGHT")){
                column++;
            }
            else if(command.equals("DOWN")){
                row++;
            }
            else{
                column--;
            }
        }
        return (row *n) +column;   
    }
}