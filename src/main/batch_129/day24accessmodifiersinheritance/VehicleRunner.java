package main.batch_129.day24accessmodifiersinheritance;

public class VehicleRunner {
    //Example 1: Car turunde, rengi beyaz olan 54000km de 250000TL fiyati olan
    //           2020 model bir Honda Accord ariyorum.

    public static void main(String[] args) {

        HondaAccord endut=new HondaAccord(500000,2020);
        System.out.println("endut = " + endut);

//extends = extends ettiği class taki methodları kullanabilir
//extends olmadan = obje oluşturarak farklı class taki methodları kullanabiliriz

    }
}
