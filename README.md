# CircleMenu
==========================
provide a simple way to implement a circle menu on android .

用法
=====
1、布局文件中声明控件

<com.zhy.view.CircleMenuLayout
	android:id="@+id/id_menulayout"
	android:layout_width="match_parent"
	android:layout_height="match_parent"
	android:padding="100dp"
	android:background="@drawable/circle_bg3" >
</com.zhy.view.CircleMenuLayout>

2、Activity的onCreate中；或者Fragment的onCreateView中

public class CircleActivity extends Activity
{

	private CircleMenuLayout mCircleMenuLayout;

	private String[] mItemTexts = new String[] { "安全中心 ", "特色服务", "投资理财",
			"转账汇款", "我的账户", "信用卡" };
	private int[] mItemImgs = new int[] { R.drawable.home_mbank_1_normal,
			R.drawable.home_mbank_2_normal, R.drawable.home_mbank_3_normal,
			R.drawable.home_mbank_4_normal, R.drawable.home_mbank_5_normal,
			R.drawable.home_mbank_6_normal };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		//自已切换布局文件看效果
		setContentView(R.layout.activity_main02);

		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
	}

}

3、添加点击事件

mCircleMenuLayout.setOnMenuItemClickListener(new OnMenuItemClickListener()
{
	@Override
	public void itemClick(View view, int pos)
	{
		Toast.makeText(CircleActivity.this, mItemTexts[pos],
				Toast.LENGTH_SHORT).show();

	}
	@Override
	public void itemCenterClick(View view)
	{
		Toast.makeText(CircleActivity.this,
				"you can do something just like ccb  ",
				Toast.LENGTH_SHORT).show();
	}
});

效果图
=====

CircleMenuSample

![Sample Screenshots][1]

CCBSample

![Sample Screenshots][2]


[1]: https://github.com/hongyangAndroid/CircleMenu/blob/master/sample_zhy_CircleMenu/screen_shot.gif
[2]: https://github.com/hongyangAndroid/CircleMenu/blob/master/sample_zhy_CircleMenu/ccb.gif