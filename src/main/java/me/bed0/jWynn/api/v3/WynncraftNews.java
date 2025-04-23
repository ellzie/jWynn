package me.bed0.jWynn.api.v3;

public class WynncraftNews {
    private String title;
    private String date;
    private String forumThread;
    private String author;
    private String content;
    private String comments;

    public WynncraftNews(String title, String date, String forumThread, String author, String content, String comments) {
        this.title = title;
        this.date = date;
        this.forumThread = forumThread;
        this.author = author;
        this.content = content;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getForumThread() {
        return forumThread;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "WynncraftNews{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", forumThread='" + forumThread + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
