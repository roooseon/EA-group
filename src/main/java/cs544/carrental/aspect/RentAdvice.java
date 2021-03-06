package cs544.carrental.aspect;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.slf4j.Logger;
//import org.apache.log4j.Logger;
import java.util.logging.Logger;
//import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Aspect
@Component
public class RentAdvice {

	Logger logger = Logger.getLogger("MyLog");
	private FileHandler fh = null;

	public void rentLogSystem(String msg) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		try {

			// This block configure the logger with handler and formatter
			fh = new FileHandler("C:/RentLogFile//MyLogFile.log");
			logger.addHandler(fh);
			// logger.setLevel(Level.ALL);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			// the following statement is used to log any messages
			logger.info(msg + " at current time :" + dateFormat.format(date));

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After("execution(public * cs544.carrental.rent.RentController.*(..)))")
	public void traceAfterMethod(JoinPoint joinpoint) throws IOException {
		String method = joinpoint.getSignature().getName();
	
		System.out.println("**************************************");

		rentLogSystem(method + " action has been performed for current store");
			}

	@Around("execution(public * cs544.carrental.rent.RentController.*(..)))")
	public Object invoke(ProceedingJoinPoint call) throws Throwable {
		StopWatch sw = new StopWatch();
		sw.start(call.getSignature().getName());
		Object retVal = call.proceed();
		sw.stop();
		long totaltime = sw.getLastTaskTimeMillis();
		
		rentLogSystem("Time to execute (in Mili second) " + "is :" + totaltime);
		return retVal;
	}

	public void sendMailEveryHour() {

		try {
			
			rentLogSystem("Sending mail of product report to manager in very hour :");
			
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}
}
