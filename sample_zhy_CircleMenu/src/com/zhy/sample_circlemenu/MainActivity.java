package com.zhy.sample_circlemenu;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * <pre>
 * @author zhy 
 * http://blog.csdn.net/lmj623565791/article/details/43131133
 * </pre>
 */
public class MainActivity extends ListActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		getListView().setAdapter(
				new ArrayAdapter<String>(this,
						android.R.layout.simple_list_item_1, new String[] {
								"建行圆形菜单", "圆形菜单" }));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		Intent intent = null;
		if (position == 0)
		{
			intent = new Intent(this, CCBActivity.class);
		} else
		{
			intent = new Intent(this, CircleActivity.class);
		}
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
		case R.id.action_settings:
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			intent.setData(Uri
					.parse("http://blog.csdn.net/lmj623565791?viewmode=contents"));
			startActivity(intent);
			return true;
		default:
			return false;
		}
	}

}
