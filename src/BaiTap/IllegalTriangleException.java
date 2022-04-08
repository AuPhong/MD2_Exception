package BaiTap;

public class IllegalTriangleException {
    String str1;
    public IllegalTriangleException(String str2) {
        str2=str1;
    }

    @Override
    public String toString() {
        return("MyException occurred "+str1);
    }
}
