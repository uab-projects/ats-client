package codes.uab.ats.soap_test;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWebServiceService service = new TestWebServiceService();
		TestWebService port = service.getTestWebServicePort();
		System.out.println(port.sayHello("Paco Paquito Poco Paquete"));
	}

}
