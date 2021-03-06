
public class InventoryBuilder {
	Part sensorPanel;
	Part JHMCSPanel;
	Part hydraulicPanel;
	Part bitControlPanel;
	Part instrumentPanel;
	Part instrumentPanelKits;
	Part glareShield;
	Part wireHarnessRobins;
	Part  wireHarnessUnicor;
	Part miscKit;
	Part PAD;
	Part RIPR;
	Part EEMD;
	Part podAdapter;
	
	public InventoryBuilder() {}
	
	public InventoryBuilder setSensorPanel(String name, int numMonths) {
		sensorPanel = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setJHMCSPanel(String name, int numMonths) {
		JHMCSPanel = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setHydraulicPanel(String name, int numMonths) {
		hydraulicPanel = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setBitControlPanel(String name, int numMonths) {
		bitControlPanel = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setInstrumentPanel(String name, int numMonths) {
		instrumentPanel = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setInstrumentPanelKits(String name, int numMonths) {
		instrumentPanelKits = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setGlareShield(String name, int numMonths) {
		glareShield = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setWireHarnessRobins(String name, int numMonths) {
		wireHarnessRobins = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setWireHarnessUnicor(String name, int numMonths) {
		wireHarnessUnicor = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setMiscKit(String name, int numMonths) {
		miscKit = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setPAD(String name, int numMonths) {
		PAD = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setRIPR(String name, int numMonths) {
		RIPR = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setEEMD(String name, int numMonths) {
		EEMD = new Part(name, numMonths);
		return this;
	}
	
	public InventoryBuilder setPodAdapter(String name, int numMonths) {
		podAdapter = new Part(name, numMonths);
		return this;
	}
	
	public Part getSensorPanel() {
		return sensorPanel;
	}
	
	public Part getJHMCSPanel() {
		return JHMCSPanel;
	}
	
	public Part getHydraulicPanel() {
		return hydraulicPanel;
	}
	
	public Part getBitControlPanel() {
		return bitControlPanel;
	}
	
	public Part getInstrumentPanel() {
		return instrumentPanel;
	}
	
	public Part getInstrumentPanelKits() {
		return instrumentPanelKits;
	}
	
	public Part getGlareShield() {
		return glareShield;
	}
	
	public Part getWireHarnessRobins() {
		return wireHarnessRobins;
	}
	
	public Part getWireHarnessUnicor() {
		return wireHarnessUnicor;
	}
	
	public Part getMiscKit() {
		return miscKit;
	}
	
	public Part getPAD() {
		return PAD;
	}
	
	public Part getRIPR() {
		return RIPR;
	}
	
	public Part getEEMD() {
		return EEMD;
	}
	
	public Part getPodAdapter() {
		return podAdapter;
	}
	
	
	
	public InventoryPartsList build() {
		return new InventoryPartsList(sensorPanel, JHMCSPanel, hydraulicPanel, bitControlPanel, instrumentPanel, instrumentPanelKits, 
				glareShield, wireHarnessRobins, wireHarnessUnicor, miscKit, PAD, RIPR, EEMD, podAdapter);
	}

}
