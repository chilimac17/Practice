package statisticslibrary;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestStatsLib {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public static void main(String[] args){
        //creating our stats lib object and calling results method to test all the methods in the stats lib
        StatsLib s1 = new StatsLib();
        s1.results();

    }
}
