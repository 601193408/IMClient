package vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import net.tsz.afinal.annotation.sqlite.Table;

@SuppressWarnings("serial")
@Table(name = "chat_content")
public class Content implements Serializable {

    /** 发送者名字 */
    private int id;
    
    private String sendName;

    /** 接受人姓名 */
    private String receiveName;

    /** 发送日期 */
    private Date date;

    /** 发送内容 */
    private String msg;

    /** true:发送出去；false：接受 */
    private boolean isSendMsg;

    /** 0：群发；!=0:点对点:目标channelId */
    private int receiveId;

    /** 发送消息的人员编号 */
    private int sendId;

    /** 接收消息的对象编号 */
    private List<Integer> targetIds;

    /** 如果是群聊，那么指定当前的聊天内容是属于哪一聊天组的 */
    private long grouppTag;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSendMsg() {
        return isSendMsg;
    }

    public void setSendMsg(boolean isSendMsg) {
        this.isSendMsg = isSendMsg;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public int getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    public List<Integer> getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(List<Integer> targetIds) {
        this.targetIds = targetIds;
    }

    public long getGrouppTag() {
        return grouppTag;
    }

    public void setGrouppTag(long grouppTag) {
        this.grouppTag = grouppTag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}