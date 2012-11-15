package li.test.examples.json;

import java.util.List;

public class User {

    private int age;
    private String name;
    private List<String> messages;

    // getter and setter methods

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", " + "messages="
                + messages + "]";
    }
}
