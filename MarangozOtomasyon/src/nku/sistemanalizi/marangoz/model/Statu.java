package nku.sistemanalizi.marangoz.model;

public class Statu {
	public static final int KAPALI=0;
	public static final int ACIK=1;
	public static final int IPTAL=2;
	
	public static String ToString(int statu)
	{
		if(statu==Statu.ACIK)
		{
			return "AÇIK";
		}
		else if(statu==Statu.KAPALI)
		{
			return "KAPALI";
		}
		else if(statu==Statu.IPTAL)
		{
			return "IPTAL";
		}
		return "";
	}
}
