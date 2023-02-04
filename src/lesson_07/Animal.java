package lesson_07;

    public abstract class Animal {
        protected String info = "INFO";
        protected MessageType messageType;

        abstract void abstractSay(); // Этот метод обязаны релаизовать все наслденики

        static void staticSay() {
            System.out.println("Статик привет");
        }

        void say() {
            System.out.println("Привет");
            System.out.println(info);
        }

        public MessageType getMessageType() {
            return messageType;
        }
    }

