package edu.PeterKoprivc.BackupPodatkov.android;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connect extends Activity {
    private static final int REQUEST_ENABLE_BT = 0;
	/** Called when the activity is first created. */    
    Button connect;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        connect = (Button) findViewById(R.id.btnSearch);
    }
    
    public void onClick(View arg0)
    {
    	if(arg0.getId()==R.id.btnSearch)
    	{
    		BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    		if (mBluetoothAdapter == null) {
    		    // Device does not support Bluetooth
    		}
    		if (!mBluetoothAdapter.isEnabled()) {
    		    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    		    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
    		}
    	}
    }
}
