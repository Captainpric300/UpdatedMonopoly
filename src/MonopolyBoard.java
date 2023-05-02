class MonopolyBoard {
    private final int BOARD_SIZE = 40;
    private BoardSquare[] board;

    public MonopolyBoard() {
        board = new BoardSquare[BOARD_SIZE];
        initBoard();
    }

    private void initBoard() {
        board[0] = new BoardSquare("Go", "go", 0, 0, null);
        board[1] = new BoardSquare("Mediterranean Avenue", "property", 60, 2, "brown");
        board[2] = new BoardSquare("Community Chest", "community_chest", 0, 0, null);
        board[3] = new BoardSquare("Baltic Avenue", "property", 60, 4, "brown");
        board[4] = new BoardSquare("Income Tax", "tax", 0, 200, null);
        board[5] = new BoardSquare("Reading Railroad", "railroad", 200, 25, null);
        board[6] = new BoardSquare("Oriental Avenue", "property", 100, 6, "light_blue");
        board[7] = new BoardSquare("Chance", "chance", 0, 0, null);
        board[8] = new BoardSquare("Vermont Avenue", "property", 100, 6, "light_blue");
        board[9] = new BoardSquare("Connecticut Avenue", "property", 120, 8, "light_blue");
        board[10] = new BoardSquare("Jail", "jail", 0, 0, null);
        board[11] = new BoardSquare("St. Charles Place", "property", 140, 10, "pink");
        board[12] = new BoardSquare("Electric Company", "utility", 150, 0, null);
        board[13] = new BoardSquare("States Avenue", "property", 140, 10, "pink");
        board[14] = new BoardSquare("Virginia Avenue", "property", 160, 12, "pink");
        board[15] = new BoardSquare("Pennsylvania Railroad", "railroad", 200, 25, null);
        board[16] = new BoardSquare("St. James Place", "property", 180, 14, "orange");
        board[17] = new BoardSquare("Community Chest", "community_chest", 0, 0, null);
        board[18] = new BoardSquare("Tennessee Avenue", "property", 180, 14, "orange");
        board[19] = new BoardSquare("New York Avenue", "property", 200, 16, "orange");
        board[20] = new BoardSquare("Free Parking", "free_parking", 0, 0, null);
        board[21] = new BoardSquare("Kentucky Avenue", "property", 220, 18, "red");
        board[22] = new BoardSquare("Chance", "chance", 0, 0, null);
        board[23] = new BoardSquare("Indiana Avenue", "property", 220, 18, "red");
        board[24] = new BoardSquare("Illinois Avenue", "property", 240, 20, "red");
        board[25] = new BoardSquare("B. & O. Railroad", "railroad", 200, 25, null);
        board[26] = new BoardSquare("Atlantic Avenue", "property", 260, 22, "yellow");
        board[27] = new BoardSquare("Ventnor Avenue", "property", 260, 22, "yellow");
        board[28] = new BoardSquare("Water Works", "utility", 150, 0, null);
        board[29] = new BoardSquare("Marvin Gardens", "property", 280, 24, "yellow");
        board[30] = new BoardSquare("Go To Jail", "go_to_jail", 0, 0, null);
        board[31] = new BoardSquare("Pacific Avenue", "property", 300, 26, "green");
        board[32] = new BoardSquare("North Carolina Avenue", "property", 300, 26, "green");
        board[33] = new BoardSquare("Community Chest", "community_chest", 0, 0, null);
        board[34] = new BoardSquare("Pennsylvania Avenue", "property", 320, 28, "green");
        board[35] = new BoardSquare("Short Line", "railroad", 200, 25, null);
        board[36] = new BoardSquare("Chance", "chance", 0, 0, null);
        board[37] = new BoardSquare("Park Place", "property", 350, 35, "dark_blue");
        board[38] = new BoardSquare("Luxury Tax", "tax", 0, 100, null);
        board[39] = new BoardSquare("Boardwalk", "property", 400, 50, "dark_blue");
    }
    public BoardSquare getBoardSquare(int position) {
        return board[position];
    }

    public int getBoardSize() {
        return BOARD_SIZE;
    }
}