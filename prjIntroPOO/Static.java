public class Static {
    public static void main(String[] args) {
        //serie oSerie = new serie();
        serieLoad();
        serieWaiting();
    }   
    public static void serieLoad(){
        String signoLoad[]={"|", "/", "-", "\\"};
        for(int i = 0; i <= 100; i++){
            String c = signoLoad[i%4];
            System.out.print("\r Loading "+ c +" "+ i +" %");
            try {Thread.sleep(100);} 
            catch (InterruptedException ie) {}
        }
        System.out.println();
    } 
        public static void serieWaiting(){
        String signoWaiting[]={"0oo", "o0o", "oo0", "o0o"};
        for(int i = 0; i <= 100; i++){
            String c = signoWaiting[i%4];
            System.out.print("\r "+ c);
            try {Thread.sleep(500);} 
            catch (InterruptedException ie) {}
        }
    } 
    
}
