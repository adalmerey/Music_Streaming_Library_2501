public abstract class MediaItem {

    protected String name;

    public MediaItem(String name) {
        this.name = name;
    }

    public abstract void showInfo();
}
