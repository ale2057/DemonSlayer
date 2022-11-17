public class Validation {
    public static boolean validate (String m){

        boolean result=false;
        if(m.length()==1 ){
              if((int)m.charAt(0)==49 ||(int)m.charAt(0)==50 || (int)m.charAt(0)==51 || (int)m.charAt(0)==52 ||(int)m.charAt(0)==53){
                  result= true;
              }else{
                  System.out.println("Pick a option correct, try again");
                  result= false;
              }
        }else{
            System.out.println("Pick a option correct, try again");
            result=false;
        }
        return result;
    }
}
