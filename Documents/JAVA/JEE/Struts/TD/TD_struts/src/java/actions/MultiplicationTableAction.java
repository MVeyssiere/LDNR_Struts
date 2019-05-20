package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Marine V
 */
public class MultiplicationTableAction extends ActionSupport {

    private int factor = 7;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public int getFactor() {
        return factor;
    }


}
