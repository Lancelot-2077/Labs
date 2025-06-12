package Lab9;

class Notification {
    void send(String msg) {
        System.out.println("Sending generic: " + msg);
    }
}

class EmailNotification extends Notification {
    void send(String msg) {
        System.out.println("Sending email: " + msg);
    }
}

class SMSNotification extends Notification {
    void send(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}

class PushNotification extends Notification {
    void send(String msg) {
        System.out.println("Sending push: " + msg);
    }
}

class No {
    public static void main(String[] args) {
        Notification[] list = {
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        };

        for (Notification n : list) {
            n.send("Hello, user!");
        }
    }
}