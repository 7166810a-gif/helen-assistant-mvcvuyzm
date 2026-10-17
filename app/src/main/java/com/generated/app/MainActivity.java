package com.generated.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.parseColor("#F5F5F5"));

        // Content Area
        TextView chatDisplay = new TextView(this);
        chatDisplay.setText("שלום, אני הלן. איך אוכל לעזור לך היום?");
        chatDisplay.setPadding(32, 32, 32, 32);
        chatDisplay.setTextSize(18);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1.0f);
        root.addView(chatDisplay, params);

        // Input Area
        LinearLayout inputLayout = new LinearLayout(this);
        inputLayout.setOrientation(LinearLayout.HORIZONTAL);
        inputLayout.setPadding(16, 16, 16, 16);
        inputLayout.setBackgroundColor(Color.WHITE);

        EditText input = new EditText(this);
        input.setHint(R.string.hint_input);
        LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0f);
        inputLayout.addView(input, inputParams);

        Button sendBtn = new Button(this);
        sendBtn.setText(R.string.btn_send);
        inputLayout.addView(sendBtn);

        root.addView(inputLayout);

        // Navigation
        LinearLayout nav = new LinearLayout(this);
        nav.setWeightSum(4);
        nav.setBackgroundColor(Color.parseColor("#E0E0E0"));
        addNavButton(nav, getString(R.string.tab_chat));
        addNavButton(nav, getString(R.string.tab_mine));
        addNavButton(nav, getString(R.string.tab_knowledge));
        addNavButton(nav, getString(R.string.tab_settings));
        root.addView(nav);

        setContentView(root);
    }

    private void addNavButton(LinearLayout parent, String title) {
        TextView tv = new TextView(this);
        tv.setText(title);
        tv.setGravity(Gravity.CENTER);
        tv.setPadding(16, 24, 16, 24);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0f);
        parent.addView(tv, p);
    }
}
