package info.mabin.wce.componentexam1.icm;

import info.mabin.wce.manager.exception.IcmNotRegisteredException;
import info.mabin.wce.manager.icm.IcmAbstract;
import info.mabin.wce.manager.icm.exception.IcmException;

public class IcmExam1 extends IcmAbstract implements IcmExam1Impl{

	public IcmExam1() throws IcmNotRegisteredException {
		super("info.mabin.wce.componentexam1.icm.IcmExam1");
	}

	@Override
	public int sum(int param1, int param2) throws IcmException{
		try {
			return (Integer) this.invokeMethod("sum", param1, param2);
		} catch (IcmException e) {
			throw e;
		}
	}

	@Override
	public String getVersionName() throws IcmException {
		try {
			return (String) this.invokeMethod("getVersionName");
		} catch (IcmException e) {
			throw e;
		}
	}

	@Override
	public Long getVersionCode() throws IcmException {
		try {
			return (Long) this.invokeMethod("getVersionCode");
		} catch (IcmException e) {
			throw e;
		}
	}
}
