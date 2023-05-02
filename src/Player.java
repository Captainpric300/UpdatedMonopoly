class Player {
    private String name;
    private String token;
    private int location;
    private int balance;
    private boolean inJail;

    public Player(String name, String token, int location, int balance) {
        this.name = name;
        this.token = token;
        this.location = location;
        this.balance = balance;
        this.inJail = false;
    }

    // Getter and Setter methods for the player's attributes
    public int getBalance() {
        return balance;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }
}
