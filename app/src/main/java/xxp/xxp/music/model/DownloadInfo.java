package xxp.xxp.music.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Zcoder
 * Email : 1340751953@qq.com
 * Time :  2017/6/16
 * Description :
 */

public class DownloadInfo {
    @SerializedName("bitrate")
    private Bitrate bitrate;

    public Bitrate getBitrate() {
        return bitrate;
    }

    public void setBitrate(Bitrate bitrate) {
        this.bitrate = bitrate;
    }

    public static class Bitrate {
        @SerializedName("file_duration")
        private int file_duration;
        @SerializedName("file_link")
        private String file_link;

        public int getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(int file_duration) {
            this.file_duration = file_duration;
        }

        public String getFile_link() {
            return file_link;
        }

        public void setFile_link(String file_link) {
            this.file_link = file_link;
        }
    }
}