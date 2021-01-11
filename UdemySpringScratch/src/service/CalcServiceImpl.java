package service;

public class CalcServiceImpl implements CalcService{

    @Override
    public int sumOf(int x, int y) {
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }
}
