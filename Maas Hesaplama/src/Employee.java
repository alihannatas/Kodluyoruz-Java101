public class Employee {

        String name;
        double salary;
        double workHours;
        int hireYear;


        Employee(String name,double salary,double workHours,int hireYear){

                this.name=name;
                this.salary=salary;
                this.workHours=workHours;
                this.hireYear=hireYear;
        }

        double tax(){
                double tax1=0;
                if(this.salary > 1000){

                        tax1=salary * 0.03;
                        return tax1;
                }

               else{
                        System.out.println("Vergi uygulanmadi.");
                        return tax1;
                }
        }

        double bonus(){

                double prim=0;
                if(this.workHours > 40){

                        prim=(workHours-40) * 30;
                        return prim;

                }
               return prim;
        }

        double  raiseSalary(){

                        int year= 2021- this.hireYear;
                        double artis=0;
                        if(year < 10){

                               artis= this.salary * 0.05;
                               return artis;
                        }
                        else if(year>10 && year<20){
                                artis = this.salary*0.1;
                                return artis;
                        }
                        else {

                                artis=this.salary * 0.15;
                                return artis;
                        }

        }


        void toStringg(){

                System.out.println("Adı :" +this.name);
                System.out.println("Maasi:" + this.salary);
                System.out.println("Calisma saati:"+ workHours);
                System.out.println("Baslangic:"+this.hireYear);
                System.out.println("Vergi:" + tax());
                System.out.println("Bonus:" + bonus());
                System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (salary + tax() +bonus() ) );
                System.out.println("Toplam maas:" + (salary + tax() +bonus() + raiseSalary() ) );


}
}