package thatbiriyaniguy.shoppinglist;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Neel on 1/22/18.
 */

public class ShoppingItems extends RealmObject {

    private String name;
    private String quantity;
    private Boolean completed;

    @PrimaryKey
    private String id;

    private Long timestamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
