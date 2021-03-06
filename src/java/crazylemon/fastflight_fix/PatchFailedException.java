package crazylemon.fastflight_fix;

public class PatchFailedException extends RuntimeException {
	
	static final long serialVersionUID = 0x4433L;
	
	public PatchFailedException() {
		super();
	}
	
	public PatchFailedException(String message) {
		super(message);
	}
	
	public PatchFailedException(String message, Throwable cause) {
		super(message, cause);
	}

    public PatchFailedException(Throwable cause) {
        super(cause);
    }

    protected PatchFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
