class PilaN<T extends Number>{
	 
     int i=0;
    
	 T in;
	 public void Insertar(T in){
        int vec[]=new int [5];
        this.in= in;
          vec[i]=(Integer) in;
          i++;
        	
        }

        public void Imprimir(){

        	for (i=0;i<5 ;i++ ) {

        		System.out.println(vec[i]);
        		
        	}
        }
	 }

  class Main{
	public static void main(String[] args) {

     PilaN<Number> numero= new PilaN<Number>();
	 	numero.Insertar(6);
	 	numero.Insertar(3);
	 	numero.Insertar(10);
	 	numero.Insertar(9);
	 	numero.Insertar(1);

	 	numero.Imprimir();
	 }
}
