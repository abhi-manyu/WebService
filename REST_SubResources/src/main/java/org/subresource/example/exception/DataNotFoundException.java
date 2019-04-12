package org.subresource.example.exception;

public class DataNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 5991235399602119675L;

	public DataNotFoundException(String message)
	{
		super(message);
	}
}
