public class TriangleClassifier {
    public static String triangleChecker(int a, int b, int c) {
        if (a<=0||b<=0||c<=0) return "Khong Phai Tam Giac";
        if (a+b<c||a+c<b||b+c<a) return "Khong Phai Tam Giac";
        if (a == b && a == c) {
            return "Tam Giac Deu";
        }
        if (a==b||a==c||b==c) return "Tam Giac Can";
        return "Tam Giac Thuong";
    }
}
