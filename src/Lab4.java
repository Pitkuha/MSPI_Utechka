import java.util.Iterator;
import java.util.Map;

// var. 1182
public class Lab4 {
    public static void main(String[] args) {
        C a = new C();
        C b = new H();
        H c = new H();
        a.y26();
        a.y6();
        b.y13();
        a.y38();
        c.y33();
        b.y24();
        b.y50();
        b.y28();
        a.y14();
        a.y20();
        c.y12(a);
        b.y12(b);
        b.y12(c);
        c.y1();
        c.y21();
        c.y43();
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(i != 10) {
                    i++;
                    try {
                        H d = new H();
                        d.y7();
                        Thread.sleep(9);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class C {
    int y47;
    int y11;
    int y3;
    int y2;
    int y34;
    long y31;
    long y42;
    long y36;
    java.io.ObjectOutputStream printWriter;
    java.io.ObjectOutputStream sampleOutput;
//    int[] y48 = {-2, 0, 0, 0, 1};
//    int[] y10 = {2, -1, -3, 2};
//    int[] y40 = {3, 3, 3, 0, -1};
    static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
    static int y39;
    static int y37;
//    static int y5;
//    static int y25;
//    static int y4;
    java.util.List<String> y16 = new java.util.ArrayList<>();
    java.util.List<String> y45 = new java.util.ArrayList<>();
//    java.util.List<String> y23 = new java.util.ArrayList<>();
    public C() {
        y47 = 8;
        y11 = 8;
        y3 = 4;
        y2 = 7;
        y34 = 7;
        y31 = 5L;
        y42 = 0L;
        y36 = 7L;
        try {
            printWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printWriter.txt"));
            sampleOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOutput.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (printWriter == null) printWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("printWriter.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", printWriter = " + printWriter);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (sampleOutput == null) sampleOutput = new java.io.ObjectOutputStream(new java.io.FileOutputStream("sampleOutput.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", sampleOutput = " + sampleOutput);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URI url = new java.net.URI(s);
            Iterator it = cache.entrySet().iterator();
            while(it.hasNext())
            {
                Map.Entry pair = (Map.Entry)it.next();
                java.net.URI tmp = (java.net.URI)pair.getKey();
                if(tmp.getAuthority().equals(url.getAuthority()))
                {
                    return cache.get(it);
                }
            }
            cache.put(url, new byte[1572864]);
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void y26() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWriter) {
                            printWriter.writeObject("метод y26 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            printWriter.flush();
                            printWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y6() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWriter) {
                            printWriter.writeObject("метод y6 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            printWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y13 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            sampleOutput.flush();
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y38() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y38 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y33() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y33 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y24() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y24 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void y50() {
        System.out.println("метод y50 в классе C");
        System.out.println(y39);
    }
    public static void y28() {
        System.out.println("метод y28 в классе C");
        System.out.println((y39 - 2));
    }
    public static void y14() {
        System.out.println("метод y14 в классе C");
        System.out.println(y37);
    }
    public static void y20() {
        System.out.println("метод y20 в классе C");
        System.out.println((y37 - 2));
    }
    public void y12(C r) {
        r.y26();
    }
    public void y12(H r) {
        r.y6();
    }
}
class H extends C {
    public H() {
        y47 = 3;
        y2 = 0;
        y34 = 4;
        y31 = 3L;
        y42 = 7L;
        y36 = 0L;
    }
    public void y26() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y26 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(12);
                            sampleOutput.flush();
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y13() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y13 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(14);
                            sampleOutput.flush();
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y38() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(sampleOutput) {
                            sampleOutput.writeObject("метод y38 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(8);
                            sampleOutput.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y33() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWriter) {
                            printWriter.writeObject("метод y33 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(14);
                            printWriter.flush();
                            printWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y24() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(printWriter) {
                            printWriter.writeObject("метод y24 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(7);
                            printWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y1() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(10);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y21() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(13);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y43() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(12);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void y50() {
        System.out.println("метод y50 в классе H");
        System.out.println(--y39);
    }
    public static void y28() {
        System.out.println("метод y28 в классе H");
        System.out.println(y37);
    }
    public static void y14() {
        System.out.println("метод y14 в классе H");
        System.out.println((y37 + 3));
    }
    public static void y20() {
        System.out.println("метод y20 в классе H");
        System.out.println(y37);
    }
    public void y41() {
        for(int i = 0; i < 7; i++) {
            this.y45.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y45.size());
        }
    }
    public void y32() {
        for(int i = 0; i < 9; i++) {
            this.y45.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y45.size());
        }
    }
    public void y8() {
        for(int i = 0; i < 7; i++) {
            this.y16.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y16.size());
        }
    }
    public void y7() {
        for(int i = 0; i < 7; i++) {
            this.y16.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y16.size());
        }
    }
    public void y12(C r) {
        r.y13();
    }
    public void y12(H r) {
        r.y38();
    }
}