package utilizer.pojo;

import java.util.List;

public class IncludingCompareRes {

    private List<String> inLeftNotInRight;

    private List<String> inRightNotInLeft;

    private String resultMsg;


    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public List<String> getInLeftNotInRight() {
        return inLeftNotInRight;
    }

    public void setInLeftNotInRight(List<String> inLeftNotInRight) {
        this.inLeftNotInRight = inLeftNotInRight;
    }

    public List<String> getInRightNotInLeft() {
        return inRightNotInLeft;
    }

    public void setInRightNotInLeft(List<String> inRightNotInLeft) {
        this.inRightNotInLeft = inRightNotInLeft;
    }
}
