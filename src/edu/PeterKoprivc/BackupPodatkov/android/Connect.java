package edu.PeterKoprivc.BackupPodatkov.android;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Connect extends Activity {
    private static final int REQUEST_ENABLE_BT = 0;
	/** Called when the activity is first created. */    
    ImageButton search,connect;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    
	public void onClickSearch(View arg0) {
		BluetoothAdapter mBluetoothAdapter = BluetoothAdapter
				.getDefaultAdapter();
		if (mBluetoothAdapter == null) {
			// Device does not support Bluetooth
		} 
		else if (!mBluetoothAdapter.isEnabled()) {
			Intent enableBtIntent = new Intent(
					BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
		}
    }
    
    public void onClickConnect(View arg0)
    {
    	Intent i = new Intent(this.getApplicationContext(), choiceOfData.class);
    	startActivity(i);
    }
}
