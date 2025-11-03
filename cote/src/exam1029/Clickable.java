package exam1029;

public interface Clickable {
	Clickable c1 = new Image(a.jpg);
	Clickable c2 = new button("OK");
	
	c1.click();
	c2.clcck();
	
	if( c1 instanceof Image) {
		Image i = (Image) c1;
		System.out.println(i.url);

	}
	if( c2 instanceof Button ) {
		Button b = (Button);
	}

	
	
}
