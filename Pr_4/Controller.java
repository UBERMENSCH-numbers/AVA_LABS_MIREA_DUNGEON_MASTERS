package Pr_4;
public class Controller {
    private int milan = 0;
    private int real = 0;
    private String lastScorer = "N/A";

    public void milanScores () {
        milan += 1;
        lastScorer = "AC Milan";
        if (milan - real > 5) MainGraphics.setWinner("AC Milan");
        MainGraphics.refresh(milan, real, lastScorer);
    }

    public void realScores () {
        real += 1;
        lastScorer = "Real Madrid";
        if (real - milan > 5) MainGraphics.setWinner("Real Madrid");
        MainGraphics.refresh(milan, real, lastScorer);
    }

}
