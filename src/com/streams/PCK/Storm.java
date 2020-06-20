package com.streams.PCK;

 class Storm {

	 protected double eyeRadius;
	 protected double eyePositionX;
	 protected double eyePositionY;
	 
	public boolean isInEyeOfTheStorm(double positionX, double positionY) {
        double distance = Math.sqrt(Math.pow(positionX - eyePositionX, 2) +
                                    Math.pow(positionY - eyePositionY, 2));
        return distance < eyeRadius;
    }

	 public Storm(double eyeRadius, double eyePositionX, double eyePositionY) {
			this.eyeRadius = eyeRadius;
			this.eyePositionX = eyePositionX;
			this.eyePositionY = eyePositionY;
	    }
	 
	 public double amountOfRain() {
	        return eyeRadius * 20;
	    }
	    
		public double getEyeRadius() {
			return eyeRadius;
		}

		public double getEyePositionX() {
			return eyePositionX;
		}

		public double getEyePositionY() {
			return eyePositionY;
		}
		
}
