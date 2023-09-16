package Lecture1_OOPS1;

public class Polynomial {
    int[] arr;
    int length = 0;

    public void setCoefficient(int degree, int coeff){
        if(degree<length){
            arr[degree]=coeff;
        }else{
            int[]  newarr = new int[2*degree];
            for(int i=0;i<length;i++){
                newarr[i]=arr[i];
            }
            arr = newarr;
            length=arr.length;
            arr[degree]=coeff;
        }

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(i==length-1){
                if(arr[i]!=0){
                    System.out.println(arr[i]+"x"+i);
                }
            }else {
                if(arr[i]!=0){
                    System.out.print(arr[i] + "x" + i + " ");
                }
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        int l = Math.max(this.length,p.length);
        Polynomial p1 = order(this,l);
        //   this.length=l;
        Polynomial p2 = order(p,l);
        int[] ans = new int[l];
        for(int i=0;i<l;i++){
            ans[i]=p1.arr[i]+p2.arr[i];
        }
        this.arr = ans;
        return this;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        int l = Math.max(this.length,p.length);
        Polynomial p1 = order(this,l);
        //  this.length=l;
        Polynomial p2 = order(p,l);
        int[] ans = new int[l];
        for(int i=0;i<l;i++){
            ans[i]=p1.arr[i]-p2.arr[i];
        }
        this.arr = ans;
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        int l = Math.max(this.length,p.length);
//        Polynomial p1 = order(this,l);
//        Polynomial p2 = order(p,l);
        int[] arr1 =  new int[l*l];
        for(int i=0;i<this.length;i++){
            if(this.arr[i]==0){
                continue;
            }
            for(int j=0;j<p.length;j++){
                if(p.arr[j]==0){
                    continue;
                }
                arr1[i+j]=arr1[i+j]+(this.arr[i]*p.arr[j]);
            }

        }
        this.arr = arr1;
        return this;
    }

    public Polynomial order(Polynomial p,int l) {
        if (p.length >= l) {
            return p;
        }
        int[] ans = new int[l];
        for (int i = 0; i < p.length; i++) {
            ans[i]=p.arr[i];
        }
        for(int i=p.length-1;i<l;i++){
            ans[i]=0;
        }
        Polynomial a = new Polynomial();
        a.arr = ans;
        return a;
    }
}
