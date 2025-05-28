package FieldAndMethod.Method.Args;

public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-", "hello", "world");
        System.out.println(info);
    }
    public String concat(String operator, String ... strs){
        String result="";

        for (int i = 0; i < strs.length; i++){
            if(i ==0){
                result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }


        return result;
    }


}
