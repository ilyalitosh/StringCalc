package megalib;

class StringParser {

    private StringPieces sp;

    StringParser(String input){
        sp = new StringPieces(input);
    }

    public StringPieces getStringPieces() {
        return sp;
    }
}
