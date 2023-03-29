package EJEMPLOS.EJEMPLO_4;
    public class COCHE {
        private String modelo;
        private int año;
        private String color;

        public COCHE(String modelo, int año, String color) {
            this.modelo = modelo;
            this.año = año;
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

