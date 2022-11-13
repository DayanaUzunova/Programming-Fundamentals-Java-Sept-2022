package articles;

public class Article {
    //fields
    private String title;
    private String content;
    private String author;

    //constructor - new objects
    //alt + ins
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //methods
    public void edit (String newContent){
        //the content of our object is changed
        this.content = newContent;
    }
    public void changeAuthor (String newAuthor){
        this.author = newAuthor;
    }
    public void rename (String newTitle){
        this.title = newTitle;
    }
    //вграден метод toString -> превръща обекта в текст
    @Override
    public String toString(){
        return this.title + " - " + this.content + ": " + this.author;
    }

}
