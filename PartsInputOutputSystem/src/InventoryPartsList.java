
public class InventoryPartsList {
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
	Part[] list = new Part[14];
	
	public InventoryPartsList (Part sensorPanel, Part JHMCSPanel, Part hydraulicPanel, Part bitControlPanel, Part instrumentPanel, 
			Part instrumentPanelKits, Part glareShield, Part wireHarnessRobins, Part wireHarnessUnicor, Part miscKit, 
			Part PAD, Part RIPR, Part EEMD, Part podAdapter) {
		
		this.sensorPanel = sensorPanel;
		this.JHMCSPanel = JHMCSPanel;
		this.hydraulicPanel = hydraulicPanel;
		this.bitControlPanel = bitControlPanel;
		this.instrumentPanel = instrumentPanel;
		this.instrumentPanelKits = instrumentPanelKits;
		this.glareShield = glareShield;
		this.wireHarnessRobins = wireHarnessRobins;
		this.wireHarnessUnicor = wireHarnessUnicor;
		this.miscKit = miscKit;
		this.PAD = PAD;
		this.RIPR = RIPR;
		this.EEMD = EEMD;
		this.podAdapter = podAdapter;
		
		list[0] = this.sensorPanel;
		list[1] = this.JHMCSPanel;
		list[2] = this.hydraulicPanel;
		list[3] = this.bitControlPanel;
		list[4] = this.instrumentPanel;
		list[5] = this.instrumentPanelKits;
		list[6] = this.glareShield;
		list[7] = this.wireHarnessRobins;
		list[8] = this.wireHarnessUnicor;
		list[9] = this.miscKit;
		list[10] = this.PAD;
		list[11] = this.RIPR;
		list[12] = this.EEMD;
		list[13] = this.podAdapter;
	}
	
	public Part[] getList() {
		return list;
	}
	
}
