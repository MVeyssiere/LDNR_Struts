package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Herbert Caffarel <herbert.caffarel@cicef.pro>
 */
public class TestAction extends ActionSupport {

    private String method; // Propriété contenant le nom de la méthode appelée par l'action

    @Override
    public String execute() throws Exception {
        this.method = "execute";
        return SUCCESS;
    }

    public String method1() {
        method = "method1";
        return SUCCESS;
    }

    public String method2() {
        method = "method2";
        return SUCCESS;
    }

    public String getMethod() {
        return this.method;
    }
}
