class MonopolyGame {
    private MonopolyBoard board;
    private Player[] players;
    private int currentPlayer;

    public MonopolyGame() {
        board = new MonopolyBoard();
        players = new Player[2]; // for a 2-player game
        players[0] = new Player("Player 1", "dog", 0, 1500);
        players[1] = new Player("Player 2", "boot", 0, 1500);
        currentPlayer = 0;
    }

    public void playGame() {
        while (!isGameOver()) {
            int diceRoll = rollDice();
            movePlayer(diceRoll);
            handleBoardSquare();

            // Switch to the next player
            currentPlayer = (currentPlayer + 1) % players.length;
        }

        // Announce the winner
        int winner = determineWinner();
        System.out.println("The winner is: " + players[winner].getName());
    }

    private boolean isGameOver() {
        for (Player player : players) {
            if (player.getBalance() <= 0) {
                return true;
            }
        }
        return false;
    }

    private int rollDice() {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        return die1 + die2;
    }

    private void movePlayer(int steps) {
        Player player = players[currentPlayer];
        int newLocation = (player.getLocation() + steps) % board.getBoardSize();
        player.setLocation(newLocation);
    }

    private void handleBoardSquare() {
        Player player = players[currentPlayer];
        BoardSquare square = board.getBoardSquare(player.getLocation());
        String squareType = square.getType();

        if (squareType.equals("property")) {
            if (square.getOwner() == null) {
                // Buy the property if the player has enough money
                if (player.getBalance() >= square.getPrice()) {
                    player.setBalance(player.getBalance() - square.getPrice());
                    square.setOwner(player);
                    System.out.println(player.getName() + " bought " + square.getName());
                }
            } else {
                // Pay rent to the owner if it's not the current player
                if (square.getOwner() != player) {
                    int rent = square.getRent();
                    player.setBalance(player.getBalance() - rent);
                    square.getOwner().setBalance(square.getOwner().getBalance() + rent);
                    System.out.println(player.getName() + " paid " + rent + " rent to " + square.getOwner().getName());
                }
            }
        }
        // Implement other square types like "tax", "toJail", "railroad", "utility", etc.
    }

    private int determineWinner() {
        int winner = -1;
        int maxBalance = Integer.MIN_VALUE;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getBalance() > maxBalance) {
                winner = i;
                maxBalance = players[i].getBalance();
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        MonopolyGame game = new MonopolyGame();
        game.playGame();
    }
}
