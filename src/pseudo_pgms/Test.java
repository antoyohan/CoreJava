package pseudo_pgms;

public class Test {
    private static Test mInstance ;

    private Test() {

    }

    public static Test getInstance() {
        if (mInstance != null) {
            mInstance = new Test();
        }
        return mInstance;
    }
}
