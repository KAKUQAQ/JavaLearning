package FieldAndMethod.Valuetransfer;

public class ValueTransferTest03 {
    public static void main(String[] args) {

        ValueTransferTest03 test = new ValueTransferTest03();
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println(data.m + "," + data.n);

        test.swap(data);
        System.out.println(data.m + "," + data.n);

    }
    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Data{
    int m;
    int n;
}
