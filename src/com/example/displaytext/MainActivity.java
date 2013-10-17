package com.example.displaytext;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText mInputLine;
	private Button mAddButton;
	private Button mClearButton;
	private TextView mDisplayText;
	private Text mText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mInputLine = (EditText)findViewById(R.id.editBox);
		mAddButton = (Button)findViewById(R.id.addButton);
		mClearButton = (Button)findViewById(R.id.deleteButton);
		mDisplayText = (TextView)findViewById(R.id.textBox);
		mAddButton.setEnabled(false);
		mClearButton.setEnabled(false);
		mText = new Text();
		
		mInputLine.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO mInputLineが更新されたら、ｍDisplayTextとｍInputLineの値に応じて
				// ボタンの有効/無効を設定する。
				setButton();
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// 未使用
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// 未使用
			}
		});
		
		mAddButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				setButton();
			}
		});
		
		mClearButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				setButton();
			}
		});
	}
	
	private void setButton() {
		// mDisplayTextとmInputLineTextの状態から追加ボタンと消去ボタンの有効/無効を設定する。
		if (mDisplayText.getText().length() > 0) {
			mClearButton.setEnabled(true);
		} else {
			mClearButton.setEnabled(false);
		}
		
		if (mInputLine.getText().length() > 0) {
			if (mText.getLineNum() < 10) {
				mAddButton.setEnabled(true);
			}
		} else {
			mAddButton.setEnabled(false);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
