package com.tutorialsbuzz.tablayoutdemo.soap;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by gonzalopro on 10/14/16.
 */

public class GetDataSubscriber extends AsyncTask <String, Void, Void> {

    private Context context;
    private String SOAP_ACTION = "";
    private String METHOD_NAME = "getDataSubscriber";
    private String NAMESPACE = "http://ws.wsComteco.comteco.com.bo/";
    private String URL = "http://192.9.200.150:8080/wsComteco/apiComteco";
    private SoapObject soabResult;

    private EditText editTextId, editTextNombre;

    public GetDataSubscriber(Context context, EditText editTextId, EditText editTextNombre) {
        this.context = context;
        this.editTextId = editTextId;
        this.editTextNombre = editTextNombre;
    }

    @Override
    protected Void doInBackground(String... params) {
        String nro = params[0];

        try {
            SoapObject Request = new SoapObject(NAMESPACE, METHOD_NAME);
            Request.addProperty("identification", nro);


            SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            // soapEnvelope . dotNet   =   true ;
            soapEnvelope.implicitTypes = true;
            soapEnvelope.setOutputSoapObject(Request);

            HttpTransportSE transport = new HttpTransportSE(URL);
            transport.debug = true;

            transport.call(SOAP_ACTION, soapEnvelope);


            soabResult = (SoapObject) soapEnvelope.bodyIn;

            //soapPrimitive = (SoapPrimitive) soapEnvelope.getResponse();


        } catch (Exception ex) {
            Log.e("ASYNC", "Error: " + ex.getMessage());
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        SoapObject getProperty0 = (SoapObject) soabResult.getProperty(0);
        SoapObject getDataOrdenes = (SoapObject) getProperty0.getProperty("dataSubscribers");
        String getId = getDataOrdenes.getProperty("subscriberId").toString();
        String getClienteNombre =  getDataOrdenes.getProperty("subscriberName").toString();
        String getClienteApp =  getDataOrdenes.getProperty("subsLastName").toString();
        String getContracts =  getDataOrdenes.getProperty("contracts").toString();
        String fullName = getClienteNombre + " " + getClienteApp;

        for (int i=0 ; i<getProperty0.getPropertyCount(); i++) {
            //SoapObject getContract = (SoapObject) getProperty0.getProperty(i);
            //String contract = getContract.getPrimitivePropertyAsString("contract");
            Log.d("ASYNC", "Datos ");
        }

        editTextId.setText(getId);
        editTextNombre.setText(fullName);


        Log.d("ASYNC", "count : " + soabResult.getPropertyCount());
        Log.d("ASYNC", "data : " + soabResult.getProperty(0));
        Log.d("ASYNC", "tam : " + getProperty0.getPropertyCount());
        Log.d("ASYNC", "subscriberID : " + getId);
        Log.d("ASYNC", "subscribersName : " + fullName);
        Log.d("ASYNC", "contracts : " + getContracts);
    }


}
