package yuhnovskaya.Lab6.A1;
//Создать иерархию классов, описывающих бытовую технику. Создать
//несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Household {
        private String maker;
        int wattege;
        private String state;
        public Household() {
        }
        public Household(String maker, int wattege, String state) {
            this.state = state;
            this.maker=maker;
            this.wattege=wattege;
        }
        public void isOn() {
            if (state == "on") {
                System.out.println(" is on");
            }
            else {
                System.out.println(" is Off");
            }
        }
        public String getMaker() {return maker;}
        public void setMaker() {this.maker=maker;}

        public int getWattege(){return wattege;}
        public void setWattege(){this.wattege=wattege;}
    }





