public class NumbersLoops{
    public NumbersLoops(){
      int x = 0;
      while (x<11){
        System.out.println(x);
        x++;

      }
      System.err.println(x);
      for(int x2 = 0; x2 <11; x2++){
        
      }
    }
  
    public int digitSum(int num){
     int sum = 0;
     int x = 0;
     while (x<num){
      sum = sum + ++x;
     }
     return(sum);
    }
  
    public int reverseNum(int num){
      //123 mod 10 is 3
      //123 / 10 is 12
      //12 mod 10 is 2
      // 12/10 is 1
      int newNum = 0;
      int y =0;
      while (num != 0){
        y = num%10;
        newNum = (newNum * 10) + y;
        num = num /10;
      }


      return newNum;
      
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int x = 0;
      int y = start;
      int count = 0;
      while ( x <= finish - start){
        x++;
        y++;
        if (y == reverseNum(y)){
          count ++;
        }
      }
      return count;
    }
    public int ForpalindromeCount(int start, int finish){
      int count =0;
      for (int i = start; i < finish; i++){
        if (i == reverseNum(i)){
          count ++;
        }
      }
  return count;
  }

}
    
