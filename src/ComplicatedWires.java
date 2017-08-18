public class ComplicatedWires {
	private Bomb bomb;
	private String wire;
	
	public ComplicatedWires(Bomb bomb, String wire) {
		this.bomb = bomb;
		this.wire = wire.trim().toUpperCase();
	}
	
	public String solve() {
		if (wire.contains("R")) {
			if (wire.contains("B")) {
				if (wire.contains("L")) {
					if (wire.contains("S")) {
						// RBLS
						return "DO NOT CUT";
					} else {
						// RBL
						if (bomb.lastSerialDigitIsEven()) {
							return "CUT";
						} else {
							return "DO NOT CUT";
						}
					}
				} else if (wire.contains("S")) {
					// RBS
					if (bomb.hasParallelPort()) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
				} else {
					// RB
					if (bomb.lastSerialDigitIsEven()) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
				}
			} else if (wire.contains("L")) {
				if (wire.contains("S")) {
					// RLS
					if (bomb.getBatteryCount() >= 2) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
				} else {
					// RL
					if (bomb.getBatteryCount() >= 2) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
				}
			} else if (wire.contains("S")) {
				// RS
				if (bomb.getBatteryCount() >= 2) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
			} else {
				// R
				if (bomb.lastSerialDigitIsEven()) {
					return "CUT";
				} else {
					return "DO NOT CUT";
				}
			}
		} else if (wire.contains("B")) {
			if (wire.contains("L")) {
				if (wire.contains("S")) {
					// BLS
					if (bomb.hasParallelPort()) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
				} else {
					// BL
					if (bomb.hasParallelPort()) {
						return "CUT";
					} else {
						return "DO NOT CUT";
					}
				}
			} else if (wire.contains("S")) {
				// BS
				return "DO NOT CUT";
			} else {
				// B
				if (bomb.lastSerialDigitIsEven()) {
					return "CUT";
				} else {
					return "DO NOT CUT";
				}
			}
		} else if (wire.contains("L")) {
			if (wire.contains("S")) {
				// LS
				if (bomb.getBatteryCount() >= 2) {
					return "CUT";
				} else {
					return "DO NOT CUT";
				}
			} else {
				// L
				return "DO NOT CUT";
			}
		} else if (wire.contains("S")) {
			// S
			return "CUT";
		} else {
			// W
			return "CUT";
		}
	}
}
