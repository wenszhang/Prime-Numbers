import org.junit.Assert;

public class PrimerTest {

    @org.junit.Test
    public void primer() {
        Primer p = new Primer();
        Assert.assertEquals("5, 5, 3, 3, 2, 2", p.Primer(900));
    }
}
