package net.playblack.exceptions;


public class DeserializeException extends Exception {

	private static final long serialVersionUID = 8549331417887764646L;
	
	public DeserializeException(String message, String serializedString) {
		super(message+System.getProperty("line.separator")+" Serialied String: "+serializedString);
	}
}
