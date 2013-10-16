package com.example.displaytext;

import java.util.ArrayList;

public class Text {

	private ArrayList<String> mLines;
	
	public void setText(String text) {
		// 文字列を開業で分割してリストに格納する。
	}
	
	public void addLine(String line) {
		mLines.add(line);
	}
	
	public int getLineNum() {
		return mLines.size();
	}
	
	public void clear() {
		mLines.clear();
	}
	
	@Override
	public String toString() {
		// リストの文字列を改行で区切って結合した結果を返す。
		return "";
	}
}
