package com.example.slide_menu;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;

public class _Side_Menu {

	static Integer did, uid, recount;
	public static String _username, _paycount, _domainname;
	public static int _userid, lgflag;
	Cursor c;

	public static int _voteOpen;
	static final String[] MOBILE_OS = new String[] { "Address Book",
			"Messages", "Photo Report", "Voting", "Payments", "Settings" };

	public static Activity _activity;

	String pay_url;
	public static String paycount;

	public void _sideMenu(Activity activity, int arg2) {
		_activity = activity;

		switch (arg2) {
		case 0:
			//Class<?> cls=null;
			Intent _address = new Intent(_activity, NewActivity.class);
			_activity.startActivity(_address);
			_activity.overridePendingTransition(R.anim.slide_out,
					R.anim.slide_in);
			_activity.finish();	
			break;
		case 1:

			Intent _message = new Intent(_activity, NewActivity.class);
			_activity.startActivity(_message);
			_activity.overridePendingTransition(R.anim.slide_out,
					R.anim.slide_in);
			_activity.finish();

			break;
		case 2:

			Intent _photo = new Intent(_activity, NewActivity.class);
			_activity.startActivity(_photo);
			_activity.overridePendingTransition(R.anim.slide_out,
					R.anim.slide_in);
			_activity.finish();

			break;
		case 3:

			Intent _voting = new Intent(_activity, NewActivity.class);
			_activity.startActivity(_voting);
			_activity.overridePendingTransition(R.anim.slide_out,
					R.anim.slide_in);
			_activity.finish();

			break;
		case 4:

			Intent _payments = new Intent(_activity, NewActivity.class);
			_activity.startActivity(_payments);
			_activity.overridePendingTransition(R.anim.slide_out,
					R.anim.slide_in);
			_activity.finish();

			break;
		case 5:

			Intent _settings = new Intent(_activity, NewActivity.class);
			_activity.startActivity(_settings);
			_activity.overridePendingTransition(R.anim.slide_out,
					R.anim.slide_in);
			_activity.finish();
			// _activity.finish();
			break;
		}

	}

}
