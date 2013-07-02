package com.example.slide_menu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu_adapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	Activity activity;
	String pay_url, _paycount, _userid;
	ImageView imageView2;
	TextView textView1;

	public Menu_adapter(Context context, String[] values) {
		super(context, R.layout.menu_list, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.menu_list, parent, false);
		TextView textView = (TextView) rowView
				.findViewById(R.id.grid_item_text);
		// textView1 = (TextView) rowView.findViewById(R.id.grid_item_text1);
		ImageView imageView = (ImageView) rowView
				.findViewById(R.id.grid_item_image);
		// ImageView imageView1 = (ImageView)
		// rowView.findViewById(R.id.grid_item_image1);
		// imageView2 = (ImageView) rowView.findViewById(R.id.pay_add);
		textView.setText(values[position]);
		// textView.setTypeface(Typeface.createFromAsset(context.getAssets(),
		// "fonts/Roboto-Regular.ttf"), Typeface.BOLD);
		textView.setTextColor(Color.parseColor("#FFFFFF"));
		// textView1.setTypeface(Typeface.createFromAsset(context.getAssets(),
		// "fonts/Roboto-Regular.ttf"), Typeface.BOLD);
		// textView1.setTextColor(Color.parseColor("#FFFFFF"));

		// Change icon based on name
		String s = values[position];

		System.out.println(s);

		/*
		 * if (s.equals("Address Book")) {
		 * //imageView.setImageResource(R.drawable.address); //
		 * imageView2.setVisibility(View.INVISIBLE);//Address
		 * Book", "Messages", "Photo Report", "Voting","Payments","Sign out }
		 * else if (s.equals("Messages")) {
		 * //imageView.setImageResource(R.drawable.message);
		 * imageView2.setVisibility(View.INVISIBLE); } else if
		 * (s.equals("Photo Report")) { //
		 * imageView.setImageResource(R.drawable.report);
		 * imageView2.setVisibility(View.INVISIBLE); } else if
		 * (s.equals("Voting")) { //imageView.setImageResource(R.drawable.vote);
		 * imageView2.setVisibility(View.INVISIBLE); } else if
		 * (s.equals("Payments")) { //
		 * imageView.setImageResource(R.drawable.pay);
		 * 
		 * if(InternetCheck.isInternetOn1(getContext())) {
		 * 
		 * if(Addressbook_screen._paycount.equals("0")||Addressbook_screen._paycount
		 * .equals("null")) { imageView2.setVisibility(View.INVISIBLE);
		 * textView1.setVisibility(View.INVISIBLE); } else
		 * textView1.setText(Addressbook_screen._paycount);
		 * textView1.setVisibility(View.VISIBLE);
		 * 
		 * }
		 * 
		 * 
		 * else { imageView2.setVisibility(View.INVISIBLE);
		 * textView1.setVisibility(View.INVISIBLE); }
		 * 
		 * }
		 * 
		 * else if (s.equals("Settings")) { //
		 * imageView.setImageResource(R.drawable.settings);
		 * imageView2.setVisibility(View.INVISIBLE); }
		 */

		return rowView;

	}
}

/*
 * public void _paycount(String _paycount) { // TODO Auto-generated method stub
 * if(InternetCheck.isInternetOn1(getContext())) {
 * if(_paycount.equals("0")||_paycount.equals(null)) {
 * 
 * imageView2.setVisibility(View.INVISIBLE);
 * textView1.setVisibility(View.INVISIBLE); } else textView1.setText(_paycount);
 * } else { imageView2.setVisibility(View.INVISIBLE);
 * textView1.setVisibility(View.INVISIBLE); }
 */

