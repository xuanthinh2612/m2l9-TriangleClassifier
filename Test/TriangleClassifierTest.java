import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testTriangleChecker1() {
        int a = 2;
        int b = 2;
        int c = 2;
       String exspected = "Tam Giac Deu";
       String result = TriangleClassifier.triangleChecker(a,b,c);
       assertEquals(exspected,result);
    }
    @org.junit.jupiter.api.Test
    void testTriangleChecker2() {
        int a = 2;
        int b = 2;
        int c = 3;
       String exspected = "Tam Giac Can";
       String result = TriangleClassifier.triangleChecker(a,b,c);
       assertEquals(exspected,result);
    }
    @org.junit.jupiter.api.Test
    void testTriangleChecker3() {
        int a = 3;
        int b = 4;
        int c = 5;
       String exspected = "Tam Giac Thuong";
       String result = TriangleClassifier.triangleChecker(a,b,c);
       assertEquals(exspected,result);
    }
    @org.junit.jupiter.api.Test
    void testTriangleChecker4() {
        int a = 8;
        int b = 2;
        int c = 3;
       String exspected = "Khong Phai Tam Giac";
       String result = TriangleClassifier.triangleChecker(a,b,c);
       assertEquals(exspected,result);
    }
    @org.junit.jupiter.api.Test
    void testTriangleChecker5() {
        int a = -1;
        int b = 2;
        int c = 1;
       String exspected = "Khong Phai Tam Giac";
       String result = TriangleClassifier.triangleChecker(a,b,c);
       assertEquals(exspected,result);
    }
    @org.junit.jupiter.api.Test
    void testTriangleChecker6() {
        int a = 0;
        int b = 1;
        int c = 1;
       String exspected = "Khong Phai Tam Giac";
       String result = TriangleClassifier.triangleChecker(a,b,c);
       assertEquals(exspected,result);
    }
}