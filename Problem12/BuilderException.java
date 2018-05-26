package Problem12;

public class BuilderException extends java.lang.Exception {

    String message;

    public BuilderException(String message)
    {
        this.message = "Value [" + message + "] not set.";
    }

}
