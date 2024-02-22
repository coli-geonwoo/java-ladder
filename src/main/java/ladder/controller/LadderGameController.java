package ladder.controller;

import ladder.domain.Ladder;
import ladder.domain.People;
import ladder.view.InputView;
import ladder.view.OutputView;

public class LadderGameController {
    private LadderGameController() {
    }

    //TODO 메소드 10줄 이내로 작성
    public static void run() {
        People people = null;
        while (people == null) {
            people = makePeople();
        }

        Ladder ladder = null;
        while (ladder == null) {
            ladder = makeLadder(people);
        }

        OutputView.printNames(people);
        OutputView.printLadder(ladder);
    }

    private static People makePeople() {
        try {
            return new People(InputView.readNames());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Ladder makeLadder(People people) {
        try {
            int peopleNumber = people.getNames().size();
            return new Ladder(InputView.readHeight(), peopleNumber);
        } catch (NumberFormatException e) {
            System.out.println("사다리의 높이는 1이상 100이하의 자연수여야 합니다");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
