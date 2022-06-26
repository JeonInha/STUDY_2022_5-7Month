class Mine {
	private boolean mine;
	private int arroundMineNum;
	int cellState;
	// 0-none, 1-?, 2-¡î 3-open
	
	public Mine(boolean mine, int arroundMineNum, int cellState) {
		this.mine = mine;
		this.arroundMineNum = arroundMineNum;
		this.cellState = cellState;
	}
	
	public boolean isMine() {
		return mine;
	}
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	public int getArroundMineNum() {
		return arroundMineNum;
	}

	public void setArroundMineNum(int arroundMineNum) {
		this.arroundMineNum = arroundMineNum;
	}
	public int getCellState() {
		return cellState;
	}
	public void setCellState(int cellState) {
		this.cellState = cellState;
	}
}