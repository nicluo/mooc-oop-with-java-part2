public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i < characterString.length(); i++) {
            if(characterString.charAt(i) == this.fromCharacter) {
                stringBuilder.append(this.toCharacter);
            } else {
                stringBuilder.append(characterString.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
