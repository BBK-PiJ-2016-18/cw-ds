public class ReturnObjectImpl implements ReturnObject {/**
 * A wrapper containing either an object (the result of an operation
 * on a data structure) or an error value.
 *

	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError() {
		if (getReturnValue() == null)  {
			return true;
		}
		return false;
	}

	/**
	 * Returns the error message. 
	 * 
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 * 
	 * @return the error message
	 */
	public ErrorMessage getError() {
		if (hasError() == false) {
			return ErrorMessage.NO_ERROR;
		}		
	}

	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been an error.
	 * 
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an error
	 */
	public Object getReturnValue() {
		if (hasError() == true) {
			return null;
		}
	}
	
	/**
	* The constructor for when there is no error
	*/
	
	public ReturnObjectImpl(Object obj) {
		this.getError() = ErrorMessage.NO_ERROR;
	}
	
	/**
	* The constructor for when there has been an error
	*/
	
	public ReturnObjectImpl(ErrorMessage error) {
		this.getError() = error;
	}

	
}