package Imple;

public class MontreSubmersible implements Submersible {

	private boolean quartz;
	
	public MontreSubmersible(boolean quartz) {
		super();
		this.quartz = quartz;
	}

	public boolean isQuartz() {
		return quartz;
	}

	public void setQuartz(boolean quartz) {
		this.quartz = quartz;
	}

	@Override
	public int getProfondeurMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProfondeurMax(int profondeurMax) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "MontreSubmersible [quartz=" + quartz + "]";
	}
}
