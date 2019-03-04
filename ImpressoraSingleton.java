
public class ImpressoraSingleton {
	private volatile static ImpressoraSingleton ImpressoraSingleton;
	
	private ImpressoraSingleton(){
	}
	public static    ImpressoraSingleton obterInstancia(){
		synchronized(ImpressoraSingleton.class){

		if(ImpressoraSingleton==null){
			ImpressoraSingleton=new ImpressoraSingleton();
		}
		}
		return ImpressoraSingleton;
	}
}
