public enum Feelings {
    PEACEFULLY("миролюбиво"),
    NODESIRE("не было охоты"),
    SCARED("испуганно");

    private final String feel;

    Feelings(String feel) {
        this.feel = feel;
    }

    public String getFeel(){
        return feel;
    }
}
