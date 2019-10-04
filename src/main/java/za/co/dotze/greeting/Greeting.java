package za.co.dotze.greeting;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 04 Oct 2019
 */
public class Greeting {
    private final Long id;
    private final String context;

    public Greeting(Long id, String context) {
        this.id = id;
        this.context = context;
    }

    public Long getId() {
        return id;
    }

    public String getContext() {
        return context;
    }
}
