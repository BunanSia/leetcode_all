// https://leetcode.com/problems/design-parking-system

class ParkingSystem {
    boolean result;
    int[] array=new int[3];
    public ParkingSystem(int big, int medium, int small) {
        array[0]=big;
        array[1]=medium;
        array[2]=small;
    }
    
    public boolean addCar(int carType) {

        if(carType==1){
            if(array[0]==0)
            result=false;
            else{
                array[0]--;
                result=true;
            }
        }   
        else if(carType==2){
            if(array[1]==0)
            result=false;
            else{
                array[1]--;
                result=true;
            }
        }
        else if(carType==3){
            if(array[2]==0)
            result=false;
            else{
                array[2]--;
                result=true;
            }
        }
        return result;
    }    
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */