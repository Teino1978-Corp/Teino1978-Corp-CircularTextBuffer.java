        public final static class CircBuf {

                private ArrayList<String> circArray;
                private int size = 6;

                public CircBuf(final int size) {
                        this.size = size;
                        circArray = new ArrayList<String>(this.size);
                }

                public CircBuf() {
                        circArray = new ArrayList<String>(this.size);
                }

                public void addStr(final String txt) {
                        if (circArray.size() == size) {
                                circArray.remove(0);
                        }
                        circArray.add(txt);
                }

                public String[] getStrs() {
                        return circArray.toArray(new String[circArray.size()]);
                }

                public int getMaxSize() {
                        return size;
                }

                public int getSize() {
                        return circArray.size();
                }
        }


++++++++++++

//global variable
CircBuf dBuf = new CircBuf(10);
...
//ie. in a banking method
dBuf.addStr("Leaving bank");

+++++++++++++

...
                int px = 10;
                int py = 100;
                int addY = 14;
                if (showDebugInfo) {
                        if (dBuf.getSize() > 0) {
                                final String[] dstr = dBuf.getStrs();
                                for (String s : dstr) {
                                        g.drawString(s, px, py += addY);
                                }
                        }
                }
...