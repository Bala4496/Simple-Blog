package ua.bala.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String announce;
    private String text;
    private int views;

    public Post() {
    }

    public Post(String title, String announce, String text) {
        this.title = title;
        this.announce = announce;
        this.text = text;
    }

    /**
     * get field @Id
     @GeneratedValue(strategy = GenerationType.AUTO)

      *
      * @return id @Id
     @GeneratedValue(strategy = GenerationType.AUTO)

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     @GeneratedValue(strategy = GenerationType.AUTO)

      *
      * @param id @Id
     @GeneratedValue(strategy = GenerationType.AUTO)

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * set field
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get field
     *
     * @return announce
     */
    public String getAnnounce() {
        return this.announce;
    }

    /**
     * set field
     *
     * @param announce
     */
    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    /**
     * get field
     *
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * set field
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * get field
     *
     * @return views
     */
    public int getViews() {
        return this.views;
    }

    /**
     * set field
     *
     * @param views
     */
    public void setViews(int views) {
        this.views = views;
    }
}
