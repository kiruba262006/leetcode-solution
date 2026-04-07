class Robot {
    private int w, h, per, pos;
    private boolean moved;

    public Robot(int width, int height) {
        this.w = width;
        this.h = height;
        this.per = 2 * (width + height - 2);
        this.pos = 0;
        this.moved = false;
    }
    
    public void step(int num) {
        this.moved = true;
        this.pos = (this.pos + num) % this.per;
    }
    
    public int[] getPos() {
        int p = this.pos;
        if (p < w) 
            return new int[]{p, 0};
        if (p < w + h - 1) 
            return new int[]{w - 1, p - (w - 1)};
        if (p < 2 * w + h - 2) 
            return new int[]{(w - 1) - (p - (w + h - 2)), h - 1};
        return new int[]{0, per - p};
    }
    
    public String getDir() {
        int p = this.pos;
        if (p == 0) 
            return moved ? "South" : "East";
        if (p < w) 
            return "East";
        if (p < w + h - 1) 
            return "North";
        if (p < 2 * w + h - 2) 
            return "West";
        return "South";
    }
}

