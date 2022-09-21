package be.vdab.array;

//public class Array {
//    public static void main(String[] args) {
//        var arr = new int[]{
//                (int) (Math.round(Math.random() * 100)),
//                (int) (Math.round(Math.random() * 100)),
//                (int) (Math.round(Math.random() * 100)),
//                (int) (Math.round(Math.random() * 100)),
//                (int) (Math.round(Math.random() * 100)),
//        };
//        System.out.println(arr[4]);
//    }
//}


//Herneem vorige opdracht maar realiseer nu de oplossing door gebruik te maken van iteraties.

public class Array_van_5 {
    public static void main(String[] args) {
        var arr = new int[5];
        for(var i=0;i<arr.length;i++){
            arr[i]=(int) (Math.round(Math.random()*100));
        }
    }
}
