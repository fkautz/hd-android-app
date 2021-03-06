package com.hackerdojo.android.infoapp;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class EventArrayAdapter extends ArrayAdapter<String> {
	private Activity context;
	private List<String> startTimes;
	private List<String> endTimes;
	private List<String> titles;

	public EventArrayAdapter(Activity context, List<String> startTimes, List<String> endTimes, List<String> titles) {
		super(context, R.layout.event, new String[titles.size()]);
		this.context = context;
		this.startTimes = startTimes;
		this.endTimes = endTimes;
		this.titles = titles;
	}
	
	public View getView(int position, View view, ViewGroup viewGroup) {
		LayoutInflater inflator = context.getLayoutInflater();
		View newView = inflator.inflate(R.layout.event, null, true);
		TextView textView1 = (TextView) newView.findViewById(R.id.textView1);
		TextView textView2 = (TextView) newView.findViewById(R.id.textView2);
		TextView textView3 = (TextView) newView.findViewById(R.id.textView3);
		textView1.setText(startTimes.get(position));
		textView2.setText(endTimes.get(position));
		textView3.setText(titles.get(position));
		return newView;
	}
}
