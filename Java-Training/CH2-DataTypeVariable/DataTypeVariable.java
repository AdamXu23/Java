public class DataTypeVariable {
    public static void main(String[] args){
        //在終端機印出各種資料形態的資料
        //整數，預設定是int形態
        Integer integer1 = 3;
        System.out.println(integer1);
        System.out.println( integer1.MIN_VALUE);
        System.out.println( integer1.MAX_VALUE );
        //長整數.數字的後面加上L
        Long long1 = 20000000000L;
        System.out.println(long1);
        System.out.println( long1.MIN_VALUE );
        System.out.println( long1.MAX_VALUE );
        //浮點數預設是double
        Double double1 = 3.14159268;
        System.out.println(double1);
        System.out.println( double1.MIN_VALUE );
        System.out.println( double1.MAX_VALUE );
        //Flow後面加上F
        Float float1 = 3.14159268F;
        System.out.println(float1);
        System.out.println( float1.MIN_VALUE );
        System.out.println( float1.MAX_VALUE );
        //bool
        System.out.println(false);
        System.out.println( double1.MIN_VALUE );
        System.out.println( double1.MAX_VALUE );
        //chart
        char char1 = 'a';
        System.out.println(char1);
        //String
        String string = "你好";
        System.out.println(string);
        System.out.println(string.length());

        String str = null;
        if (str != null && !str.isEmpty()) {
            System.out.println("The string is not null and not empty.");
        } else {
            System.out.println("The string is null or empty.");
        }
        
    }
}