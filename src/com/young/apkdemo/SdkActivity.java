/*
 * Copyright (C) 2015 Mu Weiyang <young.mu@aliyun.com>
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3, as published
 * by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranties of
 * MERCHANTABILITY, SATISFACTORY QUALITY, or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.young.apkdemo;

import com.young.apkdemo.sdk.IpcActivity;
import com.young.apkdemo.sdk.WidgetActivity;
import com.young.apkdemo.sdk.DataStorageActivity;
import com.young.apkdemo.sdk.sdkMiscActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SdkActivity extends Activity implements OnClickListener {
    private static final String TAG = "apkdemo";
    private Button ipcBtn;
    private Button widgetBtn;
    private Button dataStorageBtn;
    private Button miscBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sdk);
        Log.i(TAG, "enter SDK Activity");
        // get buttons and set listeners
        ipcBtn = (Button)findViewById(R.id.ipc_button);
        widgetBtn = (Button)findViewById(R.id.widget_button);
        dataStorageBtn = (Button)findViewById(R.id.datastorage_button);
        miscBtn = (Button)findViewById(R.id.sdkmisc_button);
        ipcBtn.setOnClickListener(this);
        widgetBtn.setOnClickListener(this);
        dataStorageBtn.setOnClickListener(this);
        miscBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        case R.id.ipc_button:
            Intent ipcIntent = new Intent(SdkActivity.this, IpcActivity.class);
            startActivity(ipcIntent);
            break;
        case R.id.widget_button:
            Intent widgetIntent = new Intent(SdkActivity.this, WidgetActivity.class);
            startActivity(widgetIntent);
            break;
        case R.id.datastorage_button:
            Intent datastorageIntent = new Intent(SdkActivity.this, DataStorageActivity.class);
            startActivity(datastorageIntent);
            break;
        case R.id.sdkmisc_button:
            Intent miscIntent = new Intent(SdkActivity.this, sdkMiscActivity.class);
            startActivity(miscIntent);
            break;
        default:
            break;
        }
    }
}
