package zlc.season.rxdownload;

/**
 * Author: Season(ssseasonnn@gmail.com)
 * Date: 2016/11/14
 * Time: 11:31
 * FIXME
 */
public class DownloadRecord {
    public static final int FLAG_NORMAL = 9990;
    public static final int FLAG_STARTED = 9991;
    public static final int FLAG_PAUSED = 9992;
    public static final int FLAG_CANCELED = 9993;
    public static final int FLAG_COMPLETED = 9994;
    public static final int FLAG_FAILED = 9995;

    private String url;
    private String name;
    private String image;
    private String saveName;
    private String savePath;
    private DownloadStatus mStatus;
    private int downloadFlag = FLAG_NORMAL;
    private long date; //格林威治时间,毫秒

    public DownloadRecord() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public DownloadStatus getStatus() {
        return mStatus;
    }

    public void setStatus(DownloadStatus status) {
        mStatus = status;
    }

    public int getDownloadFlag() {
        return downloadFlag;
    }

    public void setDownloadFlag(int downloadFlag) {
        this.downloadFlag = downloadFlag;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}