package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class MyTestListerer implements IInvokedMethodListener {
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
    /*@Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult){
        System.out.println("method started:" + method.getTestMethod().getMethodName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult){
        System.out.println("method finished:" + method.getTestMethod().getMethodName() +"\n");
    }*/
}
