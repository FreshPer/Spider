package entity;

/**
 * Created by mac on 03/05/2017.
 */
public class Link {
    private int id;
    private String link;
    private int isCrawed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIsCrawed() {
        return isCrawed;
    }

    public void setIsCrawed(int isCrawed) {
        this.isCrawed = isCrawed;
    }
}
