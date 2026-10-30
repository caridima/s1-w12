public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
      return count;

    }
  
    public String copy(String s, int num){
      int count = 1;
      String x = s;
      while(count<num){
        x = x + s;
        count++;
      }
      return x;
    }
  
    public String interweaving(String s1, String s2){
      int x = 0;
      String y = "";
      if (s1.length() >= s2.length()){
        x = s1.length();
      }
        else{
          x = s2.length();
        }
      for(int i = 1; i < x +1; i++){
        y += s1.substring(i-1,i) + s2.substring(i-1,i);
      }
      return y;
    }
  
  
  }