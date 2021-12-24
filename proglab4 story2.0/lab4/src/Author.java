public class Author extends AHuman {
    Author(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    @Override
    public String speak(String text){
                return ('\n' + name + ": " + text + '\n');
            }
}