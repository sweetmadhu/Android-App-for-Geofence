package md592d3c8eb854f4aaaccd91d08fa52b67c;


public class MyProfileTracker
	extends com.facebook.ProfileTracker
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCurrentProfileChanged:(Lcom/facebook/Profile;Lcom/facebook/Profile;)V:GetOnCurrentProfileChanged_Lcom_facebook_Profile_Lcom_facebook_Profile_Handler\n" +
			"";
		mono.android.Runtime.register ("GeoFencngDemo.MyProfileTracker, GeoFencngDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyProfileTracker.class, __md_methods);
	}


	public MyProfileTracker () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MyProfileTracker.class)
			mono.android.TypeManager.Activate ("GeoFencngDemo.MyProfileTracker, GeoFencngDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCurrentProfileChanged (com.facebook.Profile p0, com.facebook.Profile p1)
	{
		n_onCurrentProfileChanged (p0, p1);
	}

	private native void n_onCurrentProfileChanged (com.facebook.Profile p0, com.facebook.Profile p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
