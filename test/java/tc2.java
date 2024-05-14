//package Demo1;
import org.testng.annotations.DataProvider;
public class tc2{
    @DataProvider(name  ="Authentication")
    public static Object[][] credentials(){
        return new Object[][] {
               {"abc", "nandhu", "nanditha@gmail,com", "1233428288"},
                {"jerry", "Tom", "tomjerry@gmail.com", "2345637373"},
                {"Tom", "Jerry", "jerrytom@gmail.com", "7890746474"}

                };
    }
}