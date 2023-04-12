package Task1;

public class Notebook {

        String name;
        int ram;
        int memory;
        String os;
        String color;
        String cpu;
        int price;

        Notebook(){}

        Notebook(String name, int ram, int memory, String os, String color, String cpu, int price){
            this.name = name;
            this.ram = ram;
            this.memory = memory;
            this.os = os;
            this.color = color;
            this.cpu = cpu;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " | " + ram + " ГБ | " + memory + " ГБ | " + os + " | " + color + " | " + cpu + " | "
                    + price + " рублей";
        }

        void Print(){
            System.out.println(name + " | " + ram + " ГБ | " + memory + " ГБ | " + os + " | " + color + " | " + cpu
                    + " | " + price + " рублей");
        }

        @Override
        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            Notebook other = (Notebook) obj;
            if (this.name.equals(other.name) && this.color.equals(other.color)
                    && this.os.equals(other.os) && this.cpu.equals(other.cpu)
                    && this.ram == other.ram && this.memory == other.memory
                    && this.price == other.price) return true;
            return false;
        }
        @Override
        public int hashCode() {
            int res = this.name.hashCode() + this.color.hashCode() + this.os.hashCode() + this.cpu.hashCode()
                    + this.cpu.hashCode();
            return res;
        }

    }
