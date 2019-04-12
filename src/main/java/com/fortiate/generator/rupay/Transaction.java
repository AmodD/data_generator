package com.fortiate.generator.rupay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fortiate.generator.dataelements.DataElement;

public abstract class Transaction {


	public Transaction()
	{
		
	}
	
	public Transaction(String message, String network, List<DataElement> dataElements) {
		this.message = message;
		this.network = network;
		this.dataElements = dataElements;
	}
	
	protected String message;
	protected String network = "rupay";
	protected static List<DataElement> dataElements = new ArrayList<>();

	protected static HashMap<String, String> deHM = new HashMap<String, String>();
	protected static HashMap<String, String> deHMJson = new HashMap<String, String>();

	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public List<DataElement> getDataElements() {
		return dataElements;
	}
	public void setDataElements(List<DataElement> dataElements) {
		this.dataElements = dataElements;
	}


	public HashMap<String, String> getDeHM() {
		return deHM;
	}

	public void setDeHM(HashMap<String, String> deHM) {
		this.deHM = deHM;
	}

	public HashMap<String, String> getDeHMJson() {
		return deHMJson;
	}

	public void setDeHMJson(HashMap<String, String> deHMJson) {
		Transaction.deHMJson = deHMJson;
	}








}
