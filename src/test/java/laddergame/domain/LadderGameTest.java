package laddergame.domain;

class LadderGameTest {
//    static Stream<Arguments> ladderGameResultTest() {
//
//        /*     [case1]              [case2]
//         *     a    b    c          a    b    c
//         *     |----|    |          |    |    |
//         *     꽝   10   20         꽝   10   20
//         *
//         *     case1 예상결과 : a-10 / b-꽝 / c-20
//         *     case2 예상결과 : a-꽝 / b-10 / c-20
//         * */
//
//        return Stream.of(
//                arguments(
//                        new Players(List.of("a", "b", "c"))
//                        , new Prizes(List.of("꽝", "10", "20"), 3)
//                        , new Ladder(1, 3, new TrueFalseConnectionGenerator())
//                        , Stream.of(new Object[][]{{"a", "10"}, {"b", "꽝"}, {"c", "20"},
//                        }).collect(toMap(data -> new Name((String) data[0]), data -> new Name((String) data[1]))))
//
//                , arguments(
//                        new Players(List.of("a", "b", "c"))
//                        , new Prizes(List.of("꽝", "10", "20"), 3)
//                        , new Ladder(1, 3, new AllFalseConnectionGenerator())
//                        , Stream.of(new Object[][]{{"a", "꽝"}, {"b", "10"}, {"c", "20"},
//                        }).collect(toMap(data -> new Name((String) data[0]), data -> new Name((String) data[1]))))
//        );
//    }
//
//    @DisplayName("LadderGame은 Player와 Prize Name을 매핑한 게임 결과를 반환한다.")
//    @ParameterizedTest
//    @MethodSource
//    void ladderGameResultTest(Players testPlayers, Prizes testPrizes, Ladder testLadder, Map<Name, Name> expectedResults) {
//        LadderGame testLadderGame = new LadderGame(testPlayers, testLadder, testPrizes);
//        Map<Name, Name> actualGameResult = testLadderGame.getPlayerGameResult();
//
//        assertThat(actualGameResult)
//                .containsExactlyEntriesOf(expectedResults);
//    }


}
