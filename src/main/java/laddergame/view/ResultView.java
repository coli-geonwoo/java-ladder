package laddergame.view;

import laddergame.domain.ladder.Ladder;
import laddergame.domain.people.People;

public class ResultView {
    private static final String LINE_SEPERATOR = System.lineSeparator();

    private ResultView() {
    }

    public static void printLadder(People people, Ladder ladder) {
        System.out.println(LINE_SEPERATOR+"실행 결과"+LINE_SEPERATOR);
        System.out.println(MessageResolver.resolvePeopleMessage(people));
        System.out.println(MessageResolver.resolveLadderMessage(ladder));
    }

}
