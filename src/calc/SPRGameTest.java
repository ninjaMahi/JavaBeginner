package calc;

import junit.framework.TestCase;
import org.junit.Test;

/*
0        1     2
Sci      Pap   Roc
scissors paper rock

 */
public class SPRGameTest extends TestCase {

    public void testSciSci() {
        GameStatusEnum result = SPRGame.checkP1Wins(0, 0);
        assertEquals(result, GameStatusEnum.DRAW);

    }

    public void testSciPap() {
        GameStatusEnum result = SPRGame.checkP1Wins(0, 1);
        assertEquals(result, GameStatusEnum.WIN);
    }

    public void testSciRoc() {
        GameStatusEnum result = SPRGame.checkP1Wins(0, 2);
        assertEquals(result, GameStatusEnum.LOSE);
    }

    public void testPapSci() {
        GameStatusEnum result = SPRGame.checkP1Wins(1, 0);
        assertEquals(result, GameStatusEnum.LOSE);
    }

    public void testPapPap() {
        GameStatusEnum result = SPRGame.checkP1Wins(1, 1);
        assertEquals(result, GameStatusEnum.DRAW);
    }

    public void testPapRoc() {
        GameStatusEnum result = SPRGame.checkP1Wins(1, 2);
        assertEquals(result, GameStatusEnum.WIN);
    }

    public void testRocSci() {
        GameStatusEnum result = SPRGame.checkP1Wins(2, 0);
        assertEquals(result, GameStatusEnum.WIN);
    }

    public void testRocPap() {
        GameStatusEnum result = SPRGame.checkP1Wins(2, 1);
        assertEquals(result, GameStatusEnum.LOSE);
    }
    public void testRocRoc() {
        GameStatusEnum result = SPRGame.checkP1Wins(2, 2);
        assertEquals(result, GameStatusEnum.DRAW);
    }


}




