package practice;


/*An item with a description and a part number.*/

import java.util.Objects;

public class Item implements Comparable<Item> {

    private String description;
    private  int partNumber;

    /**
     * Constructs an item.
     * @param aDescription the item's description
     * @param aPartNumber the item's part number
     * */

    public Item(String aDescription, int aPartNumber) {
        this.description = aDescription;
        this.partNumber = aPartNumber;
    }

    /**
     * Gets the description of this item.
     * @return the description
     * */
    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return "[description= " + description + ", partNumber=" + partNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return partNumber == item.partNumber && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    public int compareTo(Item other){
        return  Integer.compare(partNumber, other.partNumber);
    }
}
