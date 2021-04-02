public class PC {

        Case pcCase;
        MotherBoard pcMotherBoard;
        Monitor pcMonitor;

    PC(Case i, MotherBoard n, Monitor e){
            this.pcCase = i;
            this.pcMonitor = e;
            this.pcMotherBoard = n;
        }


        private void drawLogo(){
        pcMonitor.drawPixel(4,8,"Green");
        }

        public void description(){
            System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        }

        public void powerUp(){
        Case.pressPowerButton();
        drawLogo();
        pcMotherBoard.loadProgram("My First Program");
        }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase=" + pcCase +
                ", pcMotherBoard=" + pcMotherBoard +
                ", pcMonitor=" + pcMonitor +
                '}';
    }
}
