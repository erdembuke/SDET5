package SeleniumProjects.Project_1;

public class Function {
    public static void Wait(int sn) {
        try {
            Thread.sleep(1000*sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

