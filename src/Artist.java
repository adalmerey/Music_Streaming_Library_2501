import java.util.Objects;

public class Artist extends MediaItem {

    public Artist(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Artist name: " + name);
    }

    @Override
    public String toString() {
        return "Artist{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artist)) return false;
        Artist other = (Artist) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
