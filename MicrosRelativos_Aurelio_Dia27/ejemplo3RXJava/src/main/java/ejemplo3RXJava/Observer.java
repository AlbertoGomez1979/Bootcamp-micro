package ejemplo3RXJava;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;



public class Observer {

	public static void main(String[] args) {
		
		//METODO OBSERVABLE CON 3 MENSAJES
		Observable<String> messageSender = Observable.just("Mensaje1", "Mensaje2", "Mensaje3");
		
		//CREAR 2 OBJETOS OBSERVER
		messageSender.subscribe(new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observer1, subscrito");
            }
            @Override
            public void onNext(Object t) {
            	System.out.println("Observer1, recibido");
            }
            @Override
            public void onError(Throwable e) {
            	System.out.println("Observer1, error" + e.getMessage());
            }
            @Override
            public void onComplete() {
            	System.out.println("Observer1, completado");
            }
        });
		
		messageSender.subscribe(new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observer2, subscrito");
            }
            @Override
            public void onNext(Object t) {
            	System.out.println("Observer2, recibido");
            }
            @Override
            public void onError(Throwable e) {
            	System.out.println("Observer2, error" + e.getMessage());
            }
            @Override
            public void onComplete() {
            	System.out.println("Observer2, completado");
            }
        });
		
			
		
			
		
			
		

	}

}
