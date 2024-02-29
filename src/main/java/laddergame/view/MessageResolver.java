package laddergame.view;

import laddergame.domain.gameelements.Name;
import laddergame.domain.gameelements.Players;
import laddergame.domain.gameelements.Prizes;
import laddergame.domain.ladder.Connection;
import laddergame.domain.ladder.Ladder;
import laddergame.domain.ladder.RowLine;

import java.util.Map;
import java.util.stream.Collectors;

public class MessageResolver {
    private static final int INTERVAL_WIDTH = 5;
    private static final String BLANK = " ";
    private static final String ELEMENT_MESSAGE_FORMAT = "%-" + INTERVAL_WIDTH + "s";
    private static final String CONNECT_MESSAGE = "-".repeat(INTERVAL_WIDTH);
    private static final String NOTCONNECT_MESSAGE = " ".repeat(INTERVAL_WIDTH);
    private static final String VERTICAL_LINE = "|";
    private static final String LINE_SEPERATOR = System.lineSeparator();

    public static String resolvePlayerMessage(Players players) {
        return players.getPlayerNames().stream()
                .map(element -> String.format(ELEMENT_MESSAGE_FORMAT, element.getName()))
                .collect(Collectors.joining(BLANK));
    }

    public static String resolvePrizeMessage(Prizes prizes) {
        return prizes.getPrizeNames().stream()
                .map(element -> String.format(ELEMENT_MESSAGE_FORMAT, element.getName()))
                .collect(Collectors.joining(BLANK));
    }

    public static String resolveLadderMessage(Ladder ladder) {
        return ladder.getRowLines()
                .stream()
                .map(MessageResolver::resolveRowLineMessage)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    public static Name resolvePlayerResultMessage(Name result) {
        return result;
    }

    public static String resolveAllPlayerResultMessage(Map<Name, Name> playerGameResult) {
        return playerGameResult.keySet()
                .stream()
                .map(key -> key.toString() + " : " + playerGameResult.get(key).toString())
                .collect(Collectors.joining(LINE_SEPERATOR));
    }

    private static String resolveRowLineMessage(RowLine rowLine) {
        return rowLine.getConnections().stream()
                .map(MessageResolver::findConnectionMark)
                .collect(Collectors.joining(VERTICAL_LINE,
                        BLANK.repeat(INTERVAL_WIDTH - 1) + VERTICAL_LINE, VERTICAL_LINE));
    }

    private static String findConnectionMark(Connection connection) {
        if (connection == Connection.CONNECTED) {
            return CONNECT_MESSAGE;
        }
        return NOTCONNECT_MESSAGE;
    }
}
