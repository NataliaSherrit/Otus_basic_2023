package homework_project;

public class Roubles  extends Currency{

        private final String[] forms = new String[]{"рубль","рубля","рублей"};

        public Roubles(String name) {
            super(name);
        }

        @Override
        public String[] getForms() {
            return forms;
        }

}
