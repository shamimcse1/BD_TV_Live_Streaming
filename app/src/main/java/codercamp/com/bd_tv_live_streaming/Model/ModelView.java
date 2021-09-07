package codercamp.com.bd_tv_live_streaming.Model;

public class ModelView {
    private  String  ChannelName;
    private  int ChannelImage;


    public ModelView() {
    }

    public ModelView(String channelName, int channelImage) {
        ChannelName = channelName;
        ChannelImage = channelImage;
    }


    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String channelName) {
        ChannelName = channelName;
    }

    public int getChannelImage() {
        return ChannelImage;
    }

    public void setChannelImage(int channelImage) {
        ChannelImage = channelImage;
    }
}
