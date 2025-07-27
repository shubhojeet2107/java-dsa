package stack;

public class dynamicStack extends customStack{
    
    public dynamicStack(){
        super();
    }

    public dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int value){
         // this takes care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for(int i=0; i< data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(value);
    }
}
