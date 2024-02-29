package laddergame.domain.gameelements;

import java.util.List;

public class Players {
    // TODO 예약어 검증 책임 Players에서 처리하기
    private static final int MIN_PLAYER_NUMBER = 1;
    private static final int MAX_PLAYER_NUMBER = 100;

    private final List<Name> playerNames;

    public Players(List<String> playerNames) {
        validatePlayerNumber(playerNames);
        this.playerNames = playerNames.stream()
                .map(Name::new)
                .toList();
    }

    private void validatePlayerNumber(List<String> playerNames) {
        if (playerNames.size() < MIN_PLAYER_NUMBER || playerNames.size() > MAX_PLAYER_NUMBER) {
            throw new IllegalArgumentException("게임 참여자의 수는 1이상 100이하만 가능합니다.");
        }
    }

    public List<Name> getPlayerNames() {
        return playerNames;
    }
}
