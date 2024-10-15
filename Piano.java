
     public class Piano extends Instruments {
        private String pianoType;

        public String getPianoType() {
            return this.pianoType;
        }
        public void setPianoType() {
            this.pianoType = pianoType;
        }

        public Piano() {
            pianoType="";
        }
        public Piano(String name, double price, String pianoType) {
            super(name, price);
            this.pianoType=pianoType;
        }

        @Override
        public void print() {
            System.out.println("Jenis Piano: "+pianoType);
        }
        }

     

