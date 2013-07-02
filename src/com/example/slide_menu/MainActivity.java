package com.example.slide_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.navdrawer.SimpleSideDrawer;

public class MainActivity extends Activity {
	SimpleSideDrawer slide_me;
	ImageView left_button, right_button;
	private ListView listView, menu_listview;
	
	static final String[] MOBILE_OS = new String[] { "Address Book",
		"Messages", "Photo Report", "Voting", "Payments", "Settings" };


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		slide_me = new SimpleSideDrawer(this);
		slide_me.setLeftBehindContentView(R.layout.left_menu);
		slide_me.setRightBehindContentView(R.layout.right_menu);

		left_button = (ImageView) findViewById(R.id.menuViewButton);
	//	right_button = (Button) findViewById(R.id.right_buton);
		left_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				slide_me.toggleLeftDrawer();
			}
		});
		
		menu_listview = (ListView) findViewById(R.id.message_list);
		final Menu_adapter adapter = new Menu_adapter(this, MOBILE_OS);
		
		menu_listview.setAdapter(adapter);

		menu_listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub

				_Side_Menu side_menu = new _Side_Menu();

				side_menu._sideMenu(MainActivity.this, arg2);

				// side_menu._paymentCount(Addressbook_screen.this);

			}
		});
	/*	right_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				slide_me.toggleRightDrawer();
			}
		});*/
	}
}
