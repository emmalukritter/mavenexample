import org.slf4j.*;
public class sample_first {
    void print()
    {
        Logger log=LoggerFactory.getLogger("sample_first");
        log.info("here ");
        log.debug("debug ");
        log.error("error");
        log.warn("warning ");
    }
    public static void main(String[] args) {
    sample_first s=new sample_first();
    s.print();
    }

}
