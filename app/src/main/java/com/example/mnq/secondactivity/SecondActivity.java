package com.example.mnq.secondactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends Activity {

    String[] mNoun = {};/*名词*/
    String[] mVerb = {};/*动词*/
    String[] mAdjective = {};/*形容词*/
    String[] mCommendatory = {};/*褒义词*/
    String[] mDerogatory = {};/*贬义词*/
    /* http://cidian.911cha.com/cixing_dongci.html */
    String[] mWord = {
            /*名词*/
            "时间", "信息", "工作", "问题", "系统", "作者", "方式", "北京", "联系",
            "中心", "用户", "地址", "同时", "大家", "美国", "功能", "环境", "人员",
            "状态", "音乐", "朋友", "电影", "全国", "项目", "地方", "能力", "位置",
            /*动词*/
            "没有", "工作", "进行", "就是", "发表", "发布", "联系", "需要", "不是",
            "推荐", "生产", "成为", "不会", "介绍", "回复", "开发", "更新", "无法",
            "发生", "组织", "喜欢", "运行", "经验", "结果", "包括", "处理", "比较",
            /*形容词*/
            "中国", "这个", "相关", "在线", "个人", "这些", "主要", "国际", "专业",
            "社会", "安全", "非常", "一般", "那个", "各种", "法律", "基本", "完全",
            "当然", "不断", "如此", "一切", "自然", "突然", "交流", "真正", "原来"};

    private TextView mTextView;
    private Spinner mSpinner;
    private Button mButton;
    private int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = (TextView) findViewById(R.id.textView);
        mSpinner = (Spinner) findViewById(R.id.spinner);
        String[] arrays = getResources().getStringArray(R.array.nums);
        ArrayAdapter mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arrays);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(mAdapter);
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                num = i + 1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                num = 1;
            }
        });
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mStr = random(num);
                mTextView.setText(mStr);
            }
        });

    }

    public String random(int num) {
        StringBuffer mBuffer = new StringBuffer();
        Random mRandom = new Random();
        for (int i = 0; i < num; i++) {
            int index = mRandom.nextInt(54);
            if (index >= 0 && index < 54)
                mBuffer.append(mWord[index] + ",");
        }

        return mBuffer.toString();
    }
}
